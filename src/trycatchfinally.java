public class trycatchfinally {
    void func() {
        try {
            int var1 = 10;
            int var2 = 0;
            int res = var1 / var2;
            System.out.println("try block-----Division:" + res);
        } catch (Exception e) {
            System.out.println("catch block------problem occur");
        }
        finally{
            System.out.println("finally block----no impact");
    }}

    void func2() {
        System.out.println("Second func is working");

    }


    public static void main(String[] args) {
        trycatchfinally obj =new trycatchfinally();
        obj.func();
        obj.func2();

    }
}
