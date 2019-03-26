package Model;

import javax.xml.bind.annotation.*;

/**
 * @author Shuaiyu Yao
 * @create 2019-03-10 15:58
 */
@XmlRootElement(name = "课程", namespace = "http://jw.nju.edu.cn/schema/course")
@XmlAccessorOrder(XmlAccessOrder.ALPHABETICAL)
@XmlType(name = "课程类型",
        namespace = "http://jw.nju.edu.cn/schema/course",
        propOrder = {"id", "name", "credit", "period"})
public class Course {

    @XmlElement(name = "课程编号", namespace = "http://jw.nju.edu.cn/schema/course")
    private String id;
    @XmlElement(name = "课程名称", namespace = "http://jw.nju.edu.cn/schema/course")
    private String name;
    @XmlElement(name = "学分", namespace = "http://jw.nju.edu.cn/schema/course")
    private int credit;
    @XmlElement(name = "学时", namespace = "http://jw.nju.edu.cn/schema/course")
    private int period;

    @XmlTransient
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @XmlTransient
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlTransient
    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    @XmlTransient
    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }
}
