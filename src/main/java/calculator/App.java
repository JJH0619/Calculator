package calculator;

import java.sql.SQLOutput;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요: ");
        int num1 = sc.nextInt();
        System.out.print("두 번째 숫자를 입력하세요: ");
        int num2 = sc.nextInt();

        System.out.println("num1,num2= " + num1 + "," + num2);

        System.out.println("사칙연산 기호 입력 : "); //  +_*/
        char operator = sc.next().charAt()
                //char charAt(int index) 문자열에서 해당 위치(index)에 있는 문자를 반환한다
        System.out.println("operator = " + operator);

        }
    }

