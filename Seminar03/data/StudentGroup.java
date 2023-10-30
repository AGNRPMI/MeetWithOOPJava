package Seminar03.data;

import java.util.List;

public class StudentGroup implements Iterable<Student>{
    private List<Student> students;
    private Teacher teacher;
    private int size;

    

    public StudentGroup(Teacher teacher, List<Student> students) {
        this.students = students;
        this.teacher = teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "StudentGroup{" +
               "students=" + students +
               ", teacher=" + teacher +
               '}';
    }

    @Override
    public StudentGroupIterator iterator() {
        return new StudentGroupIterator(this);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}