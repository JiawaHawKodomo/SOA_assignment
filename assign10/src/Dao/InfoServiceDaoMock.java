package Dao;

import Model.*;

import java.util.ArrayList;
import java.util.List;

public class InfoServiceDaoMock {

    public static List<Student> students=new ArrayList<>();;

    static {
        Student s1=new Student();
        s1.setStudentId("161250090");

        Student s2=new Student();
        s2.setStudentId("161250089");

        students.add(s1);
        students.add(s2);
    }

    public StudentList deleteStudentInfo(String studentId){
        StudentList list=new StudentList();
        for(int i=0;i<students.size();i++){
            if(students.get(i).getStudentId().equals(studentId)){
                students.remove(i);
                list.setStudents(students);
                return list;
            }
        }
        return null;
    }

    public StudentList updateStudentInfo(Student student){
        StudentList list=new StudentList();
        for(int i=0;i<students.size();i++){
            if(students.get(i).getStudentId().equals(student.getStudentId())){
                students.set(i,student);
                list.setStudents(students);
                return list;
            }
        }
        return null;
    }

    public Student queryStudentInfo(String studentId){
        for(int i=0;i<students.size();i++){
            if(students.get(i).getStudentId().equals(studentId)){
                return students.get(i);
            }
        }
        return null;
    }

    public StudentList addStudentInfo(Student student){
        StudentList list=new StudentList();
        for(int i=0;i<students.size();i++){
            if(students.get(i).getStudentId().equals(student.getStudentId())){
                return null;
            }
        }
        students.add(student);
        list.setStudents(students);
        return list;
    }
}
