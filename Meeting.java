import java.time.*;
import java.time.LocalDateTime;

public class Meeting extends Event implements Completable{

    boolean completed;
    LocalDateTime endDateTime;
    String location;

    public Meeting(String name, LocalDateTime start, LocalDateTime end, String location) {
        super();
        this.name = name;
        this.dateTime = start;
        this.endDateTime = end;
        this.location = location;
    }

    public Meeting() {

    }

    @Override
    public void complete() {
        completed = true;
    }

    @Override
    public boolean isComplete() {
        return completed;
    }

    public LocalDateTime getEndDateTime() {
        return endDateTime;
    }

    public Duration getDuration(){

        return Duration.between(this.dateTime,endDateTime);
    }

    public String getLocation(){
        return location;
    }

    public void setEndDateTime(LocalDateTime endDateTime) {
        this.endDateTime = endDateTime;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
