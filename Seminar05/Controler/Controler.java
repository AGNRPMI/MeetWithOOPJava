package Seminar05.Controler;

import Seminar05.Data.Type;
import Seminar05.Data.User;
import Seminar05.Data.Student;
import Seminar05.Data.StudyGroup;
import Seminar05.Data.Teacher;
import Seminar05.Service.DataService;
import Seminar05.Service.StudyGroupService;
import Seminar05.View.StudentView;

import java.util.List;

public class Controler {
    private final DataService service = new DataService();
    private final StudyGroupService serviceGroup = new StudyGroupService();
    private final StudentView studentView = new StudentView();

    public void createStudent(String firstName, String secondName,
                              String lastName, String dateB){
        service.create(firstName,secondName,lastName,dateB, Type.STUDENT);
    }

    public void createStudentGroup(List<Student> studentList, Teacher teacher){
        serviceGroup.createGroup(studentList, teacher);
    }

    public void getAllStudent(){
        List<User> userList = service.getAllStudent();
        for (User user: userList){
            studentView.printOnConsole((Student) user);
        }
    }

    


    
}