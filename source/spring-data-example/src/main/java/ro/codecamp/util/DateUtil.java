/**
 * 
 */
package ro.codecamp.util;

import java.util.Calendar;
import java.util.Date;

/**
 * Utility class for dates handling.
 * 
 * @author Cosmin Spinu (cosmin.spinu@tss-yonder.com)
 * @since 11 apr. 2016
 */
public final class DateUtil {
    
    private DateUtil(){
    }
    
    public static Date createDate(int year, int month, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, day);
        return calendar.getTime();
    }
    
    public static Date now() {
        return new Date();
    }
}