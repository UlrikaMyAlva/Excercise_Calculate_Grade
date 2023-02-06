package com.company;

import java.util.Scanner;

public class Main {

        /*

        UPPGIFT 1D
        AUTHOR
        Ulrika Eriksson, 2022-04-14

        INTRODUCTION
        A program that calculates how many student will get each grade.

        IMPLEMENTATION
        First each grade is initialized into a variable (float). The teacher is asked how many students they have. An
        array is created and the size of that array is set to the number of students. Then a for loop starts that will
        run the same amount of times as the amount of students. The teacher will be asked to put in the grade for each
        student, and then the grade is sorted into on of the variables. The grade is put in the array. In the end, the
        percentage is calculated and everything is printed.

        DISCUSSION
        First, I had to decide how to store the grades. I decided to make an array, because the teacher would begin to
        declare how many students they had, so I could use that to make the array size. Then I asked the teacher to put
        in the points for each student until the array list is full.

        I made an int to store each number of students that got that grade. First I tried to name the int:s after the
        numbers (3, 4, 5) which I realised I could not do, so I wrote them out in text instead. When I came to the
        percentage part I realised an int wouldn't do it, and I changed them to floats. The percentage became hilariously
        accurate.

        I used the "i" int to tell the computer which index it should put the grade in. It worked out nicely in the for
        loop, and I am pleased with the solution.

        To make it better I would want to make it smaller. Maybe I could make every if statement only one row. I would
        also want to fix the percentage part, make the program "round up" to the closest whole percentage.

        */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Grades variables initialized.
        float u = 0;
        float three = 0;
        float four = 0;
        float five = 0;

        // Asking for input
        System.out.println("How many students would you like to register? ");
        int answer = scan.nextInt();
        // The array is created and the size.
        int [] student = new int[answer];

        // Teacher will be asked to enter grade of students equal amount of times they entered "how many students".
        for (int i = 0; i < answer; i++) {

            // + 1 to not print "student 0"
            System.out.println("Please enter the points of student " + (i + 1));
            student[i] = scan.nextInt();

            //Every number is sorted into the correct int.
            if (student[i] < 20) {
                u++;
            }
            else if (student[i] >= 20 && student[i] < 30 ){
                three++;
            }
            else if (student[i] >= 30 && student[i] < 36 ){
                four++;
            }
            else if (student[i] >= 36 && student[i] < 41 ){
                five++;
            }
            else {
                System.out.println("You have not entered a number between 0-40. Please try again.");
                i--;
            }


        }

        // Here the percentage of each grade group is calculated.
        float percentU = (u / answer) * 100;
        float percentThree = (three / answer) * 100;
        float percentFour = (four / answer) * 100;
        float percentFive = (five / answer) * 100;

        // When every student is registered in the loop, the grades are printed.
        System.out.println("U: " + u);
        System.out.println("3: " + three);
        System.out.println("4: " + four);
        System.out.println("5: " + five);

        System.out.println("Percent that got U: " + percentU + "% Three: " + percentThree + "% Four: " + percentFour + "% Five: " + percentFive + "%");

    }
}
