package Service.Impl;

import Dao.InfoServiceDaoMock;
import Error.InvalidDataError;
import Error.*;
import Model.Student;
import Model.StudentList;
import Service.InfoService;

import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService(endpointInterface = "Service.InfoService")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class InfoServiceImpl implements InfoService{

    private InfoServiceDaoMock infoDao=new InfoServiceDaoMock();

    @Override
    public StudentList deleteStudentInfo(String studentId) throws NoFoundStudentError, InvalidDataError {
        if (studentId == null)
            throw new InvalidDataError();

        StudentList list = infoDao.deleteStudentInfo(studentId);
        if (list == null)
            throw new NoFoundStudentError();
        return list;
    }

    @Override
    public StudentList updateStudentInfo(Student student) throws NoFoundStudentError, InvalidDataError {
        if (student == null || student.getPersonInfo() == null)
            throw new InvalidDataError();
        StudentList changed = infoDao.updateStudentInfo(student);
        if (changed == null)
            throw new NoFoundStudentError();
        return changed;

    }

    @Override
    public Student queryStudentInfo(String studentId) throws NoFoundStudentError{
        Student student =  infoDao.queryStudentInfo(studentId);
        if (student == null)
            throw new NoFoundStudentError();
        return student;
    };

    @Override
    public StudentList addStudentInfo(Student student) throws DuplicateInsertStudentError, InvalidDataError
    {
        if (student == null || student.getPersonInfo() == null)
            throw new InvalidDataError();

        StudentList list = infoDao.addStudentInfo(student);
        if (list == null) {
            throw new DuplicateInsertStudentError();
        }
        return list;
    };
}
