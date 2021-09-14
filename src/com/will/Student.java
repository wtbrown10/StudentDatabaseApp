package com.will;

import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses = "";
    private int tuitionBalance;
    private static int costOfCourse = 600;
    private static int id = 1000;

    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Student First Name: ");
        this.firstName = in.nextLine();
        System.out.print("Enter Student Last Name: ");
        this.lastName = in.nextLine();
        System.out.print("Select number that corresponds with student year\n1 - Freshmen\n" +
                "2 - Sophomore\n3 - Junior\n4 - Senior \nEnter Student Number Year: ");
        this.gradeYear = in.nextInt();
        setStudentID();
//        System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID);
    }

    private void setStudentID() {
        id++;
        this.studentID = gradeYear + "" + id;
    }

    public void enroll() {
        do {
            System.out.print("Enter course to enroll (Q to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")) {
                courses += "\n   " + course;
                tuitionBalance += costOfCourse;
            } else {
                break;
            }
        } while (1 != 0);
//            System.out.println("ENROLLED IN: " + courses);
//            System.out.println("TUITION BALANCE: $" + tuitionBalance);
        }

    public void viewBalance() {
        System.out.println("Tuition Balance Is: $" + tuitionBalance);
    }

    public void payTuition(){
        System.out.print("Enter Your Payment Amount: $");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance -= payment;
        System.out.println("Thank You For Your Payment Of $" + payment);
        viewBalance();
    }

    public String showInfo() {
        return "Name: " + firstName + " " + lastName +
                "\nID: " + studentID + "\nCourses: " + courses +
                "\nTuition Balance: $" + tuitionBalance;
    }
}

