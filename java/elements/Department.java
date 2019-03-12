package elements;

import javax.xml.bind.annotation.*;

/**
 * @author Shuaiyu Yao
 * @create 2019-03-11 18:47
 */
@XmlRootElement(name = "部门", namespace = "http://jw.nju.edu.cn/schema/department")
@XmlAccessorOrder(XmlAccessOrder.ALPHABETICAL)
@XmlType(name = "部门类型",
        namespace = "http://jw.nju.edu.cn/schema/department",
        propOrder = {"id", "name", "superiorDepartment", "type"})
public class Department {

    @XmlElement(name = "部门编号", namespace = "http://jw.nju.edu.cn/schema/department")
    private int id;
    @XmlElement(name = "部门名称", namespace = "http://jw.nju.edu.cn/schema/department")
    private String name;
    @XmlElement(name = "上级部门", namespace = "http://jw.nju.edu.cn/schema/department")
    private Department superiorDepartment;
    @XmlElement(name = "部门类型", namespace = "http://jw.nju.edu.cn/schema/department")
    private String type;

    @XmlTransient
    public int getId() {
        return id;
    }

    public void setId(int id) {
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
    public Department getSuperiorDepartment() {
        return superiorDepartment;
    }

    public void setSuperiorDepartment(Department superiorDepartment) {
        this.superiorDepartment = superiorDepartment;
    }

    @XmlTransient
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
