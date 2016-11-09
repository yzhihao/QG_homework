package chap6;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
 
public class Chap6_23{
    
    public static void main(String[] args) {
        new MyFrame();
    }
}
 
class MyFrame extends JFrame
{
    public MyFrame()
    {  
        super("改变面板颜色");
        final JPanel pan=new JPanel();
        pan.setBackground(Color.RED);
        JButton btnChangePanColor=new JButton("改变面板颜色");
        btnChangePanColor.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				pan.setBackground(Color.GREEN);//改变面板颜色
			}
       	
        });
        pan.setLayout(new FlowLayout());
        pan.add(btnChangePanColor);
        this.getContentPane().add(pan);
        this.setSize(300,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//用户单击“关闭”按钮时关闭窗口
        this.setResizable(false);
        this.setVisible(true);
    }
}