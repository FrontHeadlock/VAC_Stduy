package EX;

public class ExchangeRateEx {
    public static void main(String[] args) {
        int dollar = 10;
        int won = dollar * 1300;
        if(dollar < 0){
            System.out.println("잘못된 금액입니다.");
        }else if(dollar == 0){
            System.out.println("환전할 금액이 없습니다.");
        }else{
            System.out.printf("환전 금액은 %d입니다",won);
        }
    }

}
