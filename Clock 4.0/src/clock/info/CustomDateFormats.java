/*
 This class is used to get time in an easy way
 */
package clock.info;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author ISSA-PC
 */
public class CustomDateFormats {

    public static String getTime() { // Get Time
        DateFormat timeFormat = new SimpleDateFormat("HH:mm:ss"); // Create a DateFormat object with custom date format
        Date date = new Date();
        String time = timeFormat.format(date);  // Getting Time as String
        return time;

    }

    public static String getAM_PM() { // Get AM/PM

        int time = Calendar.AM_PM; 

        if (time == 0) 
            return "PM";
         else 
            return "AM";
        
    }
}
