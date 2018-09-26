public class evenDigitSum {

    public static void main(String[] args) {

        System.out.println(getEvenDigitSum(123456789));
    }
    public static int getEvenDigitSum(int number){
        if (number < 0){
            return -1;
        }
        int num = number;
        int sumEvenDigits = 0;
        while (true){
            if (num % 2 == 0){
                sumEvenDigits = sumEvenDigits + (num % 10);
                num = num / 10;
                    if (num == 0){
                        return sumEvenDigits;
                    }
            }else {
                num = num / 10;
            }
        }
    }
}