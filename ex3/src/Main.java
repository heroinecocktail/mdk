import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] tasks = new String[15];
        int taskCount = 0;
        System.out.println("Введите ваши дела на сегодня :");
        for (int i = 0; i < 15; i++) {
            System.out.print("Дело " + (i + 1) + ": ");
            String task = scanner.nextLine();
            if (task.isEmpty()) {
                break;
            } else {
                tasks[i] = task;
                taskCount++;
            }
        }
        if (taskCount > 0) { //
            System.out.println("Ваши дела на сегодня:");
            for (int i = 0; i < taskCount; i++) {
                System.out.println((i + 1) + ". " + tasks[i]);
            }
        } else {
            System.out.println("У вас нет дел на сегодня. Отдыхайте!");
        }
    }
}