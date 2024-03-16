package edu.sspu.test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class MyJFrame extends JFrame implements ActionListener {

    JButton jbt1 = new JButton("点我呀");
    JButton jbt2 = new JButton("再点我呀");

    public MyJFrame(){

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
        jbt1.addActionListener(this);

        jbt2.setBounds(100,0,100,50);
        jbt2.addActionListener(this);

        this.getContentPane().add(jbt1);
        this.getContentPane().add(jbt2);

        //让界面显示出来,放到最后
        this.setVisible(true);



    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if(source == jbt1){
            jbt1.setSize(200,200);
        }else if(source == jbt2){
            Random r = new Random();
            jbt2.setLocation(r.nextInt(500),r.nextInt(500));
        }
    }
}
