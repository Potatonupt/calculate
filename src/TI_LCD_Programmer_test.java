import javax.swing.*;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;
import java.awt.*;
import java.awt.event.*;
import java.math.BigDecimal;
import java.security.Key;

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
    private int symbol = 1;
    private boolean if_operator = false;   //??????????????????
    private String operator1 = "";            //?????????1
    private String operator2 = "";            //?????????2
    private String tmp = "";                  //?????????ioput?????????
    private BigDecimal first=new BigDecimal(0);
    private BigDecimal firstmul=new BigDecimal(1);
    private BigDecimal second=new BigDecimal(0);
    private BigDecimal answer=new BigDecimal(0);
    private int lastoperator=0;               //???????????????
    private int nowoperator=0;                //???????????????

    public TI_LCD_Programmer_test() {
        setToolButton();
        setDigitalButton();
        setLabel();
        setText();
        setPanel();
        keyboard_init();
        button_init();
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
    public void setToolButton()//????????????????????????
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
            Font buttonFont=new Font("Times New Romans",Font.BOLD,25);//????????????
            ToolButton[i].setBorderPainted(false);//????????????
            ToolButton[i].setBackground(new Color(62, 68, 79));//??????????????????
            ToolButton[i].setFocusPainted(false);//????????????
            ToolButton[i].setForeground(new Color(255,255,255));//??????????????????????????????
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
    public void setDigitalButton()//???????????????????????????
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
    public void setLabel()//?????????????????????
    {
        Font labelFont=new Font("Times New Romans",Font.BOLD,18);
        Font labelFont1=new Font("Times New Romans",Font.BOLD,20);
        Font BaseFont=new Font("Times New Romans",Font.BOLD,22);
        DECLabel.setFont(BaseFont);//??????????????????
        DECLabel.setText("DEC");//?????????????????????
        DECLabel.setForeground(Color.BLACK);//??????????????????
        DECLabel.setFont(BaseFont);
        DECLabel.setBorder(BorderFactory.createEmptyBorder());
        HEXLabel.setFont(BaseFont);//??????????????????
//        HEXLabel.setText("HEX");//?????????????????????
        HEXLabel.setForeground(Color.BLACK);//??????????????????
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
    public void setText()//????????????????????????
    {
        Font IOputFont=new Font("Times New Romans",Font.BOLD,65);
        IOput.setFont(IOputFont);//??????????????????
        IOput.setBackground(new Color(0xECECED));//??????????????????
        IOput.setDocument(new JTextFieldLimit(8));//??????JTextField???????????????????????????8???
        IOput.setBorder(BorderFactory.createEmptyBorder());//?????????????????????
        EmptySpacer1.setBorder(BorderFactory.createEmptyBorder());
        EmptySpacer2.setBorder(BorderFactory.createEmptyBorder());
        MidSpacer.setBorder(BorderFactory.createEmptyBorder());
//        IOput.setText("12345678");
        Separator.setForeground(new Color(0xFFFFFF));
    }
    public void setPanel()//?????????????????????
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
    class JTextFieldLimit extends PlainDocument//?????????????????????JTextField???????????????????????????
    {
        private int limit;
        public JTextFieldLimit(int limit)
        {
            super();
            this.limit=limit;//??????????????????
        }
        public void insertString(int offset, String str, AttributeSet attr) throws BadLocationException
        {
            if(getLength()+str.length()<=limit)
                super.insertString(offset, str, attr);
        }
    }

        private void keyboard_init()
        {
            JButton[] DIGIT={a0Button,a1Button,a2Button,a3Button,a4Button,a5Button,
                    a6Button,a7Button,a8Button,a9Button,AddButton,SubButton,
                    MulButton,DivButton,dotButton,EqualButton};//,AddButton,SubButton,MulButton,DivButton,dotButton,EqualButton,CEButton
            String[] pressed={"pressed 0","pressed NUMPAD0","pressed 1","pressed NUMPAD1","pressed 2","pressed NUMPAD2",
                    "pressed 3","pressed NUMPAD3","pressed 4","pressed NUMPAD4","pressed 5","pressed NUMPAD5",
                    "pressed 6","pressed NUMPAD6","pressed 7","pressed NUMPAD7","pressed 8","pressed NUMPAD8",
                    "pressed 9","pressed NUMPAD9","pressed ADD","pressed shitf EQUALS","pressed SUBTRACT","pressed MINUS",
                    "pressed MULTIPLY","pressed shift 8","pressed DIVIDE","pressed /","pressed DECIMAL","pressed DOT","pressed ENTER"};
            for(int i=0;i<pressed.length;i+=2)
            {
                int finalI = i;
                DIGIT[finalI].registerKeyboardAction(e->DIGIT[finalI].doClick(),KeyStroke.getKeyStroke(pressed[i]),JComponent.WHEN_IN_FOCUSED_WINDOW);
                int finalJ=i+1;
                DIGIT[finalJ].registerKeyboardAction(e->DIGIT[finalJ].doClick(),KeyStroke.getKeyStroke(pressed[i]),JComponent.WHEN_IN_FOCUSED_WINDOW);
            }
//            a0Button.registerKeyboardAction(e -> a0Button.doClick(), KeyStroke.getKeyStroke("pressed 0"), JComponent.WHEN_IN_FOCUSED_WINDOW);
//            a0Button.registerKeyboardAction(e -> a0Button.doClick(), KeyStroke.getKeyStroke("pressed NUMPAD0"), JComponent.WHEN_IN_FOCUSED_WINDOW);
//            a1Button.registerKeyboardAction(e -> a1Button.doClick(), KeyStroke.getKeyStroke("pressed 1"), JComponent.WHEN_IN_FOCUSED_WINDOW);
//            a1Button.registerKeyboardAction(e -> a1Button.doClick(), KeyStroke.getKeyStroke("pressed NUMPAD1"), JComponent.WHEN_IN_FOCUSED_WINDOW);
//            a2Button.registerKeyboardAction(e -> a2Button.doClick(), KeyStroke.getKeyStroke("pressed 2"), JComponent.WHEN_IN_FOCUSED_WINDOW);
//            a2Button.registerKeyboardAction(e -> a2Button.doClick(), KeyStroke.getKeyStroke("pressed NUMPAD2"), JComponent.WHEN_IN_FOCUSED_WINDOW);
//            a3Button.registerKeyboardAction(e -> a3Button.doClick(), KeyStroke.getKeyStroke("pressed 3"), JComponent.WHEN_IN_FOCUSED_WINDOW);
//            a3Button.registerKeyboardAction(e -> a3Button.doClick(), KeyStroke.getKeyStroke("pressed NUMPAD3"), JComponent.WHEN_IN_FOCUSED_WINDOW);
//            a4Button.registerKeyboardAction(e -> a4Button.doClick(), KeyStroke.getKeyStroke("pressed 4"), JComponent.WHEN_IN_FOCUSED_WINDOW);
//            a4Button.registerKeyboardAction(e -> a4Button.doClick(), KeyStroke.getKeyStroke("pressed NUMPAD4"), JComponent.WHEN_IN_FOCUSED_WINDOW);
//            a5Button.registerKeyboardAction(e -> a5Button.doClick(), KeyStroke.getKeyStroke("pressed 5"), JComponent.WHEN_IN_FOCUSED_WINDOW);
//            a5Button.registerKeyboardAction(e -> a5Button.doClick(), KeyStroke.getKeyStroke("pressed NUMPAD5"), JComponent.WHEN_IN_FOCUSED_WINDOW);
//            a6Button.registerKeyboardAction(e -> a6Button.doClick(), KeyStroke.getKeyStroke("pressed 6"), JComponent.WHEN_IN_FOCUSED_WINDOW);
//            a6Button.registerKeyboardAction(e -> a6Button.doClick(), KeyStroke.getKeyStroke("pressed NUMPAD6"), JComponent.WHEN_IN_FOCUSED_WINDOW);
//            a7Button.registerKeyboardAction(e -> a7Button.doClick(), KeyStroke.getKeyStroke("pressed 7"), JComponent.WHEN_IN_FOCUSED_WINDOW);
//            a7Button.registerKeyboardAction(e -> a7Button.doClick(), KeyStroke.getKeyStroke("pressed NUMPAD7"), JComponent.WHEN_IN_FOCUSED_WINDOW);
//            a8Button.registerKeyboardAction(e -> a8Button.doClick(), KeyStroke.getKeyStroke("pressed 8"), JComponent.WHEN_IN_FOCUSED_WINDOW);
//            a8Button.registerKeyboardAction(e -> a8Button.doClick(), KeyStroke.getKeyStroke("pressed NUMPAD8"), JComponent.WHEN_IN_FOCUSED_WINDOW);
//            a9Button.registerKeyboardAction(e -> a9Button.doClick(), KeyStroke.getKeyStroke("pressed 9"), JComponent.WHEN_IN_FOCUSED_WINDOW);
//            a9Button.registerKeyboardAction(e -> a9Button.doClick(), KeyStroke.getKeyStroke("pressed NUMPAD9"), JComponent.WHEN_IN_FOCUSED_WINDOW);
//            AddButton.registerKeyboardAction(e -> AddButton.doClick(), KeyStroke.getKeyStroke("pressed ADD"), JComponent.WHEN_IN_FOCUSED_WINDOW);
//            AddButton.registerKeyboardAction(e -> AddButton.doClick(), KeyStroke.getKeyStroke("pressed EQUALS"), JComponent.WHEN_IN_FOCUSED_WINDOW);
//            SubButton.registerKeyboardAction(e -> SubButton.doClick(), KeyStroke.getKeyStroke("pressed SUBTRACT"), JComponent.WHEN_IN_FOCUSED_WINDOW);
//            SubButton.registerKeyboardAction(e -> SubButton.doClick(), KeyStroke.getKeyStroke("pressed MINUS"), JComponent.WHEN_IN_FOCUSED_WINDOW);
//            MulButton.registerKeyboardAction(e -> MulButton.doClick(), KeyStroke.getKeyStroke("pressed MULTIPLY"), JComponent.WHEN_IN_FOCUSED_WINDOW);
//            DivButton.registerKeyboardAction(e -> DivButton.doClick(), KeyStroke.getKeyStroke("pressed DIVIDE"), JComponent.WHEN_IN_FOCUSED_WINDOW);
//            dotButton.registerKeyboardAction(e -> dotButton.doClick(), KeyStroke.getKeyStroke("pressed DECIMAL"), JComponent.WHEN_IN_FOCUSED_WINDOW);
//            EqualButton.registerKeyboardAction(e -> EqualButton.doClick(), KeyStroke.getKeyStroke("pressed ENTER"), JComponent.WHEN_IN_FOCUSED_WINDOW);
//            CEButton.registerKeyboardAction(e -> CEButton.doClick(), KeyStroke.getKeyStroke("pressed DELETE"), JComponent.WHEN_IN_FOCUSED_WINDOW);
        }

        private void button_init()
        {
            a0Button.addActionListener(e ->
            {
                if_operator = false;
                IOput_display("0");
            });
            a1Button.addActionListener(e ->
            {
                if_operator = false;
                IOput_display("1");
            });
            a2Button.addActionListener(e ->
            {
                if_operator = false;
                IOput_display("2");
            });
            a3Button.addActionListener(e -> {
                if_operator = false;
                IOput_display("3");
            });
            a4Button.addActionListener(e -> {
                if_operator = false;
                IOput_display("4");
            });
            a5Button.addActionListener(e -> {
                if_operator = false;
                IOput_display("5");
            });
            a6Button.addActionListener(e -> {
                if_operator = false;
                IOput_display("6");
            });
            a7Button.addActionListener(e -> {
                if_operator = false;
                IOput_display("7");
            });
            a8Button.addActionListener(e -> {
                if_operator = false;
                IOput_display("8");
            });
            a9Button.addActionListener(e -> {
                if_operator = false;
                IOput_display("9");
            });
            dotButton.addActionListener(e -> {
                if_operator = false;
                IOput_display(".");
            });
            AddButton.addActionListener(e -> {
                if_operator = true;
                nowoperator = 1;
                operator2 = "" + tmp;
                if (!operator2.isEmpty())
                    second = new BigDecimal(operator2);
                else
                    second = new BigDecimal(0);
                calculate();
                IOput_display(answer.toString());
                tmp = "";
                first = answer;
                lastoperator = nowoperator;
            });
            SubButton.addActionListener(e -> {
                if_operator = true;
                nowoperator = 2;
                operator2 = IOput.getText();
                if (!operator2.isEmpty())
                    second = new BigDecimal(operator2);
                else
                    second = new BigDecimal(0);
                calculate();
                IOput_display(answer.toString());
                tmp = "";
                first = answer;
                lastoperator = nowoperator;
            });
            MulButton.addActionListener(e -> {
                if_operator = true;
                nowoperator = 3;
                operator2 = IOput.getText();
                if (!operator2.isEmpty())
                    second = new BigDecimal(operator2);
                else
                    second = new BigDecimal(0);
                calculate();
                IOput_display(answer.toString());
                tmp = "";
                first = answer;
                lastoperator = nowoperator;
            });
            DivButton.addActionListener(e -> {
                if_operator = true;
                nowoperator = 4;
                operator2 = IOput.getText();
                if (!operator2.isEmpty())
                    second = new BigDecimal(operator2);
                else
                    second = new BigDecimal(0);
                calculate();
                IOput_display(answer.toString());
                tmp = "";
                first = answer;
                lastoperator = nowoperator;
            });
            EqualButton.addActionListener(e -> {
                if_operator = true;
                nowoperator = 0;
                operator2 = IOput.getText();
                if (!operator2.isEmpty())
                    second = new BigDecimal(operator2);
                else
                    second = new BigDecimal(0);
                calculate();
                IOput_display(answer.toString());
                tmp = "";
                first = answer;
                lastoperator = nowoperator;
            });
            CEButton.addActionListener(e -> {
            });
        }

        private void calculate()
        {
            switch (lastoperator)
            {
                case 1:answer=first.add(second);break;
                case 2:answer=first.subtract(second);break;
                case 3:answer=first.multiply(second);break;
                case 4:answer=first.divide(second);break;
                case 0:answer=second;
            }
        }

        private void IOput_display(String s)
        {
            if(if_operator==true)
                tmp="";
            tmp = tmp + s;
            IOput.setText(tmp);
        }

    }
