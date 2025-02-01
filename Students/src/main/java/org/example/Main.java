package org.example;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {

        PriorityQueue<Student> pq = new PriorityQueue<>(new StudentComparator());

        pq.add(new Student("A", 1, 95));
        pq.add(new Student("B", 2, 96));
        pq.add(new Student("C", 3, 92));

        // Student with highest marks
        System.out.println(pq.peek().getName());

        // Print the top 2 Rank Students
        Iterator<Student> iterator = pq.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().getName());
        }

    }
}