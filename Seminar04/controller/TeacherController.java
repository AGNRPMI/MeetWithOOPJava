package Seminar04.controller;

import Seminar04.data.Student;
import Seminar04.data.Teacher;
import Seminar04.service.StudentGroupService;
import Seminar04.service.StudentService;
import Seminar04.service.TeacherService;
import Seminar04.view.StudentView;
import Seminar04.view.TeacherView;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

public class TeacherController implements UserController<Teacher>{
    
    private final TeacherService dataService = new TeacherService();
        private final TeacherView teacherView = new TeacherView();

@Override
    public void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        dataService.create(firstName, secondName, patronymic, dateOfBirth);
        teacherView.sendOnConsole(dataService.getAll());
    }

    public void changeTeacher(Long teacherId){

    }

    public void getListTeacher(){
        List<Teacher> teachers = dataService.getAll();
        teacherView.sendOnConsole(teachers);
    }


}

