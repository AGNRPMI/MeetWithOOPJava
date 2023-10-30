package Seminar03.data;

import java.util.Iterator;
import java.util.List;

public class Stream implements Iterator<StudentGroup> {
    private int counter;
    private final List<StudentGroup> studentGroups;
    private int sizeGroup;

    


    public int getSizeGroup() {
        return sizeGroup;
    }


    public void setSizeGroup(int sizeGroup) {
        this.sizeGroup = sizeGroup;
    }


    public Stream(int counter, List<StudentGroup> studentGroups) {
        this.counter = 0;
        this.studentGroups = studentGroups;
    }


    @Override
    public boolean hasNext() {
        
        return counter< studentGroups.size()-1;
    }


    @Override
    public StudentGroup next() {
        if (!hasNext()){
            return null;
        }
        counter++;
        return studentGroups.get(--counter);
    }
}