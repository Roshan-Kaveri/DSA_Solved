package gfg_160.priority_q;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class Median_Stream {

    // https://www.geeksforgeeks.org/problems/find-median-in-a-stream-1587115620/1
    public ArrayList<Double> getMedian(int[] arr) {
        int n = arr.length;
        ArrayList<Double> res = new ArrayList<>();

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>
                (Collections.reverseOrder());
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : arr) {
            maxHeap.add(num);

            if (!maxHeap.isEmpty() && !minHeap.isEmpty()
                    && maxHeap.peek() > minHeap.peek()) {
                minHeap.add(maxHeap.poll());
            }

            if (maxHeap.size() > minHeap.size() + 1) {
                minHeap.add(maxHeap.poll());
            } else if (minHeap.size() > maxHeap.size()) {
                maxHeap.add(minHeap.poll());
            }

            if (maxHeap.size() > minHeap.size()) {
                res.add((double) maxHeap.peek());
            } else {
                res.add((maxHeap.peek() +
                        minHeap.peek()) / 2.0);
            }
        }

        return res;
    }
}
