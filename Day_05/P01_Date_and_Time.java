package Day_05;

import java.util.Calendar;
import java.util.Locale;

public class P01_Date_and_Time {
     public static String findDay(int month, int day, int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);
        String dayOfWeek = calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.ENGLISH);
        return dayOfWeek.toUpperCase();
    }
}
