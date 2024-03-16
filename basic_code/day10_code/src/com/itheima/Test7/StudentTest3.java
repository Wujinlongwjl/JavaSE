//2024年1月2日20:26:01
package com.itheima.Test7;

public class StudentTest3 {
    public static void main(String[] args) {
        //创建一个数组

        Student[] arr = new Student[3];
        //创建对象
        Student stu1 = new Student(1, "zhangsan", 23);
        Student stu2 = new Student(2, "lisi", 24);
        Student stu3 = new Student(3, "wangwu", 25);

        //将对象添加到数组当中
        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;



        //要求5：查询数组id为“heimat002”的学生，如果存在，则将他的年龄+1岁
        int index = getIndex(arr, 2);
        //判断索引是否有数据
        if(index >= 0 ){
            Student stu = arr[index];
            int newAge = stu.getAge()+ 1;
            stu.setAge(newAge);
            //遍历数据
            printArr(arr);
        }else {
            System.out.println("当前ID不存在, 修改失败");
        }
    }







    //获取删除的索引,如果该ID在数组中,就返回他的索引,不在数组当中,返回-1
    public static int getIndex(Student[] arr, int id){
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if(stu != null){
                int sid = stu.getId();
                if(sid == id){
                    return i;
                }
            }


        }
        return -1;
    }


    public static void printArr(Student[] arr){

        for (int i = 0; i < arr.length; i++) {
            Student student = arr[i];
            if(student != null){
                System.out.println(student.getId()+", " + student.getName() + ", " +student.getAge());
            }

        }
    }
}
