public class numberOfDaysInMonth {

    public static void main(String[] args) {

        System.out.println(isLeapYear(2000));
        System.out.println(getDaysInMonth(-1, 2018));
    }

    public static boolean isLeapYear(int year) {
        if ((year < 1) || (year > 9999)) {
            return false;
        }
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            return true;
        }
        return false;
    }

    public static int getDaysInMonth(int month, int year) {
//        if ((month < 1) || (month > 12)) {
//            return -1;
//        }
        if ((year < 1) || (year > 9999)) {
            return -1;
        }
//        if (month == 2) {
//            if (isLeapYear(year)) {
//                return 29;
//            } else {
//                return 28;
//            }
//        }
//        if (month <= 7) {
//            if (month % 2 == 0) {
//                return 30;
//            } else {
//                return 31;
//            }
//        }
//        if (month % 2 == 0) {
//            return 31;
//        } else {
//            return 30;
//        }
        switch (month) {
            case 1:
                return 31;
            case 2:
                if (isLeapYear(year)) {
                    return 29;
                } else {
                    return 28;
                }
            case 3:
                return 31;
            case 4:
                return 30;
            case 5:
                return 31;
            case 6:
                return 30;
            case 7:
                return 31;
            case 8:
                return 31;
            case 9:
                return 30;
            case 10:
                return 31;
            case 11:
                return 30;
            case 12:
                return 31;
            default:
                return -1;
        }
    }
}
