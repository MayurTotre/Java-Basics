package java_basics6;

import org.w3c.dom.ls.LSOutput;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;

public class DateTime {
    public static void main(String[] args) {
        LocalDate d = LocalDate.now();
        System.out.println(d);

        for(String s : ZoneId.getAvailableZoneIds()){
//            System.out.println(s);
        }

        LocalTime t = LocalTime.now();

//        LocalTime ts = LocalTime.now("GMT");
//
        Instant i = Instant.now();
        System.out.println(i);
        System.out.println(t);
    }


}
