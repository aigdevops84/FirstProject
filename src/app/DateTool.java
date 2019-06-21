package app;

import java.util.Calendar;
import java.util.Date;

public class DateTool {
    public static Date addHoursToNow(int hoursToAdd) {
        Date now = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(now);
        calendar.add(Calendar.HOUR, hoursToAdd);
        return calendar.getTime();

    }

    public static Date addMinuteToNow(int minutesToAdd) {
        Date now = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(now);
        calendar.add(Calendar.MINUTE, minutesToAdd);
        return calendar.getTime();
    }

    public static Date addDayToNow(int dayToAdd) {
        Date now = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(now);
        return now;

    }
}
