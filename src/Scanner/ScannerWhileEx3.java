package Scanner;
import java.util.Scanner;

public class ScannerWhileEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum =0;
        int cnt =0;
        int input =0;
        System.out.println("숫자를 입력하세요. EOF는 -1입니다");
        while(true){
            input = scanner.nextInt();
            if(input==-1){
                break;
            }
            sum+=input;
            cnt++;
        }
        double avg = (double)sum/cnt;
        System.out.printf("입력한 숫자들의 합계 : %d\n",sum);
        System.out.printf("입력한 숫자들의 평균 : %f",avg);
    }
}
