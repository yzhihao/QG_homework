package chap6;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Chap6_16 extends MouseAdapter {

    Frame f = new Frame();//f应声明为属性，才能在mousePressed()中可见
    Panel P1 = new Panel();//P1应声明为属性，才能在mousePressed()中可见
    Panel P2 = new Panel();//P2应声明为属性，才能在mousePressed()中可见
    Panel P3 = new Panel();//P3应声明为属性，才能在mousePressed()中可见
    Button b1 = new Button("红色");//b1应声明为属性，才能在mousePressed()中可见
    Button b2 = new Button("蓝色");//b2应声明为属性，才能在mousePressed()中可见
    Button b3 = new Button("黄色");//b3应声明为属性，才能在mousePressed()中可见
    public static void main(String args[]) {
        Chap6_16 ct = new Chap6_16();
        ct.init();
    }

    public void init() {
//        Frame f = new Frame();
        f.setLayout(new FlowLayout());
//        Panel P1 = new Panel();
//        Panel P2 = new Panel();
//        Panel P3 = new Panel();
//        Button b1 = new Button("红色");
//        Button b2 = new Button("蓝色");
//        Button b3 = new Button("黄色");
        f.add(b1);
        f.add(b2);
        f.add(b3);
        P1.setBackground(Color.red);
        P2.setBackground(Color.blue);
        P3.setBackground(Color.yellow);
        P1.setVisible(true);
        P2.setVisible(true);
        P3.setVisible(true);
        b1.addMouseListener(this);
        b2.addMouseListener(this);
        b3.addMouseListener(this);
        f.setSize(300, 300);
        f.setVisible(true);
    }//缺了个括号
    public void mousePressed(MouseEvent e2) {
        if (e2.getSource() == b1) {//b1应声明为属性才可见
            f.setBackground(Color.red);//f应声明为属性才可见。源代码f.add(P1);给f添加一个背景色为红色的Panel；根据原意，应设置f的背景色为红色
        }
        if (e2.getSource() == b2) {//b2应声明为属性才可见
            f.add(P2);//f应声明为属性才可见
            f.doLayout();//要让添加的组件起作用，应该再调用doLayout()方法，因为f的layout变了
        }
        if (e2.getSource() == b3) {//b3应声明为属性才可见
            f.add(P3);
            f.doLayout();//要让添加的组件起作用，应该再调用doLayout()方法，因为f的layout变了
        }
    }
}