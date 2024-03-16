package edu.sspu.ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class GameJFrame extends JFrame implements KeyListener, ActionListener {




    //定义一个二维数组
    int[][] data = new int[4][4];
    //记录空白方块在二维数组当中的位置
    int x = 0;
    int y = 0;

    String path = "puzzlegame\\image\\girl\\girl3\\";


    int[][] win = new int[][]{
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 0}
    };

    int step = 0;


    //创建选项下面的条目对象
    JMenuItem replayItem = new JMenuItem("重新游戏");
    JMenuItem ReLoginItem = new JMenuItem("重新登录");
    JMenuItem closeItem = new JMenuItem("关闭游戏");


    JMenuItem girl = new JMenuItem("美女");
    JMenuItem animal = new JMenuItem("动物");
    JMenuItem sport = new JMenuItem("运动");


    JMenuItem accountItem = new JMenuItem("公众号");

    //创建随机对象
    Random r = new Random();


    //创建主界面
    public GameJFrame() {
        //初始化界面
        InitJFrame();
        //初始化菜单
        InitJMenuBar();
        //初始化数据
        InitDate();
        //初始化图片
        InitImage();


        //让界面显示出来,放到最后
        this.setVisible(true);
    }


    //初始化数据
    private void InitDate() {
        //创建一维数组
        int[] tempArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        Random r = new Random();
        for (int i = 0; i < tempArr.length; i++) {
            int index = r.nextInt(tempArr.length);
            int temp = tempArr[i];
            tempArr[i] = tempArr[index];
            tempArr[index] = temp;

        }
        //把随机生成的一维数组放到二维数组当中
        //方法一:
        for (int i = 0; i < tempArr.length; i++) {
            if(tempArr[i] == 0){
                x = i / 4;
                y = i % 4;

            }
            data[i / 4][i % 4] = tempArr[i];

        }

    }


    //初始化图片
    private void InitImage() {

        this.getContentPane().removeAll();

        if(victory()){
            JLabel winJLabel = new JLabel(new ImageIcon("puzzlegame\\image\\win.png"));
            winJLabel.setBounds(203,283,197,73);
            this.getContentPane().add(winJLabel);
        }

        //统计步数:
        JLabel stepCount = new JLabel("步数:" + step);
        stepCount.setBounds(50,30,100,20);
        this.getContentPane().add(stepCount);

        //外循环---执行4次
        for (int i = 0; i < 4; i++) {
            //内循环---表示在一行添加四次图片
            for (int j = 0; j < 4; j++) {
                //随机生成图片
                int num = data[i][j];

                //创建一个ImageIcon对象
                //创建JLabel对象(管理容器)
                JLabel jLabel = new JLabel(new ImageIcon(path + num + ".jpg"));
                //this.add(jLabel);
                //指定图片位置
                jLabel.setBounds(j * 105 + 83, i * 105 + 134, 105, 105);
                //添加图片边框
                //0表示凸起来
                //1表示凹下去
                jLabel.setBorder(new BevelBorder(BevelBorder.LOWERED));//括号里面也可以写1
                //把图片添加到容器中
                this.getContentPane().add(jLabel);
                //添加一张图片,number自增一次,表示下一次加载后面一张图片

            }
        }

        //添加背景图片
        JLabel background = new JLabel(new ImageIcon("puzzlegame\\image\\background.png"));
        background.setBounds(40,40,508,560);
        this.getContentPane().add(background);


        this.getContentPane().repaint();

    }


    //初始化菜单
    private void InitJMenuBar() {
        //初始化界面
        //创建整合的菜单对象
        JMenuBar jMenuBar = new JMenuBar();

        //创建菜单上面的两个选项的对象
        JMenu functionJMenu = new JMenu("功能");
        JMenu aboutJMenu = new JMenu("关于我们");

        //创建更换图片
        JMenu changeImage = new JMenu("更换图片");


        //把美女，动物，运动添加到更换图片当中
        changeImage.add(girl);
        changeImage.add(animal);
        changeImage.add(sport);

        //将每一个选项下面的条目添加到选项当中
        functionJMenu.add(changeImage);
        functionJMenu.add(replayItem);
        functionJMenu.add(ReLoginItem);
        functionJMenu.add(closeItem);




        aboutJMenu.add(accountItem);


        //给条目绑定事件
        replayItem.addActionListener(this);
        ReLoginItem.addActionListener(this);
        closeItem.addActionListener(this);
        accountItem.addActionListener(this);
        girl.addActionListener(this);
        animal.addActionListener(this);
        sport.addActionListener(this);


        //将菜单里面的两个选项添加到菜单当中
        jMenuBar.add(functionJMenu);
        jMenuBar.add(aboutJMenu);


        //给整个界面设置菜单
        this.setJMenuBar(jMenuBar);
    }


    //初始化界面
    private void InitJFrame() {
        //设置界面的宽高
        this.setSize(603, 680);
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

        //将整个界面进行键盘监听
        this.addKeyListener(this);

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    //按下不松
    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        if(code == 65){
            //将界面所有图片全部删除
            this.getContentPane().removeAll();
            //加载一张完整的照片
            JLabel all = new JLabel(new ImageIcon(path + "all.jpg"));
            all.setBounds(83,134,420,420);
            this.getContentPane().add(all);

            //添加背景图片
            JLabel background = new JLabel(new ImageIcon("puzzlegame\\image\\background.png"));
            background.setBounds(40,40,508,560);
            this.getContentPane().add(background);

            this.getContentPane().add(background);
            //刷新界面
            this.getContentPane().repaint();

        }

    }


    @Override
    public void keyReleased(KeyEvent e) {

        if(victory()){
            return;
        }

        int code = e.getKeyCode();
        //空白方块右边向左移动
        if(code == 37){
            System.out.println("向左移动");
            //空白方块在最右边无法左移
            if(y == 3){
                return;
            }
            data[x][y] = data[x][y+1];
            data[x][y+1] = 0;
            y++;

            step++;
            InitImage();

            //空白方块下面向上移动
        }else if(code == 38){
            System.out.println("向上移动");
            //空白方块在最下面
            if(x == 3){
                return;
            }
            data[x][y] = data[x+1][y];
            data[x+1][y] = 0;
            x++;
            step++;
            InitImage();



            //空白方块左边向右移动
        }else if(code == 39){
            System.out.println("向右移动");
            //空白方块在最左边
            if(y == 0){
                return;
            }
            data[x][y] = data[x][y-1];
            data[x][y-1] = 0;
            y--;
            step++;
            InitImage();

            //空白方块的上面向空白方块下移
        }else if(code == 40){
            System.out.println("向下移动");
            //空白方块在最上面
            if(x == 0){
                return;
            }
            data[x][y] = data[x-1][y];
            data[x-1][y] = 0;
            x--;
            step++;
            InitImage();
        }else if(code == 65){
            InitImage();
        }else if(code == 87){
            data = new int[][]{
                    {1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12},
                    {13, 14, 15, 0}
            };
            InitImage();
        }

    }

    public boolean victory(){
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                //有一个不正确,返回false
                if(data[i][j] != win[i][j]){
                    return false;
                }
            }

        }
        //循环结束
        return true;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //获取当前被点击的条目对象
        Object source = e.getSource();
        if(source == replayItem){
            System.out.println("重新游戏");
            //计步器归零
            step = 0;
            //再次打乱二维数组顺序
            InitDate();
            //重新加载图片
            InitImage();
        }else if(source == ReLoginItem){
            System.out.println("重新登录");
            this.setVisible(false);
            new LoginJFrame();

        }else if(source == closeItem){
            System.out.println("关闭游戏");
            System.exit(0);
        }else if(source == accountItem){
            System.out.println("公众号");
            JDialog jDialog = new JDialog();
            JLabel jLabel = new JLabel(new ImageIcon( "puzzlegame\\image\\about.png"));
            //设置位置和宽高
            jLabel.setBounds(0,0,258,258);
            jDialog.getContentPane().add(jLabel);
            //给弹窗设置大小
            jDialog.setSize(344,344);
            //让弹窗置顶
            jDialog.setAlwaysOnTop(true);
            ///让弹窗居中
            jDialog.setLocationRelativeTo(null);
            //弹窗不关闭,无法操作下面的界面
            jDialog.setModal(true);
            //让弹窗显示出来
            jDialog.setVisible(true);
            //更换girl照片
        }else if(source == girl){
            System.out.println("girl");
            int num1 = r.nextInt(13) + 1;
            path = "puzzlegame\\image\\girl\\girl" + num1 +"\\";
            step = 0;
            InitDate();
            InitImage();
            //更换动物照片
        }else if(source == animal){
            System.out.println("animal");
            int num2 = r.nextInt(8) + 1;
            path = "puzzlegame\\image\\animal\\animal" + num2 +"\\";
            step = 0;
            InitDate();
            InitImage();
            //更换运动照片
        }else if(source == sport){
            System.out.println("sport");
            int num3 = r.nextInt(10) + 1;
            path = "puzzlegame\\image\\sport\\sport" + num3 +"\\";
            step = 0;
            InitDate();
            InitImage();
        }

    }
}
