package cl.utils;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.Locale;

public class FunctionsUtils {

    public static String getFormattedDate(String pattern, String stringDate) throws Exception {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern, Locale.ENGLISH);
        Date date = stringParseToDate(stringDate);
        return simpleDateFormat.format(date);
    }

    public static String getNewMail() {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        Instant instant = timestamp.toInstant();
        return instant.toEpochMilli() + "cl@gmail.com";
    }

    private static Date stringParseToDate(String stringDate) throws Exception {
        try {
            return new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(stringDate);
        } catch (Exception e) {
            throw new Exception("Error: no se pudo parsear la fecha con el string: " + stringDate);
        }
    }


}
