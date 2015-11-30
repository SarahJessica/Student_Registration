package com.company;

import java.util.Scanner;

/**
 * Created by leives01 on 30/11/15.
 */
public class CrudOptions {
    private Scanner in = new Scanner(System.in);

    public void makeChoice() {

        OfficeAdminForm adminForm = new OfficeAdminForm();

        while (true) {


            System.out.println("Would you like to 1. register a new student, 2. retrieve information on existing student, 3. delete a student file," +
                    "4. update a student's records, or 5. exit application");
            int choice = in.nextInt();
            String studentId;



            switch (choice) {
                case 1:
                    adminForm.makeStudent();
                    break;
                case 2:
                    System.out.println("please enter the student ID");
                    studentId = in.next();
                    adminForm.retrieveInfo(studentId);
                    break;
                case 3:
                    System.out.println("please enter the student ID");
                    studentId = in.next();
                    adminForm.deleteStudent(studentId);
                    break;
                case 4:
                    System.out.println("please enter the student ID");
                    studentId = in.next();
                    adminForm.updateStudent(studentId);
                    break;
                case 5:
                    System.exit(0);
                    default:System.out.println("option not recognised");
                        break;
            }

        }
    }
}
