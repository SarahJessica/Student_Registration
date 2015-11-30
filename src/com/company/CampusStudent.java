package com.company;

// For a student living on campus, ask the user for:
// number of weeks they will be living on campus
// estimated weekly living expenses (outside of room and board)
// estimated amount of room and board per year


public class CampusStudent extends Student{

    private double estimatedWeeklyLivingCosts, weeklyRent, roomAndBoardPerYear;
    private int weeksLivingOnCampusDuringYear;

    public CampusStudent(){}

    public void setEstimatedWeeklyLivingCosts(double estimatedWeeklyLivingCosts){
        this.estimatedWeeklyLivingCosts = estimatedWeeklyLivingCosts;
    }
    public void setWeeklyRent(double weeklyRent){
        this.weeklyRent = weeklyRent;
    }

    public void setWeeksLivingOnCampusDuringYear(int weeksLivingOnCampusDuringYear){
        this.weeksLivingOnCampusDuringYear = weeksLivingOnCampusDuringYear;
    }

    public void setRoomAndBoardPerYear(){
        this.roomAndBoardPerYear = (estimatedWeeklyLivingCosts + weeklyRent) * weeksLivingOnCampusDuringYear;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("name : "                     + this.name + "\n");
        sb.append("year : "                     + this.yearName + "\n");
        sb.append("stationery costs : "         + this.stationeryCosts + "\n");
        sb.append("cost per credit hour : "     + this.costPerCreditHour + "\n");
        sb.append("total year tuition cost : "  + this.totalYearTuitionCost + "\n");
        sb.append("number of credit hours : "   + this.creditHours + "\n");
        sb.append("campus student? : YES");
        sb.append("weekly living costs : "      + this.estimatedWeeklyLivingCosts + "\n");
        sb.append("weekly rent : "              + this.weeklyRent + "\n");
        sb.append("weeks living on campus : "   + this.weeksLivingOnCampusDuringYear + "\n");
        sb.append("room and board per year : "  + this.roomAndBoardPerYear + "\n");

        return sb.toString();
    }

}
