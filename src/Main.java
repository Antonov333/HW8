public class Main {
    static int hw = 777;

    public static void main(String[] args) {
        hwTitle();
        task1();

        hwCompleted();
    }

    public static void hwTitle() {
        System.out.println("ДОМАШНЕЕ ЗАДАНИЕ №" + hw);
        System.out.println(" ");
    }

    public static void task1() {
        System.out.println("Задача 1");
        System.out.println("Solution to be provided soon");
        System.out.println("");
    }


    public static void hwCompleted() {
        System.out.println("Домашнее задание " + hw + " выполнено");
        System.out.println(" ");
    }

}