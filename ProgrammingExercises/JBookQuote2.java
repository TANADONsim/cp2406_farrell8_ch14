import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JBookQuote2 extends JFrame implements ActionListener
{
    FlowLayout flowLayout = new FlowLayout();
    JLabel quote = new JLabel("<html>\"Mr. and Mrs. Dursley of number four, Privet Drive, were proud to say that they were perfectly normal, thank you very much.”<br/>\"Not for the first time, an argument had broken out over breakfast at number four, Privet Drive.”</html>", SwingConstants.CENTER);
    JButton button = new JButton("Click Me");
    JLabel clickMessage = new JLabel("<html>Harry Potter 1<br/>Harry Potter 2</html>", SwingConstants.CENTER);

    public JBookQuote2()
    {
        super("Lines from my book");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(flowLayout);
        add(quote);
        add(button);
        button.addActionListener(this);
    }
    public static void main(String[] args)
    {
        JBookQuote2 jBookQuote2 = new JBookQuote2();
        jBookQuote2.setSize(260, 150);
        jBookQuote2.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        add(clickMessage);
        validate();
        repaint();
    }
}