package elements;

import javax.xml.bind.annotation.*;

/**
 * @author Shuaiyu Yao
 * @create 2019-03-12 9:59
 */
@XmlType(name = "成绩类型", propOrder = {"studentId", "grade"}, namespace = "http://jw.nju.edu.cn/schema/scorelist")
@XmlAccessorOrder(XmlAccessOrder.ALPHABETICAL)
public class ScoreType {

    @XmlElement(name = "学号", namespace = "http://jw.nju.edu.cn/schema/scorelist")
    private String studentId;
    @XmlElement(name = "得分", namespace = "http://jw.nju.edu.cn/schema/scorelist")
    private Integer grade;

    @XmlTransient
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    @XmlTransient
    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }
}
