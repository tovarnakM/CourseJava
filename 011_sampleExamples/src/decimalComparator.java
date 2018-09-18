public class decimalComparator {

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(3.001,3.000));
    }

    public static boolean areEqualByThreeDecimalPlaces(double number1, double number2) {

        int decimal1 = (int)(number1 * 1000);
        int decimal2 = (int)(number2 * 1000);

        if (decimal1 == decimal2){
            return true;
        }
        return false;
    }
}
