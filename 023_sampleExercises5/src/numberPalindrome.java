public class numberPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(-23232));
    }

    public static boolean isPalindrome(int number) {

        int num = number;
        int counter = 0;
        int reverse = 0;
        int digit;

        while (Math.abs(num) > 0) {
            num = num / 10;
            counter++;
        }
        System.out.println(counter);
        num = Math.abs(number);
        for (int i = 0; i < counter; i++) {
            digit = num % 10;
            num = num / 10;
            reverse = reverse + digit * ((int) Math.pow(10, counter - (i + 1)));
            //System.out.println(reverse);
        }
        if (reverse == number) {
            return true;
        }
        return false;
    }
//    public static boolean isPalindrome(int number){
//        int num = number;
//        int reverse = 0;
//        int lastDigit;
//
//        while (Math.abs(num) > 0){
//            lastDigit = num % 10;
//            reverse = reverse * 10;
//            reverse = reverse + lastDigit;
//            num = num / 10;
//        }
//        if (reverse == number){
//            return true;
//        }
//        return false;
//    }
}