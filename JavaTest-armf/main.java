import javax.swing.*;

public class main
{
    public static void main(String []args)
    {
        JFrame frame = new JFrame("UBTouch Java test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        frame.setUndecorated(true);
        JButton button = new JButton("Hello, World!");
        frame.getContentPane().add(button);
        frame.setVisible(true);
        System.out.println("Hello, world!, window is ready");
    }
}