package Service.Impl;

import Dao.ScoreServiceDaoMock;
import Error.InvalidDataError;
import Error.*;
import Model.Score;
import Model.ScoreList;
import Service.ScoreService;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;


@WebService(endpointInterface = "Service.ScoreService")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class ScoreServiceImpl implements ScoreService {

    private ScoreServiceDaoMock scoreDao = new ScoreServiceDaoMock();

    @Override
    public ScoreList queryStudentScores(String studentId) throws NoFoundStudentError, InvalidDataError {
        if (studentId == null)
            throw new InvalidDataError();
        ScoreList list = scoreDao.queryStudentScores(studentId);
        if (list == null) {
            throw new NoFoundStudentError();
        } else {
            return list;
        }
    }

    @Override
    public ScoreList updateStudentScores(Score scores) throws NoFoundScoreTypeError, InvalidDataError {
        if (scores == null)
            throw new InvalidDataError();
        ScoreList list = scoreDao.updateStudentScores(scores);
        if (list == null) {
            throw new NoFoundScoreTypeError();
        } else {
            return list;
        }
    }

    @Override
    public ScoreList addStudentScores(Score scores) throws DuplicateInsertScoreError, InvalidDataError {
        if (scores == null)
            throw new InvalidDataError();
        ScoreList list = scoreDao.addStudentScores(scores);
        if (list == null) {
            throw new DuplicateInsertScoreError();
        } else {
            return list;
        }
    }

    @Override
    public ScoreList deleteStudentScores(Score scores) throws NoFoundScoreTypeError, InvalidDataError {
        if (scores == null)
            throw new InvalidDataError();
        ScoreList list = scoreDao.deleteStudentScores(scores);
        if (list == null) {
            throw new NoFoundScoreTypeError();
        } else {
            return list;
        }
    }
}
