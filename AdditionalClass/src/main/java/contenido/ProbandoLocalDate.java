package contenido;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ProbandoLocalDate {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();

        DateTimeFormatter formatear1 =
                DateTimeFormatter.ISO_LOCAL_DATE;
        DateTimeFormatter formatear2 =
                DateTimeFormatter.ISO_LOCAL_DATE_TIME;

        //System.out.println(localDate.format(formatear1));
        System.out.println(String.format("'%s'",localDate.format(formatear1)));
        byte hola = 0;
        System.out.println(String.format("'%d'",hola));

    }
}
