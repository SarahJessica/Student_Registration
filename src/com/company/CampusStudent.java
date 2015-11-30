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

}
