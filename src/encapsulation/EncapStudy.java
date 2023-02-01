package encapsulation;
class Demo{
    private int a = 5;
    private int b = 10;
    private int c = 15;
    private int d = 20;
    public int getA()
    {
        System.out.println("value of A read");
        return this.a;
    }
    public int getB()
    {
        System.out.println("value of B read");
        return this.b;
    }
    public void setA(int a) {
        if (a > 100) {
            this.a = a;
            System.out.println("value of A changed to: "+a);
        }
        else {
            System.out.println("Cannot set - value outside the limits");
        }
    }
    public void setB(int b)
    {
        this.b =b;
    }

    public int getC() {
        return c;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public void setC(int c) {
        this.c = c;
    }
}
public class EncapStudy {
    public static void main(String[] args) {
    Demo d = new Demo();
    System.out.println(d.getA());
    d.setA(100);
    System.out.println(d.getA());
    }
}
