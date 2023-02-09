package lesson21.second;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

import static java.util.Calendar.FEBRUARY;

public class SomeDateClass {
    public static void main(String[] args) {
        Date date = new Date(123, FEBRUARY, 9);
        System.out.println(date);
        System.out.println(toLocalDateConverter(date));
        System.out.println(toLocalTimeConverter(date));
        System.out.println(toLocalDateTimeConverter(date));
    }

    static LocalDate toLocalDateConverter(Date date) {
        return date.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
    }

    static LocalTime toLocalTimeConverter(Date date) {
        return date.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalTime();
    }

    static LocalDateTime toLocalDateTimeConverter(Date date) {
        return date.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDateTime();
    }
}
