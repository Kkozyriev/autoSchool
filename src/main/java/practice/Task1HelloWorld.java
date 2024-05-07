package practice;

import java.util.Scanner;

public class Task1HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello,world!");
        Task1HelloWorld.printHelloName();

    }

    public static String printHelloName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ваше имя: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        scanner.close();
        return name;
    }
}