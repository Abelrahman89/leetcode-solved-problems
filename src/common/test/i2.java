package common.test;

public interface i2 {
    void m1();

    default void m2(){
        System.out.println("m2 i2");
    }
    default void m3(){
        System.out.println("m2 i2");
    }
}
