import java.time.LocalTime;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Start at the computer's current time
        LocalTime now = LocalTime.now();
        ClockDisplay clock = new ClockDisplay(now.getHour(), now.getMinute(), now.getSecond());

        // Run forever, ticking once per second
        while (true) {
            System.out.println(clock.getTime());
            clock.timeTick();
            Thread.sleep(1000);   // wait 1 second
        }
    }
}