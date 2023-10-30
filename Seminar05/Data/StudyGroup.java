package Seminar05.Data;

import java.util.List;

public class StudyGroup {
    private Teacher teacher;
    private List<Student> students;
    
    public StudyGroup(Teacher teacher, List<Student> student) {
        this.teacher = teacher;
        this.students = student;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudent() {
        return students;
    }

    public void setStudent(List<Student> student) {
        this.students = student;
    }

    
}
