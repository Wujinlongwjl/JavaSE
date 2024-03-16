package com.itheima.myreflect3;

public class Teacher {
    private String name;
    private double salary;


    public Teacher() {
    }

    public Teacher(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * 设置
     * @param salary
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void teach(){
        System.out.println("老师在教书");
    }

    public String toString() {
        return "Teacher{name = " + name + ", salary = " + salary + "}";
    }
}
