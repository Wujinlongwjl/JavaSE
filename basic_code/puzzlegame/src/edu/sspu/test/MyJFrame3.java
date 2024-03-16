package edu.sspu.test;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyJFrame3 extends JFrame implements KeyListener {



    public MyJFrame3(){

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

        this.addKeyListener(this);








        //让界面显示出来,放到最后
        this.setVisible(true);



    }


    @Override
    public void keyTyped(KeyEvent e) {

    }

    //按下不送,会重复调用KeyPressed
    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("按下不送");

    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("松开");
        int code = e.getKeyCode();
        System.out.println(code);
        if(code == 65){
            System.out.println("按下的是A");
        }else if(code == 66){
            System.out.println("按下的是B");
        }
    }
}
