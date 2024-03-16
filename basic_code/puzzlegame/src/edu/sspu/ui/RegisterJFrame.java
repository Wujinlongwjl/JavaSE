package edu.sspu.ui;

import javax.swing.*;

public class RegisterJFrame extends JFrame {
    //注册界面
    public RegisterJFrame(){
        //设置页面宽高
        this.setSize(488, 500);
        //设置界面标题
        this.setTitle("拼图 注册");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居住
        this.setLocationRelativeTo(null);
        //设置关闭界面
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//括号里面也可以写3
        //设置页面显示出来
        this.setVisible(true);
    }
}
