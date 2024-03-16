package com.itheima.myhashsettest;

public class Student implements Comparable<Student> {
    private String name;
    private int age;
    private int chinese;
    private int english;
    private int math;

    public Student() {
    }

    public Student(String name, int age, int chinese, int english, int math) {
        this.name = name;
        this.age = age;
        this.chinese = chinese;
        this.english = english;
        this.math = math;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     *
     * @return chinese
     */
    public int getChinese() {
        return chinese;
    }

    /**
     * 设置
     *
     * @param chinese
     */
    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    /**
     * 获取
     *
     * @return english
     */
    public int getEnglish() {
        return english;
    }

    /**
     * 设置
     *
     * @param english
     */
    public void setEnglish(int english) {
        this.english = english;
    }

    /**
     * 获取
     *
     * @return math
     */
    public int getMath() {
        return math;
    }

    /**
     * 设置
     *
     * @param math
     */
    public void setMath(int math) {
        this.math = math;
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + ", chinese = " + chinese + ", english = " + english + ", math = " + math + "}";
    }


    /*如果总分一样，按照语文成绩排
    如果语文一样，按照数学成绩排
    如果数学成绩一样，按照英语成绩排
    如果英文成绩一样，按照年龄排
    如果年龄一样，按照姓名的字母顺序排
    如果都一样，认为是同一个学生，不存。*/
    @Override
    public int compareTo(Student o) {
        int sum1 = this.getChinese() + this.getMath() + this.getEnglish();
        int sum2 = o.getChinese() + o.getMath() + o.getEnglish();
        //比较总分
        int i = sum1 - sum2;
        //比较语文
        i = i == 0 ? this.getChinese() - o.getChinese() : i;
        //比较数学
        i = i == 0 ? this.getMath() - o.getMath() : i;
        //比较英语
        i = i == 0 ? this.getEnglish() - o.getEnglish() : i;
        //比较年龄
        i = i == 0 ? this.getAge() - o.getAge() : i;
        //比较姓名字母顺序
        i = i == 0 ? this.getName().compareTo(o.getName()) : i;

        return i;
    }
}
