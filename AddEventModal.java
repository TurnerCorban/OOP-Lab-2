import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;



public class AddEventModal {
    private static JDialog d;
    String n;
    String l;
    LocalDateTime dt;
    LocalDateTime edt;


    AddEventModal() {
        JFrame frame = new JFrame("Create Event");
        frame.setLayout(new FlowLayout());
        frame.getContentPane();


        JButton createM = new JButton("Create new Meeting");
        JButton createD = new JButton("Create New Deadline");
        JTextField name = new JTextField(20);
        JTextField location = new JTextField(20);
        JTextField day1 = new JTextField(5);
        JTextField day2 = new JTextField(5);
        JTextField month1 = new JTextField(5);
        JTextField month2 = new JTextField(5);
        JTextField year1 = new JTextField(5);
        JTextField year2 = new JTextField(5);
        JTextField hour1 = new JTextField(5);
        JTextField hour2 = new JTextField(10);
        JTextField minute1 = new JTextField(5);
        JTextField minute2 = new JTextField(10);
        JLabel namelabel = new JLabel("Enter the name of the Event: ");
        JLabel datetimelabel = new JLabel("Enter the date and time of the Event: ");
        JLabel datetimelabel2 = new JLabel("                    Month, Day, Year, Hour, Minute                    ");
        JLabel locationlabel = new JLabel("Enter the location of the Event (For Meetings): ");
        JLabel enddatetimelabel = new JLabel("Enter the end time of the Event");
        JLabel enddatetimelabel2 = new JLabel("                                        Hour Minute                                        ");

        frame.setPreferredSize(new Dimension(350, 300));
        frame.setMaximumSize(frame.getPreferredSize());
        frame.setMinimumSize(frame.getPreferredSize());

        frame.add(namelabel);
        frame.add(name);
        frame.add(locationlabel);
        frame.add(location);
        frame.add(datetimelabel);
        frame.add(datetimelabel2);
        frame.add(day1);
        frame.add(month1);
        frame.add(year1);
        frame.add(hour1);
        frame.add(minute1);
        frame.add(enddatetimelabel);
        frame.add(enddatetimelabel2);
        frame.add(hour2);
        frame.add(minute2);
        frame.add(createD);
        frame.add(createM);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyy HH:mm");

        createD.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ;
            }
        });
        createD.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });



        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(150,150);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
    public static void main(String args[])
    {
        new AddEventModal();
    }
}