package loop;

public class Break2 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        for(;;){
            sum += i;
            if(sum>10){
                System.out.printf("합이 10보다 크면 종료: i = %d sum = %d\n",i,sum);
                break;
            }
            i++;
        }
    }
}
