public class firstAndLastDigitSum {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(2254540));
    }

    public static int sumFirstAndLastDigit(int number){
        if (number < 0){
            return -1;
        }
        int sumDigit;
        int lastDigit = number % 10;
        int firstDigit;
        int num = number;

        while (true){
            if (num / 10 == 0){
                firstDigit = num;
                break;
            }else {
                num /= 10;
            }
        }
        sumDigit = firstDigit + lastDigit;
        return sumDigit;
    }
}
