import java.time.LocalDateTime;

public class Deadline extends Event implements Completable{

    static boolean complete;

    public Deadline(String name, LocalDateTime deadline) {
        super();
        this.name = name;
        this.dateTime = deadline;
    }

    public Deadline(){
        complete = false;
    }

    @Override
    public void complete() {
        complete = true;
    }

    @Override
    public boolean isComplete() {
        return complete;
    }
}
