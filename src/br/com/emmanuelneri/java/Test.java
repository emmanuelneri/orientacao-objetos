package br.com.emmanuelneri.java;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Test {

    public static void main(String[] args) {


        LocalDate localDate = LocalDate.of(2019, 3, 22);
        System.out.println(localDate.plusYears(1));

        LocalDateTime localDateTime = LocalDateTime.of(2019, 3, 22, 22, 00);
        System.out.println(localDateTime.plusHours(1));


        System.out.println(localDate.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));

    }

}
