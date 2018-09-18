public class barkingDog {

    public static void main(String[] args) {
        System.out.println(bark(true, 11));
    }

    public static boolean bark(boolean barking, int hourOfDay) {

        if (barking) {
            if (((hourOfDay >= 0) && (hourOfDay < 8)) || (hourOfDay == 23)) {
                return true;
            }
        }
        return false;
    }
}
