package day4_04_25_2022.Exam;

import java.util.Scanner;

public class StudentGrade {
    //ask user how many question in the exam
    //ask user how many question is missed
    //give user the final grade
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int totalQuestions;
        int missed;

        System.out.println("How many questions are there in the final exam?");
        totalQuestions = scan.nextInt();

        System.out.println("How many questions did student miss?");
        missed = scan.nextInt();

        FinalExam math = new FinalExam(totalQuestions,missed);
        System.out.println(math.getScore());
        System.out.println(math.getGrade());
    }
}
