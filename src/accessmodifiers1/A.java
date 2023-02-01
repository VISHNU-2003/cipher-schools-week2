package accessmodifiers1;

import java.net.StandardSocketOptions;

public class A {
    int e = 10;
    private int f = 15;
    public int z = 20;
    protected int w =25;

    public static void main(String[] args) {
        A obj = new A();
        System.out.println(obj.e);
        System.out.println(obj.f);
        System.out.println(obj.z);
        System.out.println(obj.w);
    }
}
