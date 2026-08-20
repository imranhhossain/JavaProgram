import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class p_38_date_time {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis()/1000/3600/24/365);

        Date d = new Date();
        System.out.println(d.getTime());
        System.out.println(d.getDate());
        System.out.println(d.getYear());

        //Calendar
        Calendar c = Calendar.getInstance();
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone().getID());

        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.HOUR));
        System.out.println(c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));

        //GregorianCalendar
        GregorianCalendar cal = new GregorianCalendar();
        System.out.println(cal.isLeapYear(2020));
        System.out.println(TimeZone.getAvailableIDs()[0]);
        System.out.println(TimeZone.getAvailableIDs()[1]);
        System.out.println(TimeZone.getAvailableIDs()[2]);
        System.out.println(TimeZone.getDefault().getID());

        //From java.time
        LocalDate ld= LocalDate.now();
        System.out.println(ld);
        System.out.println(ld.getDayOfMonth());
        System.out.println(ld.getDayOfWeek());
        System.out.println(ld.getMonth());


        LocalTime lt= LocalTime.now();
        System.out.println(lt);
        System.out.println(lt.getHour());
        System.out.println(lt.getMinute());
        System.out.println(lt.getSecond());


        LocalDateTime ldt= LocalDateTime.now();
        System.out.println(ldt);


        //
        DateTimeFormatter dtf= DateTimeFormatter.ofPattern("dd/MM/yyyy -- HH:mm:ss");
//        DateTimeFormatter dtf= DateTimeFormatter.ISO_DATE_TIME;
        System.out.println(ldt.format(dtf));


    }
}
