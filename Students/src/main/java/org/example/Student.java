package org.example;

public class Student {

    private String name;
    private Integer rollNumber;
    private Integer totalMarks;

    public Student(String name, Integer rollNumber, Integer totalMarks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.totalMarks = totalMarks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(Integer rollNumber) {
        this.rollNumber = rollNumber;
    }

    public Integer getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(Integer totalMarks) {
        this.totalMarks = totalMarks;
    }
}
