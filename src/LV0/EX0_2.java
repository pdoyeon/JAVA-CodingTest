package LV0;

import java.util.Scanner;

public class EX0_2 {
    public static void main(String[] args) {
        // 일반적으로 두 선분이 이루는 각도는 한 바퀴를 360도로 하여 표현한다.
        // 따라서 각도에 360의 배수를 더하거나 빼더라도 같은 각을 의미한다.
        // 예를 들면, 30도와 390도는 같은 각도이다.
        // 두 정수 angle1과 angle2가 주어질 때, 이 두 각의 합을 0도 이상 360도 미만으로 출력
        Scanner sc = new Scanner(System.in);
        int angle1 = sc.nextInt();
        int angle2 = sc.nextInt();

        int sum_angle = angle1 + angle2;
        // sum_angle % 360의 나머지 값을 구한다.
        System.out.println(sum_angle & 360);
    }
}
