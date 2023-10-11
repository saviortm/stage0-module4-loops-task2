package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        boolean prime;
        int i = 2;
        while (i <= printToInclusive) {
            prime = true;
            int j = 1;
            while (j <= Math.sqrt(i) + 1) {
                j++;
                if (i == 2 || i == 3) {
                    break;
                } else if (i % j == 0) {
                    prime = false;
                    break;
                }

            }
            if (prime) {
                System.out.println(i);
            }
            i++;
        }
    }
}
