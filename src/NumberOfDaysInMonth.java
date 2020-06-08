public class NumberOfDaysInMonth {
    public static void main(String[] args) {
        System.out.println(isLeapYear(1997));
        System.out.println(getDaysInMonth(6,2020));
    }


    public static boolean isLeapYear (int year){
        if (year <= 1 || year >= 9999){
            return false;
        } else if (year % 4 == 0){
            if(year % 100 == 0 ){
                if (year % 400 == 0){
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public static int getDaysInMonth (int month, int year){
        if((month < 1) || (month > 12) || (year < 1) || (year > 9999)) {
            return -1;
        }
           else if (isLeapYear(year)) {
                switch (month) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        return 31;

                    case 2:
                        return 29;

                    default:
                        return 30;

                }

            } else {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    return 31;

                case 2:
                    return 28;

                default:
                    return 30;

            }
        }
    }
}
