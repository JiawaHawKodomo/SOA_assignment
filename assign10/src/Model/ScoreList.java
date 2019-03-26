package Model;

import javax.xml.bind.annotation.*;
import java.util.List;

/**
 * @author Shuaiyu Yao
 * @create 2019-03-11 18:58
 */
@XmlRootElement(name = "课程成绩列表", namespace = "http://jw.nju.edu.cn/schema/scorelist")
@XmlAccessorOrder(XmlAccessOrder.ALPHABETICAL)
@XmlType(name = "课程成绩列表类型",
        namespace = "http://jw.nju.edu.cn/schema/scorelist",
        propOrder = {"scores"})
public class ScoreList {


    @XmlElement(name = "课程成绩", namespace = "http://jw.nju.edu.cn/schema/scorelist")
    private List<Score> scores;

    @XmlTransient
    public List<Score> getScores() {
        return scores;
    }

    public void setScores(List<Score> scores) {
        this.scores = scores;
    }
}
