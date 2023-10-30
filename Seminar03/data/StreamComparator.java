package Seminar03.data;

import java.util.Comparator;

public class StreamComparator implements Comparator<Stream> {

    @Override
    public int compare(Stream o1, Stream o2) {       
        int resultOfComparing = o1.getSizeGroup()-o2.getSizeGroup();
        if (resultOfComparing > 0){
            System.out.println("в первом потоке групп больше чем во втором на :");
            return resultOfComparing;
        }
        else if (resultOfComparing < 0){
            System.out.println("во втором потоке групп больше чем в первом на :");
            return resultOfComparing*(-1);
        }
        else {
            System.out.println("обоих потоках одинаковое количество групп");
            return 0;
        }
    }

}

// public class StudentComparator implements Comparator<Student> {
// @Override
// public int compare(Student o1, Student o2) {
// int resultOfComparing = o1.getSecondName().compareTo(o2.getSecondName());
// if (resultOfComparing == 0) {
// resultOfComparing = o1.getFirstName().compareTo(o2.getFirstName());
// if (resultOfComparing == 0) {
// return o1.getPatronymic().compareTo(o2.getPatronymic());
// } else {
// return resultOfComparing;
// }
// } else {
// return resultOfComparing;
// }
// }
// }