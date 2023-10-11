package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int fac, i = 1;
        System.out.println(1);
        while (i <= printToInclusive) {
            int j = 1;
            fac = 1;
            while (j <= i) {
                fac *= j;
                j++;
            }
            System.out.println(fac);
            i++;
        }
    }
}
