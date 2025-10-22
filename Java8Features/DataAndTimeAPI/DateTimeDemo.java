package Java8Features.DataAndTimeAPI;

import java.time.*;

public class DateTimeDemo {
    public static void main(String[] args) {

        // Current date
        LocalDate date = LocalDate.now();
        System.out.println("Current Date: " + date);

        // Current time
        LocalTime time = LocalTime.now();
        System.out.println("Current Time: " + time);

        // Current date and time
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Current DateTime: " + dateTime);

        // Specific date
        LocalDate dob = LocalDate.of(2002, 5, 14);
        System.out.println("My DOB: " + dob);

        // Add or subtract days/months/years
        LocalDate nextWeek = date.plusWeeks(1);
        System.out.println("Next Week: " + nextWeek);

        LocalDate lastMonth = date.minusMonths(1);
        System.out.println("Last Month: " + lastMonth);

        // Calculate period between two dates
        Period age = Period.between(dob, date);
        System.out.println("Age: " + age.getYears() + " years");

        // Working with time zones
        ZonedDateTime zoned = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println("Zoned DateTime: " + zoned);
    }
}
