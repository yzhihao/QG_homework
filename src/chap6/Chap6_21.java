package chap6;


import java.awt.*;    
import java.awt.event.*;    
import javax.swing.*;    
   
  
   
class Calculator extends JFrame implements ActionListener {   
	
    Container p;    
    JSplitPane jsp;    
    JTextField resultFiled = new JTextField("0");    
    JPanel resultPane = new JPanel();    
    JPanel btnPane = new JPanel();    
    static float op1=0;    
    static int len=0;    
    static float op2=0;    
    static String output = "";    
    static String opp = "";    
    static boolean flag1 = true;    
    static boolean flag2 = true;    
    String[] btnS = {"1", "2", "3", "+",    
                                     "4", "5", "6", "-",    
                                     "7", "8", "9", "*",    
                                     "0", "=", ".", "/"};    
    JButton[] btn = new JButton[16];    
        
    
    public static void main(String[] args) {
    	Calculator c = new Calculator();    
        c.setVisible(true);
	}
    public Calculator() {    
        p = getContentPane();    
        setBounds(100, 100, 300, 300);    
        setTitle("计算器");    
        //setResizable(false);    
        setIconImage(new ImageIcon("16.png").getImage());    //设置窗体显示的图标    
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
        setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));  //设置鼠标形状    
        this.setBackground(new Color(255, 0, 255));    
        JButton cz = new JButton("reset");    
        cz.setBounds(0,0,80,20);    
        cz.setBackground(new Color(65, 105, 225));    
        cz.setForeground(new Color(255, 0, 0));    
        cz.addActionListener(this);    
        resultFiled.setEditable(false);    
        resultFiled.setHorizontalAlignment(JTextField.RIGHT);  //设置自右向左显示    
        resultFiled.setColumns(12);    
        resultFiled.setFont(new Font("", Font.PLAIN, 14));    
        resultFiled.setBackground(new Color(0, 255, 127));    
        resultFiled.setForeground(new Color(255, 0, 0));    
        JButton qx = new JButton("cancel");    
        qx.addActionListener(this);    
        qx.setBackground(new Color(65, 105, 225));    
        qx.setForeground(new Color(255, 0, 0));    
        qx.setSize(80,20);    
        resultPane.setLayout(new FlowLayout());    
        resultPane.add(cz);    
        resultPane.add(resultFiled);    
        resultPane.add(qx);    
        btnPane.setLayout(new GridLayout(4, 0, 5, 5));    
        for(int i=0; i<16; i++) {    
            btn[i] = new JButton(btnS[i]);    
            btn[i].setBorderPainted(true);    
            btn[i].setContentAreaFilled(true);    
            btn[i].setFont(new Font("", Font.BOLD, 25));    
            btn[i].setBackground(new Color(255,255,0));    
            btn[i].setForeground(new Color(255,0,0));    
            btn[i].addActionListener(this);    
            btnPane.add(btn[i]);    
        }    
        jsp = new JSplitPane(JSplitPane.VERTICAL_SPLIT, resultPane, btnPane);    
        jsp.setDividerSize(3);    
        jsp.setDividerLocation(35);    
        p.add(jsp, BorderLayout.CENTER);    
    }    
    public void actionPerformed(ActionEvent e) {    
        if(flag1&&    
          (e.getActionCommand()=="1" ||    
           e.getActionCommand()=="2" ||    
           e.getActionCommand()=="3" ||    
           e.getActionCommand()=="4" ||    
           e.getActionCommand()=="5" ||    
           e.getActionCommand()=="6" ||    
           e.getActionCommand()=="7" ||    
           e.getActionCommand()=="8" ||    
           e.getActionCommand()=="9" ||    
           e.getActionCommand()=="0" ||    
           e.getActionCommand()==".")) {    
            output += e.getActionCommand();    
            resultFiled.setText(output);    
        }    
        if(e.getActionCommand()=="=") {    
            if(flag1){    
                op2 = Float.parseFloat(resultFiled.getText().substring(len+1));    
                output += e.getActionCommand();    
                if(opp == "+") {    
                    output += (op1+op2)+"";    
                } if(opp == "-") {    
                    output += (op1+op2)+"";    
                } if(opp == "*") {    
                    output += (op1*op2)+"";    
                } if(opp == "/"){    
                    if(op2-0.0 == 0) {    
                        output += "error";    
                    } else {    
                        output += (op1/op2)+"";    
                    }    
                }    
                resultFiled.setText(output);    
                flag1 = false;    
            }    
        }    
        if(e.getActionCommand() == "reset") {    
            op1 = 0;    
            op2 = 0;    
            opp = "";    
            output ="";    
            flag1 = true;    
            flag2 = true;    
            resultFiled.setText("0");    
        }    
        if(e.getActionCommand() == "+" ||    
           e.getActionCommand() == "-" ||    
           e.getActionCommand() == "*" ||    
           e.getActionCommand() == "/"){    
            if(flag2) {    
                op1 = Float.parseFloat(resultFiled.getText());    
                len = resultFiled.getText().length();    
                opp = e.getActionCommand();    
                output += e.getActionCommand();    
                resultFiled.setText(output);    
                flag2 = false;    
            }    
        }               
    }    
    
}   

