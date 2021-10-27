import java.util.Random;

/**
 * This is the only class you will need to modify to complete Exercise 2
 *
 * This program is based off of code written in C#
 * by Mark Smucker for MSCI 240, Fall 2014.
 *
 * @author Mark Hancock
 *
 */
public class TimingProgram {
    public static void main(String[] args) {
        Random rng = new Random(); // create a single random
                                   // number generator

        // BEGIN EXAMPLE
        // TODO: REPLACE THIS CODE WITH YOUR OWN AS NEEDED
        //
        // we can measure the time to move with the methods as follows:
        int size = 10000;
        int minSamples = 1; // usually want a larger value,
                            // but for this exercise,
                            // this is good enough
        double time = measureTimeToMove(minSamples, size, rng);
        // and we can output the results in a comma delimited format
        System.out.printf("moveMinToFrontB,%d,%.18f\n", size, time);
        size = 20000;
        time = measureTimeToMove(minSamples, size, rng);
        System.out.printf("moveMinToFrontB,%d,%.18f\n", size, time);  
        size = 30000;
        time = measureTimeToMove(minSamples, size, rng);
        System.out.printf("moveMinToFrontB,%d,%.18f\n", size, time);
        size = 40000;
        time = measureTimeToMove(minSamples, size, rng);
        System.out.printf("moveMinToFrontB,%d,%.18f\n", size, time);
        size = 50000;
        time = measureTimeToMove(minSamples, size, rng);
        System.out.printf("moveMinToFrontB,%d,%.18f\n", size, time);
        size = 60000;
        time = measureTimeToMove(minSamples, size, rng);
        System.out.printf("moveMinToFrontB,%d,%.18f\n", size, time);
        size = 70000;
        time = measureTimeToMove(minSamples, size, rng);
        System.out.printf("moveMinToFrontB,%d,%.18f\n", size, time);
        size = 80000;
        time = measureTimeToMove(minSamples, size, rng);
        System.out.printf("moveMinToFrontB,%d,%.18f\n", size, time);
        size = 90000;
        time = measureTimeToMove(minSamples, size, rng);
        System.out.printf("moveMinToFrontB,%d,%.18f\n", size, time);
        size = 100000;
        time = measureTimeToMove(minSamples, size, rng);
        System.out.printf("moveMinToFrontB,%d,%.18f\n", size, time);
    }

    /**
     * Generate an array with random integers as its contents.
     *
     * @param size
     *            size of array to create
     * @param rng
     *            random number generator
     * @return array of length size filled with random integers
     */
    public static int[] getTestArray(int size, Random rng) {
        int[] array = new int[size];
        for (int i = 0; i < size; ++i) {
            array[i] = rng.nextInt();
        }
        return array;
    }

    /**
     * Returns an estimate of the time in seconds to move the min of
     * an array of length arraySize when the array is filled with
     * random integers.
     *
     * @param minSamples
     *            minimum number of samples to take for the estimate
     * @param arraySize
     *            size of array to measure
     * @param rng
     *            random number generator
     * @return estimated time in seconds to move the min of a random
     *         int array of length arraySize
     */
    static double measureTimeToMove(int minSamples,
                                    int arraySize,
                                    Random rng) {
        Stopwatch watch = new Stopwatch();
        int numSamples = 0;

        while (numSamples < minSamples ||
               watch.getElapsedMilliseconds() < 1000) {
            int[] input = getTestArray(arraySize, rng);

            watch.start();
            // TODO: Call an algorithm here that you want to time
            MovingMethods.moveMinToFrontB(input);
            watch.stop();

            numSamples++;
        }

        return watch.getElapsedSeconds() / numSamples;
    }
}
