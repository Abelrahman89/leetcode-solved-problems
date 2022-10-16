package common.test;

public interface i1 {
    void m1();
    default void m2(){
        System.out.println("m2 i1");
    }

    static void m3(){
        System.out.println("fddfdf");
    }
}
