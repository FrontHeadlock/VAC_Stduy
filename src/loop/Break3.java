package loop;

public class Break3 {
    public static void main(String[] args) {
        int sum = 0;

        for(int i = 1; ;i++){
            sum += i;
            if (sum > 10){
                System.out.printf("합이 10보다 크면 종료 : i=%d sum=%d",i,sum);
                break;
            }
        }
    }
}
