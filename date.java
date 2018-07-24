import java.util.*;
import java.lang.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

//printing date and time

class date
{  
 public static void main(String args[])
 {
    SimpleDateFormat cdt = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");
		cdt.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("GMT")));
		
		System.out.println("\nNow: "+cdt.format(System.currentTimeMillis()));
}
}
  
