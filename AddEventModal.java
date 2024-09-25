import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;



public class AddEventModal {
    private static JDialog d;
    String n;

    AddEventModal() {
        JFrame f= new JFrame();



        d = new JDialog(f , "Dialog Example", true);
        d.setLayout(new FlowLayout(FlowLayout.CENTER));

        d.add( new JLabel ("Enter your Event Details."));

        JTextField name = new JTextField(16);
        name.setPreferredSize(new Dimension(300, 50));
        d.add(name);

        JButton b = new JButton ("Confirm");
        b.addActionListener ( new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                n = name.getText();
            }
        });

        d.add(name, FlowLayout.CENTER);




        d.add(b);
        d.setSize(300,300);
        d.setVisible(true);
        d.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    public static void main(String args[])
    {
        new AddEventModal();
    }
}