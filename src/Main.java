import java.util.Arrays;

public class Main {
    static int hw = 8;

    public static void main(String[] args) {
        hwTitle();
        task1();
        task2();
        task3();
        task4();
        hwCompleted();
    }

    public static void hwTitle() {
        System.out.println("ДОМАШНЕЕ ЗАДАНИЕ №" + hw);
        System.out.println(" ");
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] m1 = new int[]{1, 2, 3};
        double[] m2 = {1.57, 7.654, 9.986};
                int[] m3 = new int[10];
        System.out.println("m1: "+Arrays.toString(m1)+"\tm2: "
                                + Arrays.toString(m2)+
                                "\tm3: " + Arrays.toString(m3) + "\n");
    }

     public static void task2() {
        System.out.println("Задача 2");
        int[] m1 = new int[]{1, 2, 3};
        double[] m2 = {1.57, 7.654, 9.986};
        int[] m3 = new int[] {101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112};

        for (int i = 0; i <= m1.length - 1; i++) {
            System.out.print(m1[i]);
            if (i < m1.length - 1) {
                System.out.print(", ");
            } else System.out.println("");
        }

        for (int i = 0; i <= m2.length - 1; i++) {
            System.out.print(m2[i]);
            if (i < m2.length - 1) {
                System.out.print(", ");
            } else System.out.println("");
        }

        for (int i = 0; i <= m3.length - 1; i++) {
            System.out.print(m3[i]);
            if (i < m3.length - 1) {
                System.out.print(", ");
            } else System.out.println("\n");
        }

    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] m1 = new int[]{1, 2, 3};
        double[] m2 = {1.57, 7.654, 9.986};
        int[] m3 = new int[]{101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112};

        for (int i = m1.length - 1; i >= 0; i--) {
            System.out.print(m1[i]);
            if (i > 0) {
                System.out.print(", ");
            } else System.out.println("");
        }

        int maxIndex = m2.length - 1;
        for (int i = maxIndex; i >= 0; i--) {
            System.out.print(m2[i]);
            if (i > 0) {
                System.out.print(", ");
            } else System.out.println("");
        }

        maxIndex = m3.length - 1;
        for (int i = maxIndex; i >= 0; i--) {
            System.out.print(m3[i]);
            if (i > 0) {
                System.out.print(", ");
            } else System.out.println("\n");
        }
    }

        public static void task4() {
            System.out.println("Задача 4");
            int[] m1 = new int[]{1, 2, 3};
            double[] m2 = {1.57, 7.654, 9.986};
            int[] m3 = new int[]{101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112};
            System.out.println("Исходный массив: " + Arrays.toString(m1));
            int maxIndex = m1.length - 1;
            System.out.print("Массив после дополнения всех нечетных элементов до четности: ");
            for (int i = 0; i <= maxIndex; i++) {
                if (m1[i] % 2 != 0) {
                    m1[i]++;
                }

                }
            System.out.println(Arrays.toString(m1)+"\n") ;
            }

    public static void hwCompleted() {
        System.out.println("Домашнее задание " + hw + " выполнено");
        System.out.println(" ");
    }

}