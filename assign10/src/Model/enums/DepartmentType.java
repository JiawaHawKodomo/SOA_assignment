package Model.enums;

/**
 * @author Shuaiyu Yao
 * @create 2019-03-12 16:10
 */
public enum DepartmentType {

    DEPARTMENT("院系部门"), SPECIALITY("行政部门"), ADMINISTRATIVE("专业"), OTHER("其他");

    private String text;

    DepartmentType(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

}
