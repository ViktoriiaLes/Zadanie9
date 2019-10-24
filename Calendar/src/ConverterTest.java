public class ConverterTest {
    public static void main(String[] args) {
        for (int dayNumber = 1; dayNumber <=7; dayNumber++) {
            System.out.println(dayNumber + " dzien tygodnia to " + CalendarConverter.convertDayToString(dayNumber));
        }
        int dayNumber=10;
        System.out.println(dayNumber + " dzien tygodnia to " + CalendarConverter.convertDayToString(dayNumber));
    }
}
