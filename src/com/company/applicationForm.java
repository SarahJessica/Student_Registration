package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ApplicationForm {

    private String name, yearName, studentId;
    private boolean onCampus;
    private double stationeryCosts, costPerCreditHour, totalYearTuitionCost, weeklyRent, estimatedWeeklyLivingCosts;
    private int creditHours, year, weeksLivingOnCampusDuringYear;
    private static Map<String, Student> studentMap = new HashMap<>();

    private Scanner in = new Scanner(System.in);

    public void makeStudent(){
        Student newStudent;

        System.out.println("Welcome! Please enter your name?");
        name = in.next();


        System.out.println("Hello, " + name + " please type in your student ID");
        studentId = in.next();



        System.out.println("Will you be staying on campus or in a nearby apartment? (y/n");
        if (in.next().equals("n")){
            newStudent = new Student();
        } else {
            newStudent = new CampusStudent();
        }

        newStudent.setName(name);


        System.out.println("Thank you " + name + ", are you 1.freshman, 2.sophmore, 3.junior or 4.senior?");
        year = in.nextInt();
        switch (year){
            case 1: newStudent.setYearName("freshman");
                break;
            case 2: newStudent.setYearName("sophmore");
                break;
            case 3: newStudent.setYearName("junior");
                break;
            case 4: newStudent.setYearName("senior");
                break;
            default: newStudent.setYearName("unknown");
        }

        System.out.println("How much, in $, do you estimate your textbooks and stationery will cost you?");
        stationeryCosts = in.nextDouble();
        newStudent.setStationeryCosts(stationeryCosts);

        System.out.println("How many credit hours are you taking for the year?");
        creditHours = in.nextInt();
        newStudent.setCreditHours(creditHours);

        System.out.println("How much does each credit hour cost?");
        costPerCreditHour = in.nextDouble();
        newStudent.setCostPerCreditHour(costPerCreditHour);

        newStudent.setTotalYearTuitionCost(costPerCreditHour, creditHours);

        if(newStudent instanceof CampusStudent) {

            System.out.println("How many weeks will you be living on campus or nearby apartment ?");
            weeksLivingOnCampusDuringYear = in.nextInt();
            ((CampusStudent) newStudent).setWeeksLivingOnCampusDuringYear(weeksLivingOnCampusDuringYear);

            System.out.println("What is your weekly rent?");
            weeklyRent = in.nextDouble();
            ((CampusStudent) newStudent).setWeeklyRent(weeklyRent);

            System.out.println("What do you estimate your other weekly costs to be?");
            estimatedWeeklyLivingCosts = in.nextDouble();
            ((CampusStudent) newStudent).setEstimatedWeeklyLivingCosts(estimatedWeeklyLivingCosts);
        }

        in.close();
        studentMap.put(studentId, new Student());



    }

    public static Map<String, Student> getStudentMap() {
        return studentMap;
    }
}
