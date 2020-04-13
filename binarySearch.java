import static java.lang.Math.*;

public class binarySearch {

    public static void main(String[] args) {

        // array of prime numbers between 0 - 100
        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37,
                41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        int min = 0;
        int max = primes.length - 1;
        int guess = 0;
        int target = 8;//Target number the algorithm is supposed to locate
        while (max > min) {
            guess = (int) floor((max + min) / 2);
            System.out.println("Guess: " + guess +" Min: " + min + " Max: " +max);
            if (min + 1 == max && primes[max] == target) {
                System.out.println("The target is located at index: " + max);
                break;
            }
            if (primes[guess] == target) {
                System.out.println("The target is located at index: " + guess);
                break;
            } else if (primes[guess] > target) {
                max = guess - 1;
            } else {
                min = guess + 1;
            }
        }
        if (min == max) {
            System.out.println("Guess: "+ guess +" Min: " + min + " Max: " +max);
            System.out.println("The target number is not in the array");
        }

    }
}
