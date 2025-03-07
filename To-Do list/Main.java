import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ToDoList todoList = new ToDoList();

        while (true) {
            System.out.println("\nTo-Do List Menu:");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Mark Task as Completed");
            System.out.println("4. Remove Task");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter task description: ");
                    String description = scanner.nextLine();
                    todoList.addTask(description);
                    break;

                case 2:
                    todoList.showTasks();
                    break;

                case 3:
                    todoList.showTasks();
                    if (todoList.getTaskCount() > 0) {
                        System.out.print("Enter task number to mark completed: ");
                        int taskNumber = scanner.nextInt();
                        todoList.markTaskCompleted(taskNumber - 1);
                    }
                    break;

                case 4:
                    todoList.showTasks();
                    if (todoList.getTaskCount() > 0) {
                        System.out.print("Enter task number to remove: ");
                        int removeNumber = scanner.nextInt();
                        todoList.removeTask(removeNumber - 1);
                    }
                    break;

                case 5:
                    System.out.println("Goodbye!");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice, try again.");
            }
        }
    }
}
