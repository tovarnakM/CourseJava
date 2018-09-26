public class sharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(21,11));
    }
    public static boolean hasSharedDigit(int num1, int num2){
        if ((num1 < 10) || (num1 > 99)){
            return false;
        }
        if ((num2 < 10) || (num2 > 99)){
            return false;
        }
        int digit1 = num1 % 10;
        int digit2 = num2 % 10;

        if ((digit1 == digit2) || (digit1 == num2 / 10)){
            return true;
        }else if ((num1 / 10 == num2 / 10 ) || (num1 / 10 == digit2)){
            return true;
        }
        return false;
    }
}
