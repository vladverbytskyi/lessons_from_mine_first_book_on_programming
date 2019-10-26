package Prog_2_Calculator;


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Calculator {
    public static void main(String[] args) throws Exception {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        String str = bfr.readLine();
        float a = Float.parseFloat(str);
        String y = bfr.readLine();
        String x = bfr.readLine();
        float a1 = Float.parseFloat(x);
        float res = 0;
            if (y.equals("+")){
                res = a + a1;
            }
            if (y.equals("-")){
                res = a - a1;
            }
            if (y.equals("/")){
                res = a / a1;
            }
            if (y.equals("*")) {
                res = a * a1;
            }
        System.out.println(res);

    }
}
