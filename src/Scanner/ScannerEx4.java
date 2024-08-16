package Scanner;
import java.util.Scanner;

public class ScannerEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("구구단의 단수를 입력하세요 : ");
        int n = scanner.nextInt();
        System.out.printf("%d단의 구구단 : \n",n);
        int m=1;
        while(m<10){
            System.out.printf("%d * %d = %d\n",n,m,n*m);
            m++;
        }
    }
}
