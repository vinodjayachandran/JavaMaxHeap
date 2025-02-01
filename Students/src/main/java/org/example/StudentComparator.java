package org.example;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student student, Student student2) {
        if (student2.getTotalMarks() > student.getTotalMarks()) {
            return 1;
        } else if (student2.getTotalMarks() < student.getTotalMarks()) {
            return -1;
        } else {
            return 0;
        }
    }
}
