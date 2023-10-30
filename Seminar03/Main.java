package Seminar03;

import Seminar03.data.Student;
import Seminar03.data.StudentGroup;
import Seminar03.data.StudentGroupIterator;

public class Main {
    public static void main(String[] args){
        Student student1 = new Student("1", "1", "1", null);
        

    }

    public static void testIterator(StudentGroup studentGroup){
        StudentGroupIterator groupIterator = new StudentGroupIterator(studentGroup);
        while (groupIterator.hasNext()) {
            System.out.println(groupIterator.next());
            
        }
    }
}
