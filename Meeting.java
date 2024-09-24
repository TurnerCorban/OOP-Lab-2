import java.time.*;
import java.time.LocalDateTime;

public class Meeting extends Event implements Completable{
    String name;
    LocalDateTime endDateTime;
    LocalDateTime startDateTime;
    String location;
    boolean Completed;

    Meeting(){
        location = "N/A";
        Completed = false;
    }

    void setName(String name){
        this.name = name;
    }

    String getName(){
        return name;
    }

    void setStartDateTime(LocalDateTime startDateTime){
        this.startDateTime = startDateTime;
    }

    LocalDateTime getStartDateTime(){
        return startDateTime;
    }

    @Override
    public void complete() {
        Completed = true;
    }

    @Override
    public boolean isCompleted() {
        return Completed;
    }

    LocalDateTime getEndTime() {
        return endDateTime;
    }
    void setEndTime(LocalDateTime endDateTime) {
        this.endDateTime = endDateTime;
    }
    String getLocation() {
        return location;
    }
    void setLocation(String location) {
        this.location = location;
    }
    Duration getDuration(){
        return Duration.between(endDateTime, startDateTime);
    }

}
