package ProbandoNuevasCosas;

import java.math.BigDecimal;
import java.math.RoundingMode;

/*
* Se dice que para un sistma POS BigDecimal es ideal,
* */
public class probandoBigDecimal {
    public static void main(String[] args) {
        BigDecimal cantidad = new BigDecimal(21.9645);
        BigDecimal cantidad2 = new BigDecimal(10);
        //System.out.println(cantidad.subtract(cantidad2));
        System.out.println(String.format("%.0f", cantidad));
        //double hoals = 21;
        //System.out.println(hoals+4);
    }
}
