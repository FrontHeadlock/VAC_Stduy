package loop;

public class WhileEx3 {
    public static void main(String[] args) {
        int max=0;
        int num =0;
        while(num <101) {
            System.out.println(num);
            max += num;
            System.out.println(max);
            num++;
        }
    }
}
