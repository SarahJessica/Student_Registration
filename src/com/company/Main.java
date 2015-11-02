package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main {

    private static Map<String, Student> studentMap = new HashMap<>();

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        String studentId = Main.in.next();



// do you live on campus?
        // what is your student ID number? in.next();

        // if yes: CampusStudent *var ID number* = new CampusStudent();
        studentMap.put(studentId, new CampusStudent());

    }



}
