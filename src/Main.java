import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Task 1");

        int[] box = new int[3];
        box[0] = 1;
        box[1] = 2;
        box[2] = 3;

        double[] fractions = {1.57, 7.654, 9.986};

        float[] lengths = {24.5f, 6.37f, 3.4f, 12.501f, 54.3f, 25.11f};
    }

    public static void task2() {
        System.out.println("Task 2");

        int[] box = {1, 2, 3};
        for (int i = 0; i < box.length; i++) {
            System.out.print(box[i]);
            if (i != box.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        double[] fractions = {1.57, 7.654, 9.986};
        for (int a = 0; a < fractions.length; a++) {
            System.out.print(fractions[a]);
            if (a != fractions.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        float[] lengths = {24.5f, 6.37f, 3.4f, 12.501f, 54.3f, 25.11f};
        for (int l = 0; l < lengths.length; l++) {
            System.out.print(lengths[l]);
            if (l != lengths.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Task 3");

        int[] box = new int[3];
        box[0] = 1;
        box[1] = 2;
        box[2] = 3;
        for (int i = 2; i >= 0; i--) {
            System.out.print(box[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        double[] fractions = {1.57, 7.654, 9.986};
        for (int a = 2; a >= 0; a--) {
            System.out.print(fractions[a]);
            if (a != 0) {
                System.out.print(", ");
            }
        }
        System.out.println(" ");

        float[] lengths = {24.5f, 6.37f, 3.4f, 12.501f, 54.3f, 25.11f};
        for (int l = 5; l >= 0; l--) {
            System.out.print(lengths[l]);
            if (l != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void task4() {
        System.out.println("Task 4");

        int[] box = {1, 2, 3};

        for (int i = 0; i < 3; i++) {
            if (box[i] % 2 != 0) {
                box[i] += 1;
            }
        }
        System.out.println(Arrays.toString(box));
    }
}