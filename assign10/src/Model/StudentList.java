package Model;

import javax.xml.bind.annotation.*;
import java.util.List;

/**
 * @author Shuaiyu Yao
 * @create 2019-03-12 10:20
 */
@XmlRootElement(name = "学生列表", namespace = "http://jw.nju.edu.cn/schema/studentlist")
@XmlAccessorOrder(XmlAccessOrder.ALPHABETICAL)
@XmlType(name = "学生列表类型", namespace = "http://jw.nju.edu.cn/schema/studentlist"
        , propOrder = {"students"})
public class StudentList {

    @XmlElement(name = "学生", namespace = "http://jw.nju.edu.cn/schema/studentlist")
    private List<Student> students;

    @XmlTransient
    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
