package Array;

public class ArrayDi4 {
    public static void main(String[] args) {
        int[][]arr= new int[2][3];
        int i =1;
        for(int row = 0; row<arr.length; row++){
            for(int column = 0; column<arr[row].length;column++){
                arr[row][column] = i++;                   //i값을 1에서부터 하나씩 증가시키며 배열에 넣는다
            }
        }
        for(int row=0; row<arr.length;row++){             //배열값 출력
            for(int column = 0; column<arr[row].length;column++){
                System.out.print(arr[row][column]+" ");
            }
            System.out.println();
        }
    }
}
