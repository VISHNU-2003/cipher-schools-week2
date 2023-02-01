package accessmodifiers2;
import accessmodifiers1.A;
//seperate package in a subclasss
public class X extends A {
    public static void main(String[] args) {
        A obj = new A();
        X childobj = new X();
//        System.out.println(obj.e);//default is not accessible outside the package
        System.out.println(obj.z);//public is accessible everywhere the object is available
        System.out.println(childobj.w);//protected will be visible in different package in subclass, using object of subclass only we can't access using the object class

    }
}
