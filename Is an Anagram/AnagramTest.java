package com.learn;
import java.io.*;
import java.util.*;

public class AnagramTest {

    public static void main(String[] args) {
	// write your code here

    Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();

        if(isAnagram(a,b))
            System.out.println("A is an anagram of B");
        else
            System.out.println("A is not an anagram of B");

    }

    static boolean isAnagram(String a, String b) {

        // Complete the function by writing your code here.
        char[] aChars = a.toLowerCase().toCharArray();
        List<Character> aList = new LinkedList<Character>();
        for(char c : aChars)
            aList.add(c);

        char[] bChars = b.toLowerCase().toCharArray();

        for(int i=0;i<bChars.length;i++){
            if(!aList.remove(new Character(bChars[i])))
                return false;
        }

        if(aList.size()!= 0)
            return false;

        return true;

    }
}
