import java.util.*;
public class trycatch {
    void func() {
        try {
            int var1 = 10;
            int var2 = 0;
            int res = var1 / var2;
            System.out.println("Division:" + res);
        } catch (Exception e) {
            //System.out.println("Problem occur");
            //System.out.println(e);
            System.out.println(e.getMessage());
        }
    }

    void func2() {
        System.out.println("Second func is working");

    }


    public static void main(String[] args) {
        trycatch obj =new trycatch();
        obj.func();
        obj.func2();

    }
}