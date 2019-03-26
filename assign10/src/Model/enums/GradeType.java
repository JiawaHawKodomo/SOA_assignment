package Model.enums;

/**
 * @author Shuaiyu Yao
 * @create 2019-03-12 16:16
 */
public enum GradeType {

    USUAL("平时成绩"), HOMEWORK("作业成绩"), MIDTERM("期中成绩"), ENDTERM("期末成绩"), OVERALL("总评成绩");

    private String text;

    GradeType(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
