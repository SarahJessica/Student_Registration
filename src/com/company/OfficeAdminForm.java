package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OfficeAdminForm {

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

        pickYear(newStudent);

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

            campusStudentExtraInfo((CampusStudent) newStudent);
        }

        studentMap.put(studentId, newStudent);

    }

    private void campusStudentExtraInfo(CampusStudent newStudent) {
        System.out.println("How many weeks will you be living on campus or nearby apartment ?");
        weeksLivingOnCampusDuringYear = in.nextInt();
        newStudent.setWeeksLivingOnCampusDuringYear(weeksLivingOnCampusDuringYear);

        System.out.println("What is your weekly rent?");
        weeklyRent = in.nextDouble();
        newStudent.setWeeklyRent(weeklyRent);

        System.out.println("What do you estimate your other weekly costs to be?");
        estimatedWeeklyLivingCosts = in.nextDouble();
        newStudent.setEstimatedWeeklyLivingCosts(estimatedWeeklyLivingCosts);
    }

    private void pickYear(Student student){


        System.out.println("Thank you " + name + ", are you 1.freshman, 2.sophmore, 3.junior or 4.senior?");
        year = in.nextInt();
        switch (year){
            case 1: student.setYearName("freshman");
                break;
            case 2: student.setYearName("sophmore");
                break;
            case 3: student.setYearName("junior");
                break;
            case 4: student.setYearName("senior");
                break;
            default: student.setYearName("unknown");
        }
    }

    public void updateStudent(String studentId){
        Student student = studentMap.get(studentId);

        while (true){
            System.out.println("what you would like to update about student " + studentId + "? \n" +
                    "1. name, 2. stationery cost, 3. No of credit hours," +
                    "4. cost per credit hour, 5. year, 6. campus living arrangement information, 7. exit editing students mode");
            int choice = in.nextInt();
            switch (choice){
                case 1:
                    System.out.println("please enter student's name");
                    String name = in.next();
                    student.setName(name);
                    break;
                case 2:
                    System.out.println("please enter student's stationery cost");
                    double stationeryCost = in.nextDouble();
                    student.setStationeryCosts(stationeryCost);
                    break;
                case 3:
                    System.out.println("please enter number of credit hours");
                    int creditHours = in.nextInt();
                    student.setCreditHours(creditHours);
                    break;
                case 4:
                    System.out.println("please enter cost per credit hour");
                    double cost = in.nextDouble();
                    student.setCostPerCreditHour(cost);
                    break;
                case 5:
                    pickYear(student);
                    break;
                case 6:
                    System.out.println("are you moving a non-campus student to campus accommodation?");
                    String newArrangement = in.next();
                    handleStudentArrangement(newArrangement, student);
                case 7:
                    return;
            }

        }

    }

    private void handleStudentArrangement(String newArrangement, Student student) {
        if("y".equals(newArrangement) && student != null && !(student instanceof CampusStudent)){
            CampusStudent campusStudent = CampusStudent.fromStudent(student);
            campusStudentExtraInfo(campusStudent);
            student = campusStudent;
        } else if("n".equals(newArrangement) && student != null && student instanceof CampusStudent){
            student = ((CampusStudent) student).toStudent();
        }

        studentMap.put(studentId, student);
    }


    public void retrieveInfo(String studentId){
        Student student = studentMap.get(studentId);
        if (student == null) {
            System.out.println("error typing in ID");
        } else {
            System.out.println(student);
        }
    }

    public void deleteStudent(String studentId){
        studentMap.remove(studentId);
    }


    public void editStudent(String studentId){
        Student student = studentMap.get(studentId);
    }
}
