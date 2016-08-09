package com.learn;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Created by avasquez on 8/8/16.
 */
public class RunningMedian {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner in = new Scanner(System.in);
        int numOfInputs = in.nextInt();

        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(numOfInputs, Collections.reverseOrder());
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();

        int initialVal = in.nextInt();

        maxHeap.add(Integer.valueOf(initialVal));
        System.out.println((double)initialVal);

        for(int index=0; index < (numOfInputs-1); index++){
            int newVal = in.nextInt();

            //Add to max heap and min heap
            if(newVal >= maxHeap.peek())
                minHeap.add(Integer.valueOf(newVal));
            else
                maxHeap.add(Integer.valueOf(newVal));

            //Balance if needed
            if(minHeap.size() > (maxHeap.size()+1))
                maxHeap.add(minHeap.poll());

            if(maxHeap.size() > (minHeap.size()+1))
                minHeap.add(maxHeap.poll());

            //Select or Calculate
            if(minHeap.size() > maxHeap.size())
                System.out.println((double)minHeap.peek().intValue());
            else if(maxHeap.size() > minHeap.size())
                System.out.println((double)maxHeap.peek().intValue());
            else{
                double avgMed = ((double)minHeap.peek().intValue() + (double)maxHeap.peek().intValue())/2;
                System.out.println(avgMed);
            }

        }
    }
}

