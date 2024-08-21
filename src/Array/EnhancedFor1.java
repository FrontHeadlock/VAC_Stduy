package Array;

public class EnhancedFor1 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};

        //일반 for문
        for(int i = 0;i< numbers.length;++i){
            int number=numbers[i];
            System.out.println(number);
        }

        //향상된 for문
        //종료조건 없고, 해당 배열을 단순 완전 탐색
        //:의 오른쪽에 numbers와 같이 탐색 배열 선택 후
        //:의 왼쪽에 int number와 같이 반복시마다 찾은 값을 저장할 변수 선언
        for(int number : numbers){
            System.out.println(number);
        }

        //for-each 사용할 수 없다면, 증가하는 인덱스 값 필요
        //향상된 for문에는 증가하는 인덱스 값이 감춰져 있어 int i 와 같이 증가하는 인덱스 값 직접 사용해야할 경우 사용불가
        for(int i =0;i<numbers.length;i++){
            System.out.println("number"+i+"번의 결과는: "+numbers[i]);
        }
    }
}
