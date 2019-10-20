import java.util.*;
    class AgeException extends Exception{
        AgeException(){
            System.out.println("under 18 problem");
        }
    }
    class userdefined {
        void func() {
            try {
                int age = 17;
                if (age >= 18) {
                    System.out.println("vote done successfully");
                } else {
                    throw new AgeException();
                }
            } catch (AgeException ae) {
                System.out.println(ae);
            } finally {
                System.out.println("Next voter will come");
            }
        }


    public static void main(String[] args) {
        userdefined obj = new userdefined();
        obj.func();
    }
}
