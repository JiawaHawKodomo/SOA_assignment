package elements;

import javax.xml.bind.annotation.*;
import java.util.List;

/**
 * @author Shuaiyu Yao
 * @create 2019-03-12 9:46
 */
@XmlAccessorOrder(XmlAccessOrder.ALPHABETICAL)
@XmlType(name = "课程成绩类型", propOrder = {"scoreTypes"})
public class Score {

    @XmlAttribute(name = "课程编号")
    private String courseId;
    @XmlAttribute(name = "成绩性质")
    private String type;
    @XmlElement(name = "成绩", namespace = "http://jw.nju.edu.cn/schema/scorelist")
    private List<ScoreType> scoreTypes;

    @XmlTransient
    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    @XmlTransient
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @XmlTransient
    public List<ScoreType> getScoreTypes() {
        return scoreTypes;
    }

    public void setScoreTypes(List<ScoreType> scoreTypes) {
        this.scoreTypes = scoreTypes;
    }
}
