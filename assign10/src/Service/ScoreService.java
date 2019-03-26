package Service;

import Model.Score;
import Model.ScoreList;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import Error.*;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface ScoreService {
    @WebMethod
    @WebResult(name = "ScoreList")
    ScoreList queryStudentScores(@WebParam String studentId) throws NoFoundStudentError, InvalidDataError;

    @WebMethod
    @WebResult(name = "ScoreList")
    ScoreList updateStudentScores(@WebParam Score scores) throws NoFoundScoreTypeError, InvalidDataError;

    @WebMethod
    @WebResult(name = "ScoreList")
    ScoreList addStudentScores(@WebParam Score scores) throws DuplicateInsertScoreError, InvalidDataError;

    @WebMethod
    @WebResult(name = "ScoreList")
    ScoreList deleteStudentScores(@WebParam Score scores) throws NoFoundScoreTypeError, InvalidDataError;

}
