public class lastDigitChecker {

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41,10,555));
    }

    public static boolean hasSameLastDigit(int num1, int num2, int num3){
        if ((num1 < 10) || (num2 < 10) || ( num3 < 10)){
            return false;
        }if ((num1 > 1000) || (num2 > 10000) || ( num3 > 1000)){
            return false;
        }
        int digit1 = num1 % 10;
        int digit2 = num2 % 10;
        int digit3 = num3 % 10;

        if ((digit1 == digit2) || (digit2 == digit3) || (digit3 == digit1)){
            return true;
        }
        return false;
    }
}
