package Scanner;
import java.util.Scanner;

public class ScannerWhile1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.printf("문자열을 입력하세요(exit = 종료) : ");
            String str = scanner.nextLine();
            if(str.equals("exit")){
                System.out.println("프로그램을 종료합니다");
                break;
            }
            System.out.printf("입력한 문자열 : %s\n",str);
        }
    }
}
