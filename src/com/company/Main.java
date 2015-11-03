package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;



public class Main {

    private static Map<String, Student> studentMap = new HashMap<>();

    public static void main(String[] args) {

        System.out.println("What is your student ID?");
        String studentId = in.next();

        System.out.println("do you live on campus? (y/n)");
        String liveOnCampus = Main.in.next();
        liveOnCampus = liveOnCampus == null ? "n" : liveOnCampus;

        Student student = null;
        if ( liveOnCampus.equals( "y" ) || liveOnCampus.equals( "yes" )){
            student = new CampusStudent(studentId);
        } else if ( liveOnCampus.equals( "n" ) || liveOnCampus.equals( "no" ) ){
            student = new Student(studentId);
        }


        studentMap.put(studentId, student);

    }



}
