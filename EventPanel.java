import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class EventPanel extends JPanel {
    Event event = null;
    JPanel eventPanel = new JPanel(new BorderLayout(10,10));
    JLabel eventLabel = new JLabel();
    JLabel name;
    JLabel completed = new JLabel("    Completed    ");
    JButton completeButton;
    JButton addButton;
    int y;

    EventPanel(Event event, int y) {
        this.event = event;
        this.y = y;

        LocalDateTime now = event.getDateTime();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("E MM/dd/yy @ HH:mm ");
        String formattedDateTime = now.format(formatter); // "1986-04-08 12:30"


        completeButton = new JButton("Complete");
        completeButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(Deadline.class.isAssignableFrom(event.getClass())){
                    ((Deadline) event).complete();
                    completeButton.setVisible(false);
                    eventPanel.add(completed, BorderLayout.WEST);
                }
                if(Meeting.class.isAssignableFrom(event.getClass())){
                    ((Meeting) event).complete();
                    completeButton.setVisible(false);
                    eventPanel.add(completed, BorderLayout.WEST);
                }
                revalidate();
                repaint();
            }
        });
        EventPlanner.frame.getContentPane().add(eventPanel);
        if(Completable.class.isAssignableFrom(event.getClass())){
            eventPanel.add(completeButton, BorderLayout.WEST);
        }

        eventLabel.setFont(new Font("Helvetica", Font.PLAIN, 10));
        eventLabel = new JLabel(formattedDateTime);

        if (Meeting.class.isAssignableFrom(event.getClass())){
            name = new JLabel(event.getName() + ": " + ((Meeting) event).getLocation() + ", " + (((Meeting) event).getDuration().getSeconds())/60 + " Minutes", JLabel.CENTER);
        }
        else
            name = new JLabel(event.getName(), JLabel.CENTER);

        eventPanel.add(eventLabel, BorderLayout.EAST);
        eventPanel.add(name, BorderLayout.CENTER);

        eventPanel.setSize(650,35);
        eventPanel.setLocation(20,y);
        eventPanel.setVisible(true);

    }
}
