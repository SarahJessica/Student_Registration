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



public class Student {
        private String name, yearName;
        private double stationeryCosts, costPerCreditHour, totalYearTuitionCost;
        private int creditHours;

    public Student() {}

    public void setName(String name){
        this.name = name;
    }
    public void setYearName(String year){
        this.yearName = year;
    }
    public void setStationeryCosts(double stationeryCosts){
        this.stationeryCosts = stationeryCosts;
    }
    public void setCostPerCreditHour(double costPerCreditHour){
        this.costPerCreditHour = costPerCreditHour;
    }
    public void setTotalYearTuitionCost(double totalYearTuitionCost){
        this.totalYearTuitionCost = totalYearTuitionCost;
    }
    public void setCreditHours(int creditHours){
        this.creditHours = creditHours;
    }


    }


}
