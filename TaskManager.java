import java.util.*;

class Task {
    int id;
    String title;
    String description;

    public Task(int id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }

    public String toString() {
        return "ID: " + id + ", Title: " + title + ", Description: " + description;
    }
}

public class TaskManager {
    static List<Task> tasks = new ArrayList<>();
    static int nextId = 1;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n--- Task Manager ---");
            System.out.println("1. Create Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Update Task");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1 -> createTask();
                case 2 -> viewTasks();
                case 3 -> updateTask();
                case 4 -> deleteTask();
                case 5 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid option.");
            }
        }
    }

    static void createTask() {
        System.out.print("Enter title: ");
        String title = scanner.nextLine();
        System.out.print("Enter description: ");
        String description = scanner.nextLine();
        Task newTask = new Task(nextId++, title, description);
        tasks.add(newTask);
        System.out.println("Task created.");
    }

    static void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
        } else {
            for (Task task : tasks) {
                System.out.println(task);
            }
        }
    }

    static void updateTask() {
        System.out.print("Enter task ID to update: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        for (Task task : tasks) {
            if (task.id == id) {
                System.out.print("Enter new title: ");
                task.title = scanner.nextLine();
                System.out.print("Enter new description: ");
                task.description = scanner.nextLine();
                System.out.println("Task updated.");
                return;
            }
        }
        System.out.println("Task not found.");
    }

    static void deleteTask() {
        System.out.print("Enter task ID to delete: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        Iterator<Task> iterator = tasks.iterator();
        while (iterator.hasNext()) {
            Task task = iterator.next();
            if (task.id == id) {
                iterator.remove();
                System.out.println("Task deleted.");
                return;
            }
        }
        System.out.println("Task not found.");
    }
}
