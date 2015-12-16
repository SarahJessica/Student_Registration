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
    private int id  ;
    protected String name, yearName;
    protected double stationeryCosts, costPerCreditHour, totalYearTuitionCost;
    protected int creditHours;

    public Student() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYearName(String year) {
        this.yearName = year;
    }

    public void setStationeryCosts(double stationeryCosts) {
        this.stationeryCosts = stationeryCosts;
    }

    public void setCostPerCreditHour(double costPerCreditHour) {
        this.costPerCreditHour = costPerCreditHour;
    }

    public void setTotalYearTuitionCost(double costPerCreditHour, int creditHours) {
        this.totalYearTuitionCost = this.costPerCreditHour * creditHours;
    }

    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("name : " + this.name + "\n");
        sb.append("year : " + this.yearName + "\n");
        sb.append("stationery costs : " + this.stationeryCosts + "\n");
        sb.append("cost per credit hour : " + this.costPerCreditHour + "\n");
        sb.append("total year tuition cost : " + this.totalYearTuitionCost + "\n");
        sb.append("number of credit hours : " + this.creditHours + "\n");
        sb.append("campus student? : NO");
        return sb.toString();
    }
    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null) {
            return false;
        }

        if(obj == this) {
            return true;
        }

        if(obj.getClass().getName().equals(obj.getClass().getName())){
            return true;
        }

        return false;
    }
}
