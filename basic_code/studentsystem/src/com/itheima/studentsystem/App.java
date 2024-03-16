//2024年1月7日09:32:34
package com.itheima.studentsystem;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //创建集合
        ArrayList<User> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("欢迎来到学生管理系统");
            System.out.println("请选择操作：1登录 2注册 3忘记密码 4退出");
            String choose = sc.next();
            switch (choose) {
                case "1" -> login(list);//登录
                case "2" -> register(list);//注册
                case "3" -> forgetPassword(list);//忘记密码
                case "4" -> {
                    System.out.println("谢谢使用,再见");//退出
                    System.exit(0);
                }
                default -> System.out.println("没有这个选项");

            }
        }
    }


    //登录
    private static void login(ArrayList<User> list) {
        Scanner sc = new Scanner(System.in);
            System.out.println("请输入用户名:");
            String username = sc.next();
            //先判断用户名有无注册,没有注册先注册再登录
            boolean flag = contains(list, username);
            if (!flag) {
                System.out.println("用户名" + username + "未注册,请先注册后再登录");
                return;
            }

            //输错三次密码,就要锁定账户(还没实现该功能)
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入密码");
            String password = sc.next();

            //输入验证码
            while (true) {
                String rightCode = getCode();
                System.out.println("当前正确的验证码为" + rightCode);
                System.out.println("请输入验证码");
                String code = sc.next();
                if (code.equalsIgnoreCase(rightCode)) {
                    System.out.println("验证码正确");
                    break;
                } else {
                    System.out.println("验证码错误,请重新输入:");
                    continue;

                }
            }

            //将用户名与密码放到用户对象当中,判断用户名与密码与创建的是否相同
            User user = new User(username, password, null, null);
            boolean result = checkUserInfo(list, user);
            if (result) {
                System.out.println("用户登录成功,可以开始使用学生管理系统了");
                StudentSystem ss = new StudentSystem();
                ss.startStudentSystem();
                break;
            } else {
                System.out.println("登录失败,用户名或密码错误");
                if (i == 2) {
                    System.out.println("当前账户已锁定,请联系管理员");
                    return;
                }else {
                    System.out.println("登录失败,还剩" + (2 - i) + "次机会");

                }
            }
        }


    }

    //忘记密码
    private static void forgetPassword(ArrayList<User> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String username = sc.next();
        boolean result = contains(list, username);//判断忘记密码的用户名是否注册了
        if(!result){
            System.out.println("当前账户" + username+"未注册");
            return;
        }
        System.out.println("请输入身份证号码:");
        String personID = sc.next();
        System.out.println("请输入手机号码:");
        String phoneNumber = sc.next();

        //先把用户对象通过索引获取出来
        int index = findIndex(list, username);
        User user = list.get(index);
        //比较用户的对象中的身份证号码与电话号码是否一致
        if(!(user.getPersonID().equals(personID) && user.getPhoneNumber().equals(phoneNumber))){
            System.out.println("身份证号码或手机号码错误,不能修改密码");
            return;
        }

        //重新输入密码
        String password;
        while (true) {
            System.out.println("请输入密码:");
            password = sc.next();
            System.out.println("请再次输入密码");
            String againPassword = sc.next();
            if (password.equals(againPassword)) {
                System.out.println("两次密码输入一致");
                break;
            }else {
                System.out.println("两次密码输入不一致,请重新输入");
                continue;
            }
        }
        //将新修改的密码换掉旧密码
        user.setPassword(password);
        System.out.println("密码修改成功");


    }

    //找到用户相同的索引,不同返回-1
    private static int findIndex(ArrayList<User> list, String username) {
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            if(user.getUsername().equals(username)){
                return i;
            }

        }
        return -1;
    }


    //判断用户名与密码是否与传输进来的一致
    private static boolean checkUserInfo(ArrayList<User> list, User user) {
        for (int i = 0; i < list.size(); i++) {
            User useInfo = list.get(i);
            if (useInfo.getUsername().equals(user.getUsername()) && useInfo.getPassword().equals(user.getPassword())) {
                return true;
            }

        }
        return false;

    }

    //注册
    private static void register(ArrayList<User> list) {

        //键盘录入用户名,密码,身份证号码,电话号码
        Scanner sc = new Scanner(System.in);
        String username;
        while (true) {
            System.out.println("请输入用户名:");
            username = sc.next();
            boolean flag = checkUsername(username);
            if (!flag) {
                System.out.println("用户格式不满足,请重新输入:");
                continue;
            }
            boolean flag1 = contains(list, username);
            if (flag1) {
                System.out.println("用户名" + username + "已存在,请重新录入:");
            } else {
                System.out.println("用户名" + username + "可用");
                break;
            }
        }


        //键盘录入密码
        String password;
        while (true) {
            System.out.println("请输入注册的密码");
            password = sc.next();
            System.out.println("请确认输入注册的密码");
            String againPassword = sc.next();
            if (!againPassword.equals(password)) {
                System.out.println("两次输入的密码不一致,请重新输入:");
                continue;
            } else {
                System.out.println("两次输入的密码一致,请继续录入其他数据");
                break;
            }
        }

        //键盘录入身份证
        String personID;
        while (true) {
            System.out.println("请输入身份证号码:");
            personID = sc.next();
            boolean flag = checkPersonID(personID);
            if (flag) {
                System.out.println("身份证号码满足要求");
                break;
            } else {
                System.out.println("身份证号码格式有误,请重新输入:");
                continue;
            }
        }


        //键盘录入手机号码
        String phoneNumber;
        while (true) {
            System.out.println("请输入手机号码:");
            phoneNumber = sc.next();
            boolean flag = checkPhoneNumber(phoneNumber);
            if (flag) {
                System.out.println("录入电话号码满足要求");
                break;
            } else {
                System.out.println("录入电话号码格式有误,请重新录入:");
                continue;
            }
        }


        //把用户名,密码,身份证号码,电话号码添加到用户对象中
        User user = new User(username, password, personID, phoneNumber);
        //把用户对象添加到集合中
        list.add(user);
        System.out.println("注册成功");
        //遍历集合
        printList(list);


    }


    //遍历集合
    private static void printList(ArrayList<User> list) {
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            System.out.println(user.getUsername() + ", " + user.getPassword() + ", " +
                    user.getPersonID() + ", " + user.getPhoneNumber());

        }
    }

    //判断电话号码格式
    private static boolean checkPhoneNumber(String phoneNumber) {
        //长度为11位
        if (phoneNumber.length() != 11) {
            return false;
        }
        //不能以0为开头
        if (phoneNumber.startsWith("0")) {
            //如果以0开头,返回false
            return false;
        }
        //必须都是数字
        for (int i = 0; i < phoneNumber.length(); i++) {
            char c = phoneNumber.charAt(i);
            if (!(c >= '0' && c <= '9')) {
                return false;
            }
        }
        return true;

    }

    //判断身份证号码格式是否符合
    private static boolean checkPersonID(String personID) {
        //必须是18位
        if (personID.length() != 18) {
            return false;
        }
        //不能以0开头
        if (personID.startsWith("0")) {
            //如果以0开头,返回false
            return false;
        }
        //前面17位为数字
        for (int i = 0; i < personID.length() - 1; i++) {
            char c = personID.charAt(i);
            if (!(c >= '0' && c <= '9')) {
                return false;
            }
        }
        //第十八为可以是数字,也可以是x或者X
        char endChar = personID.charAt(personID.length() - 1);//将最后一位变成字符,进行判断
        if ((endChar >= '0' && endChar <= '9') || (endChar == 'x') || (endChar == 'X')) {
            return true;
        } else {
            return false;
        }

    }

    //判断用户名是否相同
    private static boolean contains(ArrayList<User> list, String username) {
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            String username1 = user.getUsername();
            if (username1.equals(username)) {
                return true;
            }

        }
        return false;
    }

    //判断用户名格式
    private static boolean checkUsername(String username) {
        int len = username.length();
        if (len < 3 || len > 15) {
            return false;
        }

        for (int i = 0; i < username.length(); i++) {
            char c = username.charAt(i);
            if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9'))) {
                return false;
            }
        }

        int count = 0;
        for (int i = 0; i < username.length(); i++) {
            char c = username.charAt(i);
            if ((c > 'a' && c < 'z') || (c > 'A' && c < 'Z')) {
                count++;
                break;//只要有一个字母,就可以直接返回
            }
        }
        return count > 0;


    }



    //随机生成验证码
    public static String getCode() {
        //创建字符型集合
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            list.add((char) (i + 'a'));
            list.add((char) (i + 'A'));

        }
        Random r = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            int index = r.nextInt(list.size());
            char c = list.get(index);
            sb.append(c);

        }
        int number = r.nextInt(10);
        sb.append(number);

        //将字符串转换成字符数组
        char[] arr = sb.toString().toCharArray();
        int randomIndex = r.nextInt(arr.length);
        char temp = arr[randomIndex];
        arr[randomIndex] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;


        return new String(arr);
    }

}


