package edu.sspu.test;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyJFrame2 extends JFrame implements MouseListener {

    JButton jbt1 = new JButton("点我呀");

    public MyJFrame2(){

        //设置界面的宽高
        this.setSize(503, 580);
        //设置界面标题
        this.setTitle("拼图单机版 v1.0");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置关闭界面
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//括号里面也可以写3
        //取消界面居中放置, 这样x,y就可以更改
        this.setLayout(null);


        jbt1.setBounds(0,0,100,50);

        //鼠标事件
        jbt1.addMouseListener(this);



        this.getContentPane().add(jbt1);

        //让界面显示出来,放到最后
        this.setVisible(true);



    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("单击");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("按下不送");

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("松开");

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("移入");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("移出");
    }
}
