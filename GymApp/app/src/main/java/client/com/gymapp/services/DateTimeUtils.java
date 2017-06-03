package client.com.gymapp.services;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by haier_1 on 6/1/2017.
 */

public class DateTimeUtils {

    public static String getDateAndDay() {

        return new SimpleDateFormat("dd-MM-yyyy").format(new Date()) + " ( "+ getDay() + " )";
    }

    public static String getCurrentTimeInString() {

        Calendar c = Calendar.getInstance();
        return c.getTime().toString().substring(10, 16);
    }

    public static Date getCurrentTimeInDate() {

        Calendar c = Calendar.getInstance();
        return c.getTime();
    }

    public static String getTotalMinutes(Date startTime , Date endTime){

        Long diff = endTime.getTime() - startTime.getTime() ;

        Long time = TimeUnit.MILLISECONDS.toMinutes(diff);

        if(time > 60){

            time = TimeUnit.MILLISECONDS.toHours(diff);
            return time + " hours" ;
        }

        else {

            return time + " minutes" ;

        }

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
                dayInString = "Fri";
                break;
            case  Calendar.SATURDAY:
                dayInString = "Sat";
                break;
        }

        return  dayInString;
    }

    public static String getDayComplete() {
        String dayInString = "";

        Calendar calendar = Calendar.getInstance();
        int day = calendar.get(Calendar.DAY_OF_WEEK);

        switch (day) {

            case Calendar.SUNDAY:
                dayInString = "Sunday";
                break;// Current day is Sunday

            case Calendar.MONDAY:
                dayInString = "Monday";
                break; // Current day is Monday

            case Calendar.TUESDAY:
                dayInString = "Tuesday";
                break;

            case Calendar.WEDNESDAY:
                dayInString = "Wednesday";
                break;
            case Calendar.THURSDAY:
                dayInString = "Thursday";
                break;
            case Calendar.FRIDAY:
                dayInString = "Friday";
                break;
            case  Calendar.SATURDAY:
                dayInString = "Saturday";
                break;
        }

        return  dayInString;
    }


}