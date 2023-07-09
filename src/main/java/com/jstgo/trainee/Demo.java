package com.jstgo.trainee;



import java.io.IOException;
import java.util.Scanner;

public class Demo {


    public static void main(String[] args) throws IOException {
        float NumOfSubj;
        float MarksOfSubj;
        float SumOfMarks=0;
        float AvgOfMarks;
        char  FinalGrade;


        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number Of Subject: ");
        NumOfSubj = input.nextFloat();
        for (int i=1; i<=NumOfSubj; i++){
            System.out.print("Enter Marks of Subject "+i+": ");
            Scanner inputMark = new Scanner(System.in);
            MarksOfSubj = inputMark.nextFloat();
            SumOfMarks += MarksOfSubj;
        }

        AvgOfMarks =  SumOfMarks / NumOfSubj;
        if (AvgOfMarks >=90 ){
        FinalGrade = 'A';
        }
        else if (AvgOfMarks>=80 && AvgOfMarks<90){
        FinalGrade = 'B';
        }
        else if (AvgOfMarks>=70 && AvgOfMarks<80){
            FinalGrade = 'C';
        }
        else if (AvgOfMarks>=60 && AvgOfMarks<70){
            FinalGrade = 'D';
        }
        else {
            FinalGrade = 'F';

        }
        System.out.println("Average Marks: " + AvgOfMarks );

        System.out.println("Final Grade: " +FinalGrade );


    }
}
