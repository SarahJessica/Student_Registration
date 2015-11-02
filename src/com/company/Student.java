package com.company;

/* Write a program that computes and displays the total yearly expenses
*  for a student in college.
*  The student might be living on campus (or in a nearby apartment) or
*  commuting.
*  For a student living on campus, ask the user for:
*    number of weeks they will be living on campus
*    estimated weekly living expenses (outside of room and board)
*    estimated amount of room and board per year
*
*  For all students:
*    name and year (freshman, sophomore, junior, senior)
*    estimated costs of textbooks, pencils, paper, etc.
*    number of credit hours for the year
*    cost per credit hour
*
*  Calculate the total cost for attending college for one year,
*     print the final total.
*  Write separate methods for each request and only
*     use the main to call the methods.
*/

import java.util.Scanner;

public class Student {
    protected String name, year;
    protected double stationeryCosts, costPerCreditHour, totalYearTuitionCost;
    protected int creditHours;
    protected boolean onCampus;

    private void Student(String name, String year, double stationeryCosts,
                         int creditHours, double costPerCreditHour, boolean onCampus)
    {
        String name, year;
        boolean onCampus;
        double stationeryCosts, costPerCreditHour;
        int creditHours, year;

        static Scanner in = new Scanner(System.in);
        System.out.println("Hello, welcome to Leivers University. Please enter your name: ");
        this.name = in.next();

        System.out.println("Thank you " + name + ", are you 1.freshman, 2.sophmore, 3.junior or 4.senior?");
        year = in.nextInt();
        switch (year){
            case 1: this.year = "freshman";
                break;
            case 2: this.year = "sophmore";
                break;
            case 3: this.year = "junior";
                break;
            case 4: this.year = "senior";
                break;
            default: this.year = "unknown";
        }

        System.out.println("How much, in $, do you estimate your textbooks and stationery will cost you?");
        this.stationeryCosts = in.nextDouble();

        System.out.println("How many credit hours are you taking for the year?");
        this.creditHours = in.nextInt();

        System.out.println("How much does each credit hour cost?");
        this.costPerCreditHour = in.nextDouble();
        this.totalYearTuitionCost = this.costPerCreditHour * this.creditHours;

        System.out.println("Are you going to be staying on campus or in a nearby appartment? (y/n");
        onCampus = in.next();
        this.onCampus = onCampus == "y";
        if (this.onCampus) {
//            public String instanceName = this.name;
            CampusStudent this.name = new CampusStudent(this.name, this.year,
            this.stationeryCosts, this.costPerCreditHour, this.creditHours);
    }

    }


}
