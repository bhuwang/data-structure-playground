/**
 * 
 */
package com.bhuwan.datastructure.analysis;

import java.io.IOException;
import java.nio.file.Paths;

/**
 * @author bhuwan
 *
 */
public class ThreeSum {

    public static int count(int[] array) {

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                for (int k = j + 1; k < array.length; k++) {
                    if (array[i] + array[j] + array[k] == 0) {
                        // System.out.println(array[i] + " " + array[j] + " " + array[k] + " = " + (array[i] + array[j] + array[k]));
                        count++;
                    }
                }
            }
        }
        return count;
    }

    /**
     * @param args
     * @throws IOException
     * @throws InterruptedException
     */
    public static void main(String[] args) throws IOException, InterruptedException {
        // int[] intArray = { 30, -40, -10, -20, 40, 0, 10, 5 };
        // sleep for 5 sec
        // TimeUnit.SECONDS.sleep(5);
        // sleep for 5 min
        // TimeUnit.MINUTES.sleep(5);
        // sleep for 5 hrs
        // TimeUnit.HOURS.sleep(5);
        System.out.println("Running 1K ints .............");
        int[] oneKArray = FileUtils.readAllInts(Paths.get("src/com/bhuwan/datastructure/analysis/1Kints.txt"));

        long startTime = System.nanoTime();
        System.out.println("Total Iteration: " + ThreeSum.count(oneKArray));
        System.out.println("Elapsed Time(ms): " + (System.nanoTime() - startTime) / 1000000);

        System.out.println("\nRunning 2K ints .............");
        int[] twoKArray = FileUtils.readAllInts(Paths.get("src/com/bhuwan/datastructure/analysis/2Kints.txt"));
        startTime = System.nanoTime();
        System.out.println("Total Iteration: " + ThreeSum.count(twoKArray));
        System.out.println("Elapsed Time(ms): " + ((System.nanoTime() - startTime) / 1000000));

        System.out.println("\nRunning 4K ints .............");
        int[] fourKArray = FileUtils.readAllInts(Paths.get("src/com/bhuwan/datastructure/analysis/4Kints.txt"));
        startTime = System.nanoTime();
        System.out.println("Total Iteration: " + ThreeSum.count(fourKArray));
        System.out.println("Elapsed Time(ms): " + ((System.nanoTime() - startTime) / 1000000));

        System.out.println("\nRunning 8K ints .............");
        int[] eightKArray = FileUtils.readAllInts(Paths.get("src/com/bhuwan/datastructure/analysis/8Kints.txt"));
        startTime = System.nanoTime();
        System.out.println("Total Iteration: " + ThreeSum.count(eightKArray));
        System.out.println("Elapsed Time(ms): " + ((System.nanoTime() - startTime) / 1000000));

        System.out.println("\nRunning 16K ints .............");
        int[] sixteenKArray = FileUtils.readAllInts(Paths.get("src/com/bhuwan/datastructure/analysis/16Kints.txt"));
        startTime = System.nanoTime();
        System.out.println("Total Iteration: " + ThreeSum.count(sixteenKArray));
        System.out.println("Elapsed Time(ms): " + ((System.nanoTime() - startTime) / 1000000));

        System.out.println("\nRunning 1M ints .............");
        int[] oneMArray = FileUtils.readAllInts(Paths.get("src/com/bhuwan/datastructure/analysis/1Mints.txt"));
        startTime = System.nanoTime();
        System.out.println("Total Iteration: " + ThreeSum.count(oneMArray));
        System.out.println("Elapsed Time(ms): " + ((System.nanoTime() - startTime) / 1000000));

    }

}
