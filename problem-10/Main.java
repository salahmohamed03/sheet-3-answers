import javax.swing.plaf.metal.MetalTheme;
import java.util.*;

class Main {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] Args) {
        System.out.println("Enter the departure time (hours)");
        int dep_hours = scan.nextInt();
        System.out.println("Enter the departure time (minutes)");
        int dep_minutes = scan.nextInt();
        System.out.println("Enter the arrival time (hours)");
        int arrival_hours = scan.nextInt();
        System.out.println("Enter the arrival time (minutes)");
        int arrival_minutes = scan.nextInt();
        double departure = dep_hours+dep_minutes/60.0;
        double arrival = arrival_hours+arrival_minutes/60.0;
        double duration = 12.0 - departure + arrival;
        double hours = Math.floor(duration);
        double minutes = 60.0 * (duration- hours);
        System.out.println("The trip time (hours): "+ Math.round(hours));
        System.out.println("The trip time (minutes): "+ Math.round(minutes));
    }
}