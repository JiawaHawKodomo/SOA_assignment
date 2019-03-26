package Model;

import javax.xml.bind.annotation.*;
import java.math.BigInteger;

/**
 * @author Shuaiyu Yao
 * @create 2019-03-12 10:10
 */
@XmlRootElement(name = "学生", namespace = "http://jw.nju.edu.cn/schema/student")
@XmlAccessorOrder(XmlAccessOrder.ALPHABETICAL)
@XmlType(name = "学生类型", namespace = "http://jw.nju.edu.cn/schema/student"
        , propOrder = {"personInfo", "studentId", "grade", "scoreList"})
public class Student {

    @XmlElement(name = "基本信息", namespace = "http://jw.nju.edu.cn/schema/student")
    private PersonInfo personInfo;
    @XmlElement(name = "学号", namespace = "http://jw.nju.edu.cn/schema/student")
    private String studentId;
    @XmlElement(name = "入学年级", namespace = "http://jw.nju.edu.cn/schema/student")
    private BigInteger grade;
    @XmlElement(name = "课程成绩列表", namespace = "http://jw.nju.edu.cn/schema/student")
    private ScoreList scoreList;

    @XmlTransient
    public PersonInfo getPersonInfo() {
        return personInfo;
    }

    public void setPersonInfo(PersonInfo personInfo) {
        this.personInfo = personInfo;
    }

    @XmlTransient
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    @XmlTransient
    public BigInteger getGrade() {
        return grade;
    }

    public void setGrade(BigInteger grade) {
        this.grade = grade;
    }

    @XmlTransient
    public ScoreList getScoreList() {
        return scoreList;
    }

    public void setScoreList(ScoreList scoreList) {
        this.scoreList = scoreList;
    }
}
