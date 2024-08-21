package Array.ex;
import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력받을 숫자의 개수를 입력하세요 : ");
        int cnt = scanner.nextInt();

        int[] numbers = new int[cnt];
        int sum =0;
        double avg;

        System.out.printf("%d개의 정수를 입력하세요\n",cnt);
        for(int i =0;i<cnt;i++){
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }

        avg = (double)sum/cnt;
        System.out.printf("입력한 점수의 합계 %d\n",sum);
        System.out.printf("입력한 점수의 평균 %.1f",avg );
    }
}
