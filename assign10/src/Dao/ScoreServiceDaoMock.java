package Dao;

import Model.*;

import java.util.ArrayList;
import java.util.List;

public class ScoreServiceDaoMock {

    private static List<Score> scores= new ArrayList<>();

    static {
        List<ScoreType> scoreTypes=new ArrayList<>();
        ScoreType st1=new ScoreType();
        st1.setGrade(80);
        st1.setStudentId("161250090");

        ScoreType st2=new ScoreType();
        st2.setGrade(80);
        st2.setStudentId("161250089");

        scoreTypes.add(st1);
        scoreTypes.add(st2);

        Score s=new Score();
        s.setType("平时作业");
        s.setCourseId("00001");
        s.setScoreTypes(scoreTypes);

        scores.add(s);

    }

    public ScoreList queryStudentScores(String studentId){
        InfoServiceDaoMock dao=new InfoServiceDaoMock();
        return dao.queryStudentInfo(studentId).getScoreList();
    }

    public ScoreList updateStudentScores(Score score){
        ScoreList scoreList = new ScoreList();
        for(int j=0;j<scores.size();j++){
            if(scores.get(j).getCourseId().equals(score.getCourseId())){
                if(scores.get(j).getType().equals(score.getType())){
                    scores.set(j,score);
                    scoreList.setScores(scores);
                    return scoreList;
                }
            }
        }
        return null;
    }


    public ScoreList addStudentScores(Score score){
        ScoreList scoreList = new ScoreList();
        for(int j=0;j<scores.size();j++){
            if(scores.get(j).getCourseId().equals(score.getCourseId())){
                if(scores.get(j).getType().equals(score.getType())){
                    return null;
                }
            }
        }
        scores.add(score);
        scoreList.setScores(scores);
        return scoreList;
    }

    public ScoreList deleteStudentScores(Score score){
        ScoreList scoreList = new ScoreList();
        for(int i=0;i<scores.size();i++){
            if(scores.get(i).getCourseId().equals(score.getCourseId())){
                if(scores.get(i).getType().equals(score.getType())){
                    scores.remove(i);
                    scoreList.setScores(scores);
                    return scoreList;
                }
            }
        }
        return null;
    }
}
