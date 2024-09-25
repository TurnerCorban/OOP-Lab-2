import java.awt.*;
import java.awt.event.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import javax.swing.*;

public class EventListPanel extends JPanel{
    static ArrayList<Event> events;
    JComboBox sortDropDown;
    JLabel sortLabel;
    JButton addButton;

    public EventListPanel(){
        this.setBorder(BorderFactory.createTitledBorder("Event Calendar"));
        this.setPreferredSize(new Dimension(700, 800));
        this.setBackground(Color.white);

        EventPlanner.addDefaultEvents(this);
        defaultsort();

        String a[] = {"Default","Name","Date","Name Reverse","Date Reverse"};
        sortLabel = new JLabel("Sort Events");
        sortDropDown = new JComboBox(a);
        sortDropDown.addActionListener(actionEvent -> {
            switch (sortDropDown.getSelectedIndex()) {
                case 0:
                    defaultsort();
                    break;
                case 1:

            }
        });


        this.add(sortLabel);
        this.add(sortDropDown);

        addButton = new JButton("Add Event");
        this.add(addButton, BorderLayout.SOUTH);

        addButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                AddEventModal modal = new AddEventModal();
            }
        });

    }

    public void defaultsort(){
        int i;
        for (i = 0; i < events.size(); i++)
        {
            EventPanel panel = new EventPanel(events.get(i), 75 + i * 50);
        }
    }
    public void namesort(){
        ArrayList<Event> temp = new ArrayList<>();

        int i = 0;
        //Arrays.sort(events, (a,b) -> a.getClass(a.).getName().compareTo(b.name))
    }
}
