import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class JPhotoFrame extends JFrame implements ItemListener{

    ButtonGroup g1 = new ButtonGroup();
    ButtonGroup g2 = new ButtonGroup();
    JCheckBox c1 = new JCheckBox("Session with 1 person ($40)");
    JCheckBox c2 = new JCheckBox("Session with 2 or more people ($75)");
    JCheckBox c3 = new JCheckBox("Session with a pet ($95)");
    JCheckBox c4 = new JCheckBox("In studio");
    JCheckBox c5 = new JCheckBox("On location ($90)");
    JLabel label1 = new JLabel("Select a Session Option:");
    JLabel label2 = new JLabel("Select Location:");
    int price = 0;
    int g1Price = 0;
    int g2Price = 0;
    JLabel label3 = new JLabel("Total: " + price);
    Font large = new Font("Ariel", Font.BOLD, 18);
    Font med = new Font("Ariel", Font.PLAIN, 15);


    public JPhotoFrame() {
        JFrame frame = new JFrame("Paula's Portraits");
        setDefaultLookAndFeelDecorated(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 800);
        frame.setVisible(true);
        frame.setLayout(new FlowLayout());
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        g1.add(c1);
        g1.add(c2);
        g1.add(c3);
        g2.add(c4);
        g2.add(c5);
        c1.setFont(med);
        c2.setFont(med);
        c3.setFont(med);
        c4.setFont(med);
        c5.setFont(med);
        label1.setFont(large);
        label2.setFont(large);
        label3.setFont(large);
        frame.add(label1);
        frame.add(c1);
        frame.add(c2);
        frame.add(c3);
        frame.add(label2);
        frame.add(c4);
        frame.add(c5);
        frame.add(label3);
        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);
        c4.addItemListener(this);
        c5.addItemListener(this);
        c5.addItemListener(this);


    }
    public void itemStateChanged(ItemEvent e){

        if(c1.isSelected()) g1Price = 40;
        if(c2.isSelected()) g1Price = 75;
        if(c3.isSelected()) g1Price = 95;
        if(c4.isSelected()) g2Price = 0;
        if(c5.isSelected()) g2Price = 90;

        price = g1Price + g2Price;
        label3.setText("Total: $" + price);
    }

    public static void main(String[] args){

        new JPhotoFrame();
    }



}