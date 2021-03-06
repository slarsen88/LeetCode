/**
 * Amazon Media Encoder
 * Whenever a media file needs to be processed by the encoder, it partitions the media file into N subfiles.
 * Each subfile is processed independently. During this process each sub-file gets compressed. These
 * compressed sub-files are then merged by the encoder.
 *
 * The encoder can merge only two files at a time. The time required to merge the two files is equal to the sum of
 * their sizes. This process is repeated until the N sub files are merged into a single output file. Write an algorithm
 * to output the minimum possible time to merge the given N subfiles into a single file.
 *
 * INPUT: The input of the function/method consists of one argument - fileSizes, a list of integers
 * representing the size of the compressed subfiles.
 *
 *
 * OUTPUT: Return an integer representing the minimum time required to merge all the subfiles.
 *
 * Example
 * Input: fileSizes = [4,8,6,12]
 *
 * Output: 58
 *
 * Explanation:
 * Step 1: merge 4 and 6 (time required is 10) size of subfiles after mergine: [8,10,12]
 * Step 2: merge 8 and 10 (time required is 18) size of subfiles after merge: [18, 12]
 * Step 3: merge 18 and 12 (time required is 30) total tiem required to merge the files is 10 + 18 + 30 = 58
 */
package AmazonCodingChallenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class Solution {
    public static void main(String[] args) {
        List<Integer> listOfInts = new ArrayList<>();
        listOfInts.add(4);
//        listOfInts.add(8);
//        listOfInts.add(6);
//        listOfInts.add(12);
        System.out.println(mergeFiles(listOfInts));
    }

//    public static int mergeFiles(List<Integer> fileSizes) {
//
//        if (fileSizes.size() == 1) {
//            return fileSizes.get(0);
//        }
//
//        if (fileSizes == null) {
//            return 0;
//        }
//
//        if (fileSizes.isEmpty()) {
//            return 0;
//        }
//
//        // Sort list of file sizes
//        Collections.sort(fileSizes);
//
//        // retrieve smallest two values in sorted array and remove them
//        int initialTwoFileSizes = fileSizes.get(0) + fileSizes.get(1);
//        fileSizes.remove(0);
//        fileSizes.remove(0);
//        fileSizes.add(0, initialTwoFileSizes);
//        for (int i = 0; i < fileSizes.size() - 1; i++) {
//            int mergedFileSize = fileSizes.get(i) + fileSizes.get(i + 1);
//            fileSizes.remove(i + 1);
//            fileSizes.add(i + 1, mergedFileSize);
//        }
//
//        int timeToMergeAllfiles = 0;
//        for (int i = 0; i < fileSizes.size(); i++) {
//            timeToMergeAllfiles += fileSizes.get(i);
//        }
//
//
//        return timeToMergeAllfiles;
//    }

    public static int mergeFiles(List<Integer> fileSizes) {
        if (fileSizes == null) {
            return 0;
        }

        if (fileSizes.size() == 1) {
            return fileSizes.get(0);
        }

        // Add all items in array list to priority queue
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(fileSizes);
        int timeToMergeAllfiles = 0;

        // Iterate over priority queue taking the top two values, summing them, then adding them back to the
        // priority queue. Sum all pairs and return.
        while (priorityQueue.size() > 1) {
            int firstFile = priorityQueue.poll();
            int secondFile = priorityQueue.poll();
            int timeToMergeTwoFiles = firstFile + secondFile;
            priorityQueue.add(timeToMergeTwoFiles);
            timeToMergeAllfiles += timeToMergeTwoFiles;
        }
        return timeToMergeAllfiles;
    }


}
