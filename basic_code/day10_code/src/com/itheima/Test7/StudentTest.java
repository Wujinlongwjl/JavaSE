//2024年1月2日20:26:35
package com.itheima.Test7;

public class StudentTest {
    public static void main(String[] args) {
        /*定义一个长度为3的数组，数组存储1~3名学生对象作为初始数据，学生对象的学号，姓名各不相同。
    学生的属性：学号，姓名，年龄。
    要求1：再次添加一个学生对象，并在添加的时候进行学号的唯一性判断。
    要求2：添加完毕之后，遍历所有学生信息。
    要求3：通过id删除学生信息
    如果存在，则删除，如果不存在，则提示删除失败。
    要求4：删除完毕之后，遍历所有学生信息。
    要求5：查询数组id为“heimat002”的学生，如果存在，则将他的年龄+1岁*/



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


        //要求1：再次添加一个学生对象，并在添加的时候进行学号的唯一性判断。
        //    要求2：添加完毕之后，遍历所有学生信息。
        Student stu4 = new Student(4, "longliu", 26);
        boolean flag = contains(arr, stu4.getId());
        if (flag) {
            System.out.println("你输入的学号已存在, 请重新输入学号:");
        } else {
            //判断数组是否已满
            int count = getCount(arr);
            //数组已满
            if (count == arr.length) {
                //对老数组加一个长度,新数组比老数组长度多一个,
                Student[] newArr = creatNewArr(arr);
                newArr[count] = stu4;

                printArr(newArr);

            } else {
                //不满,直接将对象加入数组当中
                arr[count] = stu4;
                printArr(arr);
            }

        }

        //要求3：通过id删除学生信息
        int index = getIndex(arr, 3);
        if(index >= 0){
            arr[index] = null;
            printArr(arr);

        }else {
            System.out.println("当前ID不存在,删除失败");
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


    //打印,如果老数组没有满,直接打印老数组,如果老数组已满,就打印新创建的新数组
    public static void printArr(Student[] arr){

        for (int i = 0; i < arr.length; i++) {
            Student student = arr[i];
            if(student != null){
                System.out.println(student.getId()+", " + student.getName() + ", " +student.getAge());
            }

        }
    }


    //老数组已满,创建一个新数组,并比老数组长度多一个,再将老数组全部加入到新数组当中
    public static Student[] creatNewArr(Student[] arr) {
        Student[] newArr = new Student[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];

        }
        return newArr;
    }

    //获取数组当中有多少个已经赋值了
    public static int getCount(Student[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                count++;
            }
        }
        return count;
    }


    //判断id是否唯一
    public static boolean contains(Student[] arr, int id) {
        for (int i = 0; i < arr.length; i++) {
            Student student = arr[i];
            //如果数组没有满,还有空的,就需要判断一下
            if(student != null){
                int sid = student.getId();
                if (sid == id) {
                    return true;
                }
            }

        }
        return false;
    }
}
