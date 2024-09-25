import java.time.LocalDateTime;
import java.util.*;

public abstract class Event implements Comparable<Event> {

    public String name;
    public LocalDateTime dateTime;

    public Event(String name, LocalDateTime dateTime) {
        this.dateTime = dateTime;
        this.name = name;
    }

    public Event() {

    }

    public String getName(){
        return name;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    void setDateTime(LocalDateTime time) {
        dateTime = time;
    }

    void setName(String eventName) {
        name = eventName;
    }

    public int compareTo(Event e) {
        return this.dateTime.compareTo(e.getDateTime());
    }
}
