package com.learn;
import java.util.*;

/**
 * Created by avasquez on 8/3/16.
 */

public class Tokenizer {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();

        StringTokenizer stkn = new StringTokenizer(s,"[ !,?._'@]+");

        System.out.println(stkn.countTokens());

        while(stkn.hasMoreElements())
            System.out.println(stkn.nextElement());
    }
}
