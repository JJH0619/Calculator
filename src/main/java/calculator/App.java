package calculator;

import javax.swing.*;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요 (종료하려면 'exit' 입력): ");
            String input1 = sc.next();
            if (input1.equalsIgnoreCase("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            int num1 = Integer.parseInt(input1);

            System.out.print("두 번째 숫자를 입력하세요: ");
            String input2 = sc.next();
            if (input2.equalsIgnoreCase("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            int num2 = Integer.parseInt(input2);

//        System.out.print("첫 번째 숫자를 입력하세요: ");
//        int num1 = sc.nextInt();
//        System.out.print("두 번째 숫자를 입력하세요: ");
//        int num2 = sc.nextInt();

            System.out.println("사칙연산 기호 (+,-,*,/) 입력 : "); //  +_*/
            char operator = sc.next().charAt(0);
            //char charAt(int index) 문자열에서 해당 위치(index)에 있는 문자를 반환한다
            String result;

            if (operator == '/' && num2 == 0) {
                result = "나눗셈 연산에서 분모(두 번째 정수)에 0이 입력될 수 없습니다.";
            } else {
                // 연산자를 기준으로 switch 문 처리
                switch (operator) {
                    case '+':
                        result = "결과 : " + (num1 + num2);
                        break;
                    case '-':
                        result = "결과 : " + (num1 - num2);
                        break;
                    case '*':
                        result = "결과 : " + (num1 * num2);
                        break;
                    case '/':
                        result = "결과 : " + (num1 / num2);
                        break;
                    default:
                        result = "잘못된 연산자입니다.";

                }
            }
            System.out.println(result);
        }
    }
}

//        if(operator == '/' && num2 == 0){
//            System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
//        }
//        else if (operator=='+'){
//            System.out.println("결과 : " + (num1 + num2));
//        } else if (operator=='-') {
//            System.out.println("결과 : " + (num1 - num2));
//        }else if (operator=='/') {
//            System.out.println("결과 : " + (num1 / num2));
//        }else if (operator=='*'){
//            System.out.println("결과 : " + (num1 * num2));
//        }
//        else {
//            System.out.println("잘못된 입력으로 인해 종료됩니다.");
//        }
        /* else 문을 이용하여 사칙연산 기호 4종이 입력될 때
           그에 맞게 num1 ,num2 가 계산되고 출력되게 함
           나눗셈 중에 num2에 0이 입력되면 연산실패로 문구가 출력되게 함
           숫자가 아닌 문자를 입력하거나 , 사칙연산 4종 외 다른게 입력되면 문구가 출력되며 종료
         */
        //




