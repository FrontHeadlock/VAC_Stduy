package Scanner;
import java.util.Scanner;

public class Scanner3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("첫 번째 숫자를 입력하세요 : ");
        int num1 = scanner.nextInt();
        System.out.print("2 번째 숫자를 입력하세요 : ");
        int num2 = scanner.nextInt();

        if(num1 > num2){
            System.out.printf("더 큰 숫자 : %d",num1 );
        }else if (num2 > num1){
            System.out.printf("더 큰 숫자 : %d",num2 );
        }else{
            System.out.printf("두 숫자는 같습니다");
        }
    }

}
