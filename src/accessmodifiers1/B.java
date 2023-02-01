package accessmodifiers1;
public class B {
    public static void main(String[] args) {
        A obj = new A();
        System.out.println(obj.e);//default is accessible in same package
//        System.out.println(obj.f);//private not accessible outside the class
        System.out.println(obj.z);//public is accessible everywhere the object is available
        System.out.println(obj.w);

    }
}
