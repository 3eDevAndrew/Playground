package com.learn;
import java.util.*;

/**
 * Created by avasquez on 8/3/16.
 */
public class MinMaxStringFinder {

    public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner in = new Scanner(System.in);
        String x = in.next();
        in.nextLine();
        int n = in.nextInt();

        PriorityQueue<String> minHeap = new PriorityQueue<String>();
        PriorityQueue<String> maxHeap = new PriorityQueue<String>(x.length()-(n-1), Collections.reverseOrder());

        for(int j=0; j <= x.length()-n; j++){
            minHeap.add(x.substring(j,j+n));
            maxHeap.add(x.substring(j,j+n));
        }

        System.out.println(minHeap.poll());
        System.out.println(maxHeap.poll());
    }
}
