package Service;

import Model.Student;
import Model.StudentList;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import Error.*;


@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface InfoService {
    /**
     *
     * @param studentId of the student whose info we want to get
     * @return student information
     * @throws Error.NoFoundStudentError
     */
    @WebMethod
    @WebResult(name = "Student")
    Student queryStudentInfo(@WebParam String studentId) throws NoFoundStudentError;


    /**
     *
     * @param  student information we want to add to the studentlist
     * @return the revised studentlist after adding a new student
     * @throws Error.DuplicateInsertStudentError
     * @throws Error.InvalidDataError
     */
    @WebMethod
    @WebResult(name = "StudentList")
    StudentList addStudentInfo(@WebParam Student student) throws DuplicateInsertStudentError, InvalidDataError;


    /**
     *
     * @param  studentId of the student which is going to be deleted
     * @return the revised studentlist after deleting a student
     * @throws Error.NoFoundStudentError
     * @throws Error.InvalidDataError
     */
    @WebMethod
    @WebResult(name = "StudentList")
    StudentList deleteStudentInfo(@WebParam String studentId) throws NoFoundStudentError, InvalidDataError;

    /**
     *
     * @param  student information which we want to update
     * @return the revised studentlist after updating a student
     * @throws Error.NoFoundStudentError
     * @throws Error.InvalidDataError
     */
    @WebMethod
    @WebResult(name = "Student")
    StudentList updateStudentInfo(@WebParam Student student) throws NoFoundStudentError, InvalidDataError;
}
