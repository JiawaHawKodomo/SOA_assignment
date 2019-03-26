package Model;

import javax.xml.bind.annotation.*;
import java.util.Date;

/**
 * @author Shuaiyu Yao
 * @create 2019-03-11 18:53
 */
@XmlRootElement(name = "个人信息", namespace = "http://jw.nju.edu.cn/schema/personinfo")
@XmlAccessorOrder(XmlAccessOrder.ALPHABETICAL)
@XmlType(name = "个人信息类型",
        namespace = "http://jw.nju.edu.cn/schema/personinfo",
        propOrder = {"name", "gender", "idNumber", "birthday", "department"})
public class PersonInfo {

    @XmlElement(name = "姓名", namespace = "http://jw.nju.edu.cn/schema/personinfo")
    private String name;
    @XmlElement(name = "性别", namespace = "http://jw.nju.edu.cn/schema/personinfo")
    private String gender;
    @XmlElement(name = "身份证号", namespace = "http://jw.nju.edu.cn/schema/personinfo")
    private String idNumber;
    @XmlElement(name = "出生日期", namespace = "http://jw.nju.edu.cn/schema/personinfo")
    private Date birthday;
    @XmlElement(name = "所属部门", namespace = "http://jw.nju.edu.cn/schema/personinfo")
    private Department department;

    @XmlTransient
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlTransient
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @XmlTransient
    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    @XmlTransient
    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @XmlTransient
    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
