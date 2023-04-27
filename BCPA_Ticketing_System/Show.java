import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
/**
 * Write a description of class Show here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Show
{
    // instance variables - replace the example below with your own
    private String name;
    private LocalDateTime startTime;
    private LocalDateTime endTime;

    public Show(String name, LocalDateTime startTime, LocalDateTime endTime) {
        this.name = name;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        return "Show: " + name + ", Start Time: " + startTime.format(formatter) + ", End Time: " + endTime.format(formatter);
    }
}
