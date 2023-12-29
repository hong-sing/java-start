package array.ex;

import java.util.Scanner;

public class ArrayEx8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("학생수를 입력하세요:");
        int studentCnt = scanner.nextInt();

        int[][] grades = new int[studentCnt][3];
        String[] sbjects = {"국어", "영어", "수학"};

        for (int student = 0; student < grades.length; student++) {
            System.out.println(student+1 + "번 학생의 성적을 입력하세요:");
            for (int sbject = 0; sbject < sbjects.length; sbject++) {
                System.out.print(sbjects[sbject] + " 점수:");
                grades[student][sbject] = scanner.nextInt();
            }
        }
        
        for (int i = 0; i < grades.length; i++) {
            int total = 0;
            for (int j = 0; j < grades[i].length; j++) {
                total += grades[i][j];
            }
            double average = (double) total / sbjects.length;
            System.out.println(i + "번 학생의 총점: " + total + ", 평균: " + average);
        }
    }
}
