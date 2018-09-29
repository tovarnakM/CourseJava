public class largestPrime {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
    }

    public static int getLargestPrime(int number) {

        int largestPrimeNumber = -1;
        int prime = 2;

        for (int j = 0; j < number; j++) {
            int counter = 0;
            for (int i = 1; i <= prime; i++) {
                if (prime % i == 0) {
                    counter++;
                }
            }
            if ((counter == 2) && (number % prime == 0)) {
                largestPrimeNumber = prime;
                prime++;
            } else {
                prime++;
            }
        }
        return largestPrimeNumber;
    }
}
