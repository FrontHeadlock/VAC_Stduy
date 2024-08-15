package casting;

public class Casting3 {
    public static void main(String[] args) {
        long maxIntvalue = 2147483647;
        long maxIntOver = 2147483648L;
        int intValue = 0;

        intValue = (int) maxIntvalue;
        System.out.println("maxIntValue casting=" + intValue);

        intValue = (int) maxIntOver;
        System.out.println("maxIntOver casting=" + intValue);
    }
}
