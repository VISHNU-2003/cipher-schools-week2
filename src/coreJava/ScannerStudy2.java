package coreJava;
import java.sql.SQLOutput;
import java.util.Scanner;
public class ScannerStudy2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your First Nme: ");
        String firstName = sc.nextLine(); //It will take input till a space occurs
        System.out.println("Please enter your Last Name: ");
        String lastName = sc.nextLine();
        System.out.println("Please enter yor profession: ");
        String profession= sc.nextLine();
        System.out.println("Please enter your profession: ");
        String address = sc.nextLine();
        System.out.println("Please enter your house number: ");
        int number = Integer.parseInt(sc.nextLine());
        System.out.println("Please enter your average percentage: ");
        float percentage = Float.parseFloat(sc.nextLine());

        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Profession: " + profession);
        System.out.println("Address: " + address);
        System.out.println("House Number: " + number);
        System.out.println("Percentage " + percentage);

        //whenever we need to take mixed input like:
       // 1.Number and strings both  are there
        //2. words from a single line then complete next line or something like that
        // -> use nextLine and parse the data
        sc.close();
    }

}
