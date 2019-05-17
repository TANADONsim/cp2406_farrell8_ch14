import javax.swing.*;
import java.awt.*;

public class JBookQuote
{
    public static void main(String[] args)
    {
        JFrameWithQuotes aFrame = new JFrameWithQuotes();
        final int WIDTH = 400;
        final int HEIGHT = 100;
        aFrame.setSize(WIDTH, HEIGHT);
        aFrame.setVisible(true);
    }
}

class JFrameWithQuotes extends JFrame
{
    JLabel quote = new JLabel("<html>\"Mr. and Mrs. Dursley of number four, Privet Drive, were proud to say that they were perfectly normal, thank you very much.”<br/>\"Not for the first time, an argument had broken out over breakfast at number four, Privet Drive.”</html>", SwingConstants.CENTER);
    public JFrameWithQuotes()
    {
        super("Frame with Quote");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        add(quote);
    }
}