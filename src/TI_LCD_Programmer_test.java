import javax.swing.*;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;
import java.awt.*;
import java.awt.event.*;

public class TI_LCD_Programmer_test extends JFrame
{
    private JPanel TI_LCD_Programmer_test;
    private JPanel TextPanel1;
    private JPanel ButtonPanel;
    private JPanel TextPanel2;
    private JTextField IOput;
    private JLabel TEXAS;
    private JButton DECButton;
    private JButton HEXButton;
    private JButton OCTButton;
    private JButton OFFButton;
    private JButton ONorCLRButton;
    private JButton STOButton;
    private JButton RCLButton;
    private JButton SUMButton;
    private JButton OPButton;
    private JButton CPButton;
    private JButton SHFButton;
    private JButton dButton;
    private JButton EButton;
    private JButton FButton;
    private JButton KButton;
    private JLabel B1010;
    private JLabel B1011;
    private JLabel B1100;
    private JButton a1SCButton;
    private JButton AButton;
    private JButton bButton;
    private JButton CButton;
    private JButton DivButton;
    private JLabel B0111;
    private JLabel B1000;
    private JLabel B1001;
    private JButton ORButton;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton MulButton;
    private JLabel B0100;
    private JLabel B0101;
    private JLabel B0110;
    private JButton ANDButton;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton SubButton;
    private JLabel B0001;
    private JLabel B0010;
    private JLabel B0011;
    private JButton XORButton;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton AddButton;
    private JLabel a2sC;
    private JButton CEButton;
    private JButton a0Button;
    private JButton dotButton;
    private JButton AddOrSubButton;
    private JButton EqualButton;
    private JLabel TI;
    private JLabel CM;
    private JLabel B1101;
    private JLabel B1110;
    private JLabel B1111;
    private JSeparator Separator;
    private JTextField EmptySpacer1;
    private JTextField EmptySpacer2;
    private JTextField MidSpacer;
    private JLabel DECLabel;
    private JLabel HEXLabel;


    public TI_LCD_Programmer_test() {
        setToolButton();
        setDigitalButton();
        setLabel();
        setText();
        setPanel();
    }

