package Leetcode;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class KthLargest {
    public int findKthLargest(int[] a, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue(Collections.singleton(new Comparator<Integer>() {

            @Override
            public int compare(Integer x, Integer y) {
                return x - y;
            }
        }));

        for(int  i : a){
            if(pq.size() == 0 )pq.add(i);
            else if(pq.size() == k){
                pq.add(i);
                pq.poll();

            }

            else{
                pq.add(i);
            }
        }

        return pq.peek();
    }
}
