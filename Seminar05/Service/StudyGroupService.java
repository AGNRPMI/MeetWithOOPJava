package Seminar05.Service;

import java.util.ArrayList;
import java.util.List;

import Seminar05.Data.Student;
import Seminar05.Data.Teacher;
import Seminar05.Data.User;

public class StudyGroupService {
    private List<Student> studentList;
    private Teacher teacher;
    
    
    public StudyGroupService() {
        this.studentList = new ArrayList<>();
    }

    public StudyGroupService(List<Student> studentList, Teacher teacher) {
        this.studentList = studentList;
        this.teacher = teacher;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<User> createGroup(List<Student> studentList, Teacher teacher){
        List<User> userList = new ArrayList<>(); 
        userList.add(teacher);
        for (Student students: studentList){
            userList.add(students);
        }


        return userList;
        
    }


    
}



// public class DataService {
//     private List<User> userList;

//     public DataService() {
//         this.userList = new ArrayList<>();
//     }

//     public void create(String firstName, String secondName,
//                        String lastName, String dateB, Type type){
//         int id = getFreeId(type);
//         if(Type.STUDENT == type){
//             Student student = new Student(firstName,secondName,lastName,dateB,id);
//             userList.add(student);
//         }
//         else if(Type.TEACHER == type){
//             Teacher teacher = new Teacher(firstName,secondName,lastName,dateB,id);
//             userList.add(teacher);
//         }
//     }

//     private int getFreeId(Type type){
//         boolean itsStudent = Type.STUDENT == type;
//         int lastId = 1;
//             for (User user : userList) {
//                 if(user instanceof Teacher && !itsStudent){
//                     lastId = ((Teacher) user).getTeacherId() + 1;
//                 }
//                 if(user instanceof Student && itsStudent){
//                     lastId = ((Student) user).getStudentId() + 1;
//                 }

//             }
//         return lastId;
//     }

//     public User getUserById(Type type, int id){
//         boolean itsStudent = Type.STUDENT == type;
//         for(User user: userList){
//             if(user instanceof Teacher && !itsStudent && ((Teacher) user).getTeacherId() == id){
//                 return user;
//             }
//             if(user instanceof Student && itsStudent && ((Student) user).getStudentId() == id){
//                 return user;
//             }
//         }
//         return null;
//     }
    
//     public List<User> getAllUser(){
//         return userList;
//     }

//     public List<User> getAllStudent(){
//         List<User> resultList = new ArrayList<>();
//         for(User user : userList){
//             if (user instanceof Student){
//                 resultList.add(user);
//             }
//         }
//         return resultList;
//     }
// }