    public static void main(String[] args) {
        Toolkit kit=Toolkit.getDefaultToolkit();
        JFrame frame = new JFrame("TI_LCD_Programmer");
        frame.setLocation((int) (kit.getScreenSize().getWidth()/2-250), (int) (kit.getScreenSize().getHeight()/2-500));
        frame.setContentPane(new TI_LCD_Programmer_test().TI_LCD_Programmer_test);
        frame.pack();
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

//    public void Init()
//    {
//        this.setTitle("TI_LCD_Programmer_test");
//        this.add(TI_LCD_Programmer_test);
//        Toolkit kit=Toolkit.getDefaultToolkit();
//        this.pack();
//        this.setVisible(true);
//        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    }
    public void setToolButton()//非数字按钮的设置
    {
        JButton[] ToolButton={
                DECButton,HEXButton,OCTButton,OFFButton,ONorCLRButton,
                STOButton,RCLButton,SUMButton,OPButton,CPButton,
                SHFButton,dButton,EButton,FButton,KButton,
                a1SCButton,AButton,bButton,CButton,DivButton,
                ORButton,MulButton,ANDButton,SubButton,XORButton,
                AddButton,CEButton,EqualButton};
        for(int i=0;i<ToolButton.length;i++)
        {
            Font buttonFont=new Font("Times New Romans",Font.BOLD,25);//设置字体
            ToolButton[i].setBorderPainted(false);//取消边框
            ToolButton[i].setBackground(new Color(62, 68, 79));//设置背景颜色
            ToolButton[i].setFocusPainted(false);//取消聚焦
            ToolButton[i].setForeground(new Color(255,255,255));//设置按钮上的字体颜色
            ToolButton[i].setFont(buttonFont);
            int finalI = i;
            ToolButton[i].addMouseListener(new MouseAdapter() {
                @Override
                public void mouseEntered(MouseEvent e) {
                    super.mouseEntered(e);
                    ToolButton[finalI].setBackground(new Color(32, 38, 49));
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    super.mouseExited(e);
                    ToolButton[finalI].setBackground(new Color(62, 68, 79));
                }
            });
        }
    }
    public void setDigitalButton()//对数字按钮进行设置
    {
        JButton[] DigitalButton={
                a7Button,a8Button,a9Button,
                a4Button,a5Button,a6Button,
                a1Button,a2Button,a3Button,
                a0Button,dotButton,AddOrSubButton
        };
        Font buttonFont=new Font("Times New Romans",Font.BOLD,25);
        for(int i=0;i<DigitalButton.length;i++) {
            DigitalButton[i].setBorderPainted(false);
            DigitalButton[i].setBackground(new Color(188, 189, 194));
            DigitalButton[i].setFocusPainted(false);
            DigitalButton[i].setForeground(new Color(26, 23, 23));
            DigitalButton[i].setFont(buttonFont);
            int finalI = i;
            DigitalButton[i].addMouseListener(new MouseAdapter() {
                @Override
                public void mouseEntered(MouseEvent e) {
                    super.mouseEntered(e);
                    DigitalButton[finalI].setBackground(new Color(138, 138, 138));

                }

                @Override
                public void mouseExited(MouseEvent e) {
                    super.mouseExited(e);
                    DigitalButton[finalI].setBackground(new Color(188, 189, 194));
                }
            });
        }
    }
    public void setLabel()//对标签进行设置
    {
        Font labelFont=new Font("Times New Romans",Font.BOLD,18);
        Font labelFont1=new Font("Times New Romans",Font.BOLD,20);
        Font BaseFont=new Font("Times New Romans",Font.BOLD,22);
        DECLabel.setFont(BaseFont);//设置字体样式
        DECLabel.setText("DEC");//设置默认的文本
        DECLabel.setForeground(Color.BLACK);//设置字体颜色
        DECLabel.setFont(BaseFont);
        DECLabel.setBorder(BorderFactory.createEmptyBorder());
        HEXLabel.setFont(BaseFont);//设置字体样式
        HEXLabel.setText("HEX");//设置默认的文本
        HEXLabel.setForeground(Color.BLACK);//设置字体颜色
        HEXLabel.setFont(BaseFont);
        HEXLabel.setBorder(BorderFactory.createEmptyBorder());
        TEXAS.setFont(labelFont1);
        TI.setFont(labelFont1);
        CM.setFont(labelFont);
        JLabel[] tempLabel={
                B0001,B0010,B0011,B0100,B0101,
                B0110,B0111,B1000,B1001,B1010,
                B1011,B1100,B1101,B1110,B1111,
                a2sC
        };
        for(int i=0;i< tempLabel.length;i++)
        {
            tempLabel[i].setFont(labelFont);
            tempLabel[i].setForeground(Color.BLACK);
        }
    }
    public void setText()//对文本域进行设置
    {
        Font IOputFont=new Font("Times New Romans",Font.BOLD,65);
        IOput.setFont(IOputFont);//设置字体样式
        IOput.setBackground(new Color(0xECECED));//设置背景颜色
        IOput.setDocument(new JTextFieldLimit(8));//设置JTextField输入文本长度不超过8位
        IOput.setBorder(BorderFactory.createEmptyBorder());//文本框不带边框
        EmptySpacer1.setBorder(BorderFactory.createEmptyBorder());
        EmptySpacer2.setBorder(BorderFactory.createEmptyBorder());
        MidSpacer.setBorder(BorderFactory.createEmptyBorder());
        IOput.setText("12345678");
        Separator.setForeground(new Color(0xFFFFFF));
    }
    public void setPanel()//对面板进行设置
    {
//        TextPanel1.setBackground(new Color(0xFFFFFF));
//        TextPanel2.setBackground(new Color(0xFFFFFF));
//        ButtonPanel.setBackground(new Color(0xFFFFFF));
    }
    public int getFrameWidth()
    {
        return ButtonPanel.getWidth()+TextPanel2.getWidth()+TextPanel1.getWidth();
    }
    public int getFrameHeight()
    {
        return ButtonPanel.getHeight()+TextPanel2.getHeight()+TextPanel1.getHeight();
    }
    class JTextFieldLimit extends PlainDocument//该类用来实现对JTextField输入文本长度的限制
    {
        private int limit;
        public JTextFieldLimit(int limit)
        {
            super();
            this.limit=limit;//最大输入长度
        }
        public void insertString(int offset, String str, AttributeSet attr) throws BadLocationException
        {
            if(getLength()+str.length()<=limit)
                super.insertString(offset, str, attr);
        }
    }
}
