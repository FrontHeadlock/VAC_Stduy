package method;

public class MethodValue2 {
    public static void main(String[] args) {
        int num =5;
        System.out.printf("1. changeNum 호출 전, number : %d",num);
        changeNumber(num);
        System.out.printf("4. changeNum 호출 후, number : %d",num);
    }
    public static void changeNumber(int num){
        System.out.printf("2.changeNum 변경 전, number : %d",num);
        num = num*2;
        System.out.printf("3.changeNum 변경 후, number : %d",num);
    }
}
