// 2016111540 ¿Ã¡÷øµ

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.text.DecimalFormat;
import java.text.MessageFormat;

/** Specifies basic formatting for dates, integers, money, and people */
public class BasicFormat {
    public static String formatDate( Date date ) {
        return new SimpleDateFormat("d MMM yyyy").format(new GregorianCalendar(date.getYear() + 1900, date.getMonth() - 1,date.getDate()).getTime());
    }
    /** Formats a date
     * @param year Full integral value of the year, e.g. 1945, 2008
     * @param month Zero-based month index, e.g. 0 is January, 6 is July
     * @param day One-based day of the month
     */
    public static String formatDate( int year, int month, int day ) {
    	month--;
        return new SimpleDateFormat("d MMM yyyy").format(new GregorianCalendar(year, month, day).getTime());
    }
    public static String formatLong ( long number ) {
        return new DecimalFormat("#,###").format(number);
    }
    public static String formatMoney ( double amount )  {
        return new DecimalFormat("$ #,##0.##").format(amount);
    }
    public static String formatPerson ( String firstName, String lastName, String userName) {
        return new MessageFormat("{0}, {1} [{2}]").format(new Object[] {firstName, lastName,userName});
    }
    
    public static void main(String[] args) {
    	/* Tests */
        System.out.println("Date: " + BasicFormat.formatDate(new GregorianCalendar(2011, 5, 24).getTime()));
        System.out.println("Date: " +  BasicFormat.formatDate(2011, 6, 25));
        System.out.println("Integer: " + BasicFormat.formatLong(1234567));
        System.out.println("Integer: " + BasicFormat.formatLong(68));
        System.out.println("Money: " + BasicFormat.formatMoney(9812345.68));
        System.out.println("Money: " + BasicFormat.formatMoney(9812345));
        System.out.println("Money: " + BasicFormat.formatMoney(.78));
        System.out.println("Person: " + BasicFormat.formatPerson("Weinman","Jerod","winman"));
    }
}
