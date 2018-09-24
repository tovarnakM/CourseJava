public class minutesToYearsAndDaysCalculator {

    public static void main(String[] args) {

        printYearsAndDays(-1);
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            int h = 60;
            int day = h * 24;
            int year = day * 365;

            long years = minutes / year;
            long days = (minutes % year) / day;

            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
    }
}
