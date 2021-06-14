import javax.swing.*;
import java.awt.*;

public class Main {

        public static void main(String[] args) {
            // JPanel = a GUI component that functions as a container to hold other components
            ImageIcon icon = new ImageIcon("C:\\Users\\JIAN HE\\IdeaProjects\\JPanel\\src\\youtube.png");
            JLabel label = new JLabel();
            label.setText("Hello there.");
            label.setIcon(icon);

            label.setVerticalAlignment(JLabel.CENTER);
            label.setHorizontalAlignment(JLabel.CENTER);

            //label.setBounds(100, 100, 75, 75);
            JPanel redPanel = new JPanel();
            redPanel.setBackground(Color.red);
            redPanel.setBounds(0, 0, 250, 250);
            redPanel.setLayout(new BorderLayout());
            JPanel bluePanel = new JPanel();
            bluePanel.setBackground(Color.blue);
            bluePanel.setBounds(250, 0, 250, 250);
            bluePanel.setLayout(new BorderLayout());

            JPanel greenPanel = new JPanel();
            greenPanel.setBackground(Color.white);
            greenPanel.setBounds(0, 250, 500, 500);
            greenPanel.setLayout(new BorderLayout());

            JFrame frame = new JFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(null);
            frame.setSize(750,750);

            greenPanel.add(label);
            frame.add(redPanel);
            frame.add(bluePanel);
            //frame.add(greenPanel);


            frame.add(greenPanel);
            frame.setVisible(true);
        }
    }

//PANEL. A GUI component that functions as a container to hold other component.
//System.out.println(myFrame.getInsets());
//myFrame.setLocationRelativeTo(null); //centers a frame on screen.
//https://docs.oracle.com/javase/tutorial/uiswing/components/frame.html
//myFrame.pack();//afer add all the component then pack the frame.


