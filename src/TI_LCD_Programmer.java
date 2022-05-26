import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.math.BigDecimal;

public class TI_LCD_Programmer extends JFrame
{
    public TI_LCD_Programmer()
    {
        keyboard_init();
        button_init();
//        a3Button.addKeyListener(new KeyAdapter()
//        {
//            @Override
//            public void keyReleased(KeyEvent e)
//            {
//                super.keyReleased(e);
//                int keycode=e.getKeyCode();
//                System.out.println(KeyStroke.getKeyStroke(keycode,0,false));
//            }
//        });

    }

    public void init()
    {
        IOput.setBorder(BorderFactory.createEmptyBorder());
        Base.setBorder(BorderFactory.createEmptyBorder());
        this.setTitle("TI_LCD_Programmer");
        this.add(TI_LCD_Programmer);
        Toolkit kit = Toolkit.getDefaultToolkit();
        this.pack();
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void keyboard_init()
    {
        a0Button.registerKeyboardAction(e -> a0Button.doClick(), KeyStroke.getKeyStroke("pressed 0"), JComponent.WHEN_IN_FOCUSED_WINDOW);
        a0Button.registerKeyboardAction(e -> a0Button.doClick(), KeyStroke.getKeyStroke("pressed NUMPAD0"), JComponent.WHEN_IN_FOCUSED_WINDOW);
        a1Button.registerKeyboardAction(e -> a1Button.doClick(), KeyStroke.getKeyStroke("pressed 1"), JComponent.WHEN_IN_FOCUSED_WINDOW);
        a1Button.registerKeyboardAction(e -> a1Button.doClick(), KeyStroke.getKeyStroke("pressed NUMPAD1"), JComponent.WHEN_IN_FOCUSED_WINDOW);
        a2Button.registerKeyboardAction(e -> a2Button.doClick(), KeyStroke.getKeyStroke("pressed 2"), JComponent.WHEN_IN_FOCUSED_WINDOW);
        a2Button.registerKeyboardAction(e -> a2Button.doClick(), KeyStroke.getKeyStroke("pressed NUMPAD2"), JComponent.WHEN_IN_FOCUSED_WINDOW);
        a3Button.registerKeyboardAction(e -> a3Button.doClick(), KeyStroke.getKeyStroke("pressed 3"), JComponent.WHEN_IN_FOCUSED_WINDOW);
        a3Button.registerKeyboardAction(e -> a3Button.doClick(), KeyStroke.getKeyStroke("pressed NUMPAD3"), JComponent.WHEN_IN_FOCUSED_WINDOW);
        a4Button.registerKeyboardAction(e -> a4Button.doClick(), KeyStroke.getKeyStroke("pressed 4"), JComponent.WHEN_IN_FOCUSED_WINDOW);
        a4Button.registerKeyboardAction(e -> a4Button.doClick(), KeyStroke.getKeyStroke("pressed NUMPAD4"), JComponent.WHEN_IN_FOCUSED_WINDOW);
        a5Button.registerKeyboardAction(e -> a5Button.doClick(), KeyStroke.getKeyStroke("pressed 5"), JComponent.WHEN_IN_FOCUSED_WINDOW);
        a5Button.registerKeyboardAction(e -> a5Button.doClick(), KeyStroke.getKeyStroke("pressed NUMPAD5"), JComponent.WHEN_IN_FOCUSED_WINDOW);
        a6Button.registerKeyboardAction(e -> a6Button.doClick(), KeyStroke.getKeyStroke("pressed 6"), JComponent.WHEN_IN_FOCUSED_WINDOW);
        a6Button.registerKeyboardAction(e -> a6Button.doClick(), KeyStroke.getKeyStroke("pressed NUMPAD6"), JComponent.WHEN_IN_FOCUSED_WINDOW);
        a7Button.registerKeyboardAction(e -> a7Button.doClick(), KeyStroke.getKeyStroke("pressed 7"), JComponent.WHEN_IN_FOCUSED_WINDOW);
        a7Button.registerKeyboardAction(e -> a7Button.doClick(), KeyStroke.getKeyStroke("pressed NUMPAD7"), JComponent.WHEN_IN_FOCUSED_WINDOW);
        a8Button.registerKeyboardAction(e -> a8Button.doClick(), KeyStroke.getKeyStroke("pressed 8"), JComponent.WHEN_IN_FOCUSED_WINDOW);
        a8Button.registerKeyboardAction(e -> a8Button.doClick(), KeyStroke.getKeyStroke("pressed NUMPAD8"), JComponent.WHEN_IN_FOCUSED_WINDOW);
        a9Button.registerKeyboardAction(e -> a9Button.doClick(), KeyStroke.getKeyStroke("pressed 9"), JComponent.WHEN_IN_FOCUSED_WINDOW);
        a9Button.registerKeyboardAction(e -> a9Button.doClick(), KeyStroke.getKeyStroke("pressed NUMPAD9"), JComponent.WHEN_IN_FOCUSED_WINDOW);
        AddButton.registerKeyboardAction(e -> AddButton.doClick(), KeyStroke.getKeyStroke("pressed ADD"), JComponent.WHEN_IN_FOCUSED_WINDOW);
        AddButton.registerKeyboardAction(e -> AddButton.doClick(), KeyStroke.getKeyStroke("pressed EQUALS"), JComponent.WHEN_IN_FOCUSED_WINDOW);
        SubButton.registerKeyboardAction(e -> SubButton.doClick(), KeyStroke.getKeyStroke("pressed SUBTRACT"), JComponent.WHEN_IN_FOCUSED_WINDOW);
        SubButton.registerKeyboardAction(e -> SubButton.doClick(), KeyStroke.getKeyStroke("pressed MINUS"), JComponent.WHEN_IN_FOCUSED_WINDOW);
        MulButton.registerKeyboardAction(e -> MulButton.doClick(), KeyStroke.getKeyStroke("pressed MULTIPLY"), JComponent.WHEN_IN_FOCUSED_WINDOW);
        DivButton.registerKeyboardAction(e -> DivButton.doClick(), KeyStroke.getKeyStroke("pressed DIVIDE"), JComponent.WHEN_IN_FOCUSED_WINDOW);
        dotButton.registerKeyboardAction(e -> dotButton.doClick(), KeyStroke.getKeyStroke("pressed DECIMAL"), JComponent.WHEN_IN_FOCUSED_WINDOW);
        EqualButton.registerKeyboardAction(e -> EqualButton.doClick(), KeyStroke.getKeyStroke("pressed ENTER"), JComponent.WHEN_IN_FOCUSED_WINDOW);
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


    private JPanel TI_LCD_Programmer;
    private JPanel TextPanel1;
    private JPanel ButtonPanel;
    private JPanel TextPanel2;
    private JTextField IOput;
    private JTextField Base;
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
    private JButton kButton;
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
    private int symbol = 1;
    private boolean if_operator = false;   //是否是运算符
    private String operator1 = "";            //操作数1
    private String operator2 = "";            //操作数2
    private String tmp = "";                  //用于在ioput中显示
    private BigDecimal first=new BigDecimal(0);
    private BigDecimal firstmul=new BigDecimal(1);
    private BigDecimal second=new BigDecimal(0);
    private BigDecimal answer=new BigDecimal(0);
    private int lastoperator=0;               //上一运算符
    private int nowoperator=0;                //本次运算符
}
