package Service.Impl;

import Error.*;
import Service.Login;
import Model.enums.Identity;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


@WebService(endpointInterface = "Service.Login")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class LoginImpl implements Login{


    private static Map<String, String> underGraduateAccount = new HashMap<>();
    private static Map<String, String> postGraduateAccount = new HashMap<>();
    private static Map<String, String> teacherAccount = new HashMap<>();

    static {
        underGraduateAccount.put("161250090@smail.nju.edu.cn", "123456");
        underGraduateAccount.put("161250088@smail.nju.edu.cn", "666");

        postGraduateAccount.put("MG1832004@smail.nju.edu.cn", "888");

        teacherAccount.put("bj@nju.edu.cn", "666");
        teacherAccount.put("lq@nju.edu.cn", "888");
    }

    @Override
    public boolean loginConfirm(String email, String password) throws IdentificationFailureError{
        switch( identifyConfirm(email) ){
            case UNDERGRADUATE:
                if( underGraduateAccount.get(email).equals(password) ){
                    return true;
                }
                break;
            case POSTGRADUATE:
                if( postGraduateAccount.get(email).equals(password) ){
                    return true;
                }
                break;
            case TEACHER:
                if( teacherAccount.get(email).equals(password) ){
                    return true;
                }
                break;
            case WRONGEMAIL:
                System.out.println("wrong email!");
                throw new IdentificationFailureError();
        }
        throw new IdentificationFailureError();
    }


    private Identity identifyConfirm(String email){
//		underGraduateStuEmail is made of nine numbers
        String underGraduateStuEmailRegex = "^(\\d{9})@smail\\.nju\\.edu\\.cn$";
        Pattern patternUG = Pattern.compile(underGraduateStuEmailRegex);
        Matcher matcherUG = patternUG.matcher(email);
//		postGraduateStuEmail is made of that start with two letters and seven numbers
        String postGraduateStuEmailRegex = "^([A-Z]{2})(\\d){7}@smail\\.nju\\.edu\\.cn$";
        Pattern patternPG = Pattern.compile(postGraduateStuEmailRegex);
        Matcher matcherPG = patternPG.matcher(email);
//		teacherEmail is made of letter or number at least one
        String teacherEmailRegex = "^([a-zA-Z0-9]+)@nju\\.edu\\.cn$";
        Pattern patternT = Pattern.compile(teacherEmailRegex);
        Matcher matcherT = patternT.matcher(email);
        if( matcherUG.matches() ){
            return Identity.UNDERGRADUATE;
        }
        else if( matcherPG.matches() ){
            return Identity.POSTGRADUATE;
        }
        else if( matcherT.matches() ){
            return Identity.TEACHER;
        }
        else {
            return Identity.WRONGEMAIL;
        }
    }
}
