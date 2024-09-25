import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class EventPlanner {
    static JFrame frame = new JFrame("Event Planner");

    public static void main(String[] args) {

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        EventListPanel panel = new EventListPanel();
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }

    static void addDefaultEvents(EventListPanel events){
        Deadline deadline = new Deadline("Default Deadline", LocalDateTime.now());
        Meeting meeting = new Meeting("Default Meeting", LocalDateTime.now(), LocalDateTime.now(),"Here");
        EventListPanel.events = new ArrayList<Event>();
        EventListPanel.events.add(deadline);
        EventListPanel.events.add(meeting);
    }

}
