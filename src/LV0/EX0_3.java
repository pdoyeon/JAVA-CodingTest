package LV0;

import java.util.Scanner;

public class EX0_3 {
    public static void main(String[] args) {
        // 2자리 이상의 정수 number가 주어집니다. 주어진 코드는 이 수를 2자리씩 자른 뒤,
        // 다른 수를 모두 더해서 그 합을 출력하는 코드입니다.
        // 코드가 올바르게 작동하도록 한 줄을 수정해주세요.
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();  // 2자리 이상의 정수가 주어짐
        int answer = 0;             // 답을 넣을 변수

        // 1이 아닌 number로 바꾸어야 한다.
        for(int i=0; i<number; i++){
            answer += number % 100; // 100으로 나누어 4859 중 50를 answer에 먼저 더함
            number /= 100;  // 남은 4800을 100으로 나누어 48로 만듦
        }

        System.out.println(answer);
    }
}
