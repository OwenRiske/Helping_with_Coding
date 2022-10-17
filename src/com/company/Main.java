//Owen Riske

package com.company;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //CS30 Java


        //Input
        Scanner Input=new Scanner(System.in);

        //Arrays
        //An Array can hold more than one piece of data


        String[] roster =new String[5];
        roster[0]="Superman";
        roster[1]="Batman";
        roster[2]="Wonder Woman";
        roster[3]="The Flash";
        roster[4]="Martain Manhunter";

        String[] betterRoster= {"Iron Man", "Thor", "Hulk","Captain America"}; //only when creating the array


        //Can't print an array
        for (int i = 0; i < roster.length; i++) {
            System.out.println(roster[i]);
        }


        System.out.println("\n\n");

        //simply selection

        boolean condition=false;
        boolean secondCondition=false;

        if (condition) {
            System.out.println("This prints if the condition is true");
        }
        else if (secondCondition) {
            System.out.println("Print if second condition is true");

        }
        else{
            System.out.println("Print if niether conditions is true");
        }


        System.out.println("\n\n");


        //More advanced selection

        char classDay='B';
        String studentName="Larry";

        ArrayList<String> cs20List = new ArrayList<String>();
        cs20List.add("Nathan");
        cs20List.add("Owen");
        ArrayList<String> cs30List = new ArrayList<String>();
        cs30List.add("Owen");
        cs30List.add("Majid");

        //Does this student show up today

        if (classDay=='A' && cs20List.contains(studentName)){
            System.out.println(studentName+"should attend CS20 today.");
        }
        else if (classDay=='B' && cs20List.contains(studentName)){
            System.out.println(studentName+"should attend CS30 today.");
        }
        else{
            //Nested if

            //! at start of if statement means if it is false
            if (!cs20List.contains(studentName) && !cs30List.contains(studentName)){
                System.out.println("You aren't register in computer science 20 and/or 30. This course isn't for you.");

            }
            else{
                System.out.println("You do not have computer science today.");

            }
        }

        System.out.println("\n\n");

        //Switch statements for menus

        String[] menuOptions={"1.Ride the roller-coaster","2.Visit the midway","3.Get a snack","4.Surrender to clowns"};
        System.out.println("Please choose one of the following options");
        for (int i = 0; i < menuOptions.length; i++) {
            System.out.println("    "+menuOptions[i]);
        }
        System.out.println("Which would you like to do (numerical)?");
        String menuChoice=Input.nextLine();
        switch (menuChoice){
            case "1":
                System.out.println("Roller-coasters are fun");
                break;
            case "2":
                System.out.println("The midway is a scam");
                break;
            case "3":
                System.out.println("Yum");
                break;
            case "4":
                System.out.println("It was inevitable");
                break;
            default:
                System.out.println("you entered an invalid option");

        }
        System.out.println("\n\nIs it the weekend?");
        boolean result= checkWeekend("thurdsay");
        System.out.println(result);


        System.out.println("\n\nIs today the weekend?\n"+betterWeekendQuery());

        postSecondayProgram first =new postSecondayProgram("");
        postSecondayProgram second =new postSecondayProgram("");
    }



//User defined method
public static boolean checkWeekend(String dayOfTheWeek){
    if (dayOfTheWeek.equalsIgnoreCase("saturday") || dayOfTheWeek.equalsIgnoreCase("sunday")){
        return true;
    }
    else {
        return false;
    }
}

public static boolean betterWeekendQuery(){
        //lets find an external library for day of the week
    Calendar myCalendar=Calendar.getInstance();
    if (myCalendar.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY || myCalendar.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY){
        return true;
    }
    return false;
}

}