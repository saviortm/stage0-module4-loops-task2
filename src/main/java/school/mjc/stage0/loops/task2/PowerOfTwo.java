package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        int i = 1, degree = 1;
        if (power < 0) {
            System.out.println("too much power");
        } else {
            while (i <= power + 1) {
                System.out.println(degree);
                degree *= 2;
                i++;
            }
        }
    }
}
