public class Deadline extends Event implements Completable{

    boolean Complete;

    Deadline(){
        Complete = false;
    }

    @Override
    public void complete() {
        Complete = true;
    }

    @Override
    public boolean isCompleted() {
        return false;
    }
}
