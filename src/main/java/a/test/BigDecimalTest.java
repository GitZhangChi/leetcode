package a.test;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

public class BigDecimalTest {

    public static void main(String[] args) {


        System.out.println(Objects.equals(new BigDecimal("188.00"),new BigDecimal("188")));
        System.out.println(new BigDecimal("188.00").compareTo(new BigDecimal("1818")));


        System.out.println(new Date().getTime());
        System.out.println(System.currentTimeMillis());


    }
}
