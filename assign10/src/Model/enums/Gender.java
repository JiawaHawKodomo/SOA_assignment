package Model.enums;

/**
 * @author Shuaiyu Yao
 * @create 2019-03-12 16:10
 */
public enum Gender {

    MALE("男"), FEMALE("女");

    private String text;

    Gender(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
