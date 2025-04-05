import java.util.*;

interface Task {
    void start();
    void pause();
    void complete();
}

class AppTask implements Task {
    public void start() {
        System.out.println("Started scanning apps.");
    }

    public void pause() {
        System.out.println("Paused scanning apps.");
    }

    public void complete() {
        System.out.println("Completed scanning apps.");
    }
}

class VirusTask implements Task {
    public void start() {
        System.out.println("Started scanning for virus.");
    }

    public void pause() {
        System.out.println("Paused scanning for virus.");
    }

    public void complete() {
        System.out.println("Completed scanning for virus.");
    }
}

class TrojanTask implements Task {
    public void start() {
        System.out.println("Started scanning for trojans");
    }

    public void pause() {
        System.out.println("Paused scanning for trojans.");
    }

    public void complete() {
        System.out.println("Completed scanning for trojans.");
    }
}

public class Inter4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Task> tasks = new ArrayList<>();
        tasks.add(new AppTask());
        tasks.add(new VirusTask());
        tasks.add(new TrojanTask());

        while (true) {
            System.out.println("\nTask Manager:");
            System.out.println("1. Start App Task");
            System.out.println("2. Pause Virus Task");
            System.out.println("3. Complete Trojan Task");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    tasks.get(0).start();
                    break;
                case 2:
                    tasks.get(1).pause(); 
                    break;
                case 3:
                    tasks.get(2).complete(); 
                    break;
                case 4:
                    System.out.println("Exiting Task Manager.");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}