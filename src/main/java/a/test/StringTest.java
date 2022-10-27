package a.test;

import org.apache.commons.lang3.StringUtils;

public class StringTest {

    public static void main(String[] args) {
        String s = "\\hhh";

        System.out.println(s);


        System.out.println(StringUtils.replace(s, "\\", "123"));
    }
}
