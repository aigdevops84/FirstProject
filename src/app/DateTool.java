package app;

import java.util.Calendar;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class DateTool {


    private static final Calendar calendar = Calendar.getInstance();

    public static Date addHoursToNow(int hoursToAdd) {
        calendar.setTime(new Date());
        calendar.add(Calendar.HOUR, hoursToAdd);
        return calendar.getTime();

    }

    public static Date addMinuteToNow(int minutesToAdd) {
        calendar.setTime(new Date());
        calendar.add(Calendar.MINUTE, minutesToAdd);
        return calendar.getTime();
    }

    public static Date addDayToNow(int dayToAdd) {
        calendar.setTime(new Date());
        calendar.add(Calendar.DAY_OF_YEAR, dayToAdd);
        calendar.setTime(now);
        return calendar.getTime();

    }

    public static String dateToString {
            calendar.setTime(new Date());
            DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
            String strDate = dateFormat.format(calendar);
            return strDate;

        }
    public static Date stringToDate (String dateCur) {
        Date date=new SimpleDateFormat("dd/MM/yyyy").parse(dateCur);
        return date;

    }
        public static void main(String[] args) {

    }
}
