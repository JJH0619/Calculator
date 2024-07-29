package calculator;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        String[] results = new String[10]; // 결과를 저장할 배열
//        int count = 0; // 저장된 결과의 개수를 추적할 카운터 변수
        Queue<String> results = new LinkedList<>(); // 결과를 저장할 큐 // 범위를 지정하지 않아 무한정

        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요 (종료하려면 'exit' 입력): ");
            String input1 = sc.next();
            if (input1.equalsIgnoreCase("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            int num1 = Integer.parseInt(input1); //Integer.parseInt 문자열을 정수로 변환

            System.out.print("두 번째 숫자를 입력하세요: ");
            String input2 = sc.next();
            if (input2.equalsIgnoreCase("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            int num2 = Integer.parseInt(input2);


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
                        continue;

                }
            } // 만약 저장값이 10개가 되고 난후 추가로 저장을 원할 시 문구 출력 후 원하면 지우고 아니면


            System.out.println(result);

            results.add(result); // 새로운 결과를 큐에 추가

            System.out.print("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제) : ");
            String input3 = sc.next();
            if (input3.equalsIgnoreCase("remove")) {
                String removedResult = results.poll(); // 가장 먼저 저장된 결과를 삭제
                System.out.println("삭제된 결과: " + removedResult);


            }
        }

        System.out.println("저장된 연산 결과:");
        for (String res : results) {
            System.out.println(res);
        }
    }
}






