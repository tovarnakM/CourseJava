public class numberToWords {

    public static void main(String[] args) {
        numberToWords(50);
    }
    public static int getDigitCount(int number){
        if (number < 0){
            return -1;
        }
        int counter = 0;
        int num = number;
        while (num >= 0){
            counter++;
            if (num / 10 == 0){
                return counter;
            }
            num /= 10;
        }
        return counter;
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }
        int counter = 0;
        int num = number;
        while (true){
            counter++;
            if (num / 10 == 0){
                break;
            }else {
                num /= 10;
            }
        }
        num = reverse(number);
        for (int i = 0; i < counter; i++){
            int digit = num % 10;
            switch (digit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
            num /= 10;
        }
    }
    public static int reverse(int number){

        int counter = 0;
        int num = number;
        while (Math.abs(num) > 0){
            counter++;
            if (num / 10 == 0){
                break;
            }
            num /= 10;
        }

        int reverse = 0;
        num = number;
        for (int i = 0; i < counter; i++){
            int digit = num % 10;
            reverse = (int) (reverse + digit * (Math.pow(10,counter - (i+1))));
            num /= 10;
        }
        return reverse;
    }
}









