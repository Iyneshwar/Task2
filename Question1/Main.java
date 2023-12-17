
import java.util.Scanner;
public class Main {
   public int age = 18;
   public String name;
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Main first=new Main();
           first.name=scan.nextLine();
        System.out.println( first.name +" "+ first.age);

    }
}
