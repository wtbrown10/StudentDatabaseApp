package com.will;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.print("Enter number of students to enroll: ");
        Scanner in = new Scanner(System.in);
        int numOfStudents = in.nextInt();
        Student[] students = new Student[numOfStudents];

        for (int i = 0; i < numOfStudents; i++) {
            students[i] = new Student();
            students[i].enroll();
            students[i].payTuition();
            System.out.println(students[i].toString());
        }

//        for (int i = 0; i < numOfStudents; i++) {
//            System.out.println(students[i].toString());
//        }
    }
}
