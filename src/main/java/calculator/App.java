package calculator;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        String[] results = new String[10]; // 결과를 저장할 배열
//        int count = 0; // 저장된 결과의 개수를 추적할 카운터 변수
        Queue<String> results = new LinkedList<>(); // 결과를 저장할 큐
        final int MAX_SIZE = 10; // 큐의 최대 크기

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
            }
//            System.out.println("결과 : " + result);
//            if (count < results.length) {
//                results[count] = result; // 결과를 배열에 저장
//                count++; // 카운터 증가
//            } else {
//                System.out.println("결과 배열이 가득 찼습니다. 더 이상 저장할 수 없습니다.");
//            }
//        }
//        System.out.println(result);

            if (results.size() >= MAX_SIZE) {
                results.poll(); // 큐가 가득 찼으면 가장 오래된 결과를 제거
            }
            results.add(result); // 새로운 결과를 큐에 추가

            // 저장된 연산 결과 출력
            System.out.println("저장된 연산 결과:");
            for (String res : results) {
                System.out.println(res);


            }
        }
    }
}





