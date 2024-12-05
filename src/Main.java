import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int totalTicks = 0;
        Scanner inputScanner = new Scanner(System.in);
        String[] startTimestamp = inputScanner.nextLine().split(" ");
        String[] endTimestamp = inputScanner.nextLine().split(" ");
        try {
            int initialHour = Integer.parseInt(startTimestamp[0]);
            int initialMinute = Integer.parseInt(startTimestamp[1]);
            int finalHour = Integer.parseInt(endTimestamp[0]);
            int finalMinute = Integer.parseInt(endTimestamp[1]);

            if (initialMinute < 30) {
                totalTicks++;
            }
            if (finalMinute <= 30) {
                totalTicks--;
            }
            if (initialHour > finalHour) {
                finalHour += 24;
            }
            for (int hour = initialHour + 1; hour <= finalHour; hour++) {
                if (hour > 24) {
                    totalTicks += hour - 24;
                } else if (hour > 12 && hour <= 24) {
                    totalTicks += hour - 12;
                } else {
                    totalTicks += hour;
                }
                totalTicks++;
            }
            System.out.println(totalTicks);
        } catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }
}
