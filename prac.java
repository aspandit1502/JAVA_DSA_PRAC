import java.util.Scanner;

public class prac {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean running = true;
        System.out.println("=== Mainframe Booted ===");

        while (running) {
            System.out.println("\nEnter access code (admin, user, or exit):");
            String role = scan.next().toLowerCase();

            switch (role) {
                case "exit" -> {
                    System.out.println("Terminating session. Goodbye.");
                    running = false;
                }
                case "user" -> System.out.println("Basic access granted. You do not have permission to execute commands.");
                
                case "admin" -> {
                    System.out.println("Admin recognized. Select action: (1) View Logs (2) Wipe Database");
                    int action = scan.nextInt();
                    
              
                    switch (action) {
                        case 1 -> System.out.println("Logs displayed: No recent errors.");
                        case 2 -> System.out.println("CRITICAL ERROR: Database wipe failed.");
                        default -> System.out.println("Invalid admin command.");
                    }
                }
                default -> System.out.println("Unrecognized role. Try again.");
            }
        }
        
        scan.close();
    }
}