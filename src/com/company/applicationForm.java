package com.company;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Scanner;

/**
 * Created by leives01 on 02/11/15.
 */
public class ApplicationForm {

    private String name, yearName, studentId;
    private boolean onCampus;
    private double stationeryCosts, costPerCreditHour, totalYearTuitionCost;
    private int creditHours, year;

    private Scanner in = new Scanner(System.in);

    public Student makeStudent(){

        System.out.println("Welcome! Please enter your name?");
        name = in.next();

        Student newStudent = null;

        System.out.println("Will you be staying on campus or in a nearby apartment? (y/n");
        if (in.next().equals("n")){
            newStudent = new Student(name);
        } else {
            newStudent = new CampusStudent(name);
        }

        System.out.println("Hello, " + name + "please type in your student ID");
        studentId = in.next();

        System.out.println("Thank you " + name + ", are you 1.freshman, 2.sophmore, 3.junior or 4.senior?");
        year = in.nextInt();
        switch (year){
            case 1: yearName = "freshman";
                break;
            case 2: yearName = "sophmore";
                break;
            case 3: yearName = "junior";
                break;
            case 4: yearName = "senior";
                break;
            default: yearName = "unknown";
        }


        if(newStudent instanceof CampusStudent) {

        }


        System.out.println("How much, in $, do you estimate your textbooks and stationery will cost you?");
        stationeryCosts = in.nextDouble();

        System.out.println("How many credit hours are you taking for the year?");
        creditHours = in.nextInt();

        System.out.println("How much does each credit hour cost?");
        costPerCreditHour = in.nextDouble();
        totalYearTuitionCost = costPerCreditHour * creditHours;


    }


}
