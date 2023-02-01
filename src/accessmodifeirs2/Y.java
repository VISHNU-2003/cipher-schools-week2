package accessmodifeirs2;
import accessmodifiers1.A;
public class Y {
    public static void main(String[] args) {
        A obj = new A();
    //    System.out.println(obj.e);//default is not accessible outside the package
       // System.out.println(obj.f); private not accessible outside the class
          System.out.println(obj.z);//public is accessible everywhere the object is available
//        System.out.println(obj.w); protected will not be accessible outside package in not subclass
    }
}
