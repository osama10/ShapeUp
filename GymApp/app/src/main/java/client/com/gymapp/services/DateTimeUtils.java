package client.com.gymapp.services;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by haier_1 on 6/1/2017.
 */

public class DateTimeUtils {

    public static String getDateAndDay() {

        return new SimpleDateFormat("dd-MM-yyyy").format(new Date()) + " ( "+ getDay() + " )";
    }

    public static String getCurrentTime() {

        Calendar c = Calendar.getInstance();
        return c.getTime().toString().substring(10, 16);
    }

    public static String getDay() {
        String dayInString = "";

        Calendar calendar = Calendar.getInstance();
        int day = calendar.get(Calendar.DAY_OF_WEEK);

        switch (day) {

            case Calendar.SUNDAY:
                dayInString = "Sun";
                break;// Current day is Sunday

            case Calendar.MONDAY:
                dayInString = "Mon";
                break; // Current day is Monday

            case Calendar.TUESDAY:
                dayInString = "Tue";
                break;

            case Calendar.WEDNESDAY:
                dayInString = "Wed";
                break;
            case Calendar.THURSDAY:
                dayInString = "Thu";
                break;
            case Calendar.FRIDAY:
                dayInString = "Sun";
                break;
            case  Calendar.SATURDAY:
                dayInString = "Sat";
                break;
        }

        return  dayInString;
    }
}