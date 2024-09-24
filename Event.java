import java.time.LocalDateTime;

public abstract class Event implements Comparable<Event> {

    String name;
    LocalDateTime dateTime;
    String getName() {
        return name;
    }
    void setName(String name) {
        this.name = name;
    }
    void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    @Override
    public int compareTo(Event e) {
        return dateTime.compareTo(e.dateTime);
    }
}
