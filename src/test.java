import javax.swing.*;
import java.awt.*;
import java.awt.event.HierarchyEvent;
import java.awt.event.HierarchyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class test extends JFrame
{
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton button10;
    private JButton button11;
    private JButton button12;
    private JButton button13;
    private JButton button14;
    private JButton button15;
    private JButton button18;
    private JButton button19;
    private JButton button20;
    private JPanel panel;
    private JTextField dezhouyiqiTextField;
    private JButton button2;
    private JButton button21;
    private JButton button24;
    private JButton button25;
    public void init()
    {
        this.add(panel);
        Toolkit kit=Toolkit.getDefaultToolkit();
        this.setBounds(kit.getScreenSize().width/2-getWidth()/2-250,
                kit.getScreenSize().height/2-getHeight()/2-300,
                500,600);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        System.out.println("  ");
    }
}
