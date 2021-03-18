package package02;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Huangyt
 * @version 1.0
 * @date 2020/12/19 16:57
 */
public class Test01 extends A implements Cloneable{
    public static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


    public Test01(String name){
        //子类初始化的同时，父类也要初始化
        super(name);
    }

    public static void main(String[] args) {
        Object o = new Object();
        System.out.println(o.hashCode());
        System.out.println("wdwdawd");
        System.out.println("...");
        System.out.println("全都要！");
    }


}

class A{
    String name;

    public A(String name) {
        this.name = name;
    }

    public final void method1(){
        System.out.println("把你泉山了！");
    }
}
