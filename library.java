import java.util.Scanner;

public class library {
 public static  void main(String[] args){
     System.out.println("wellcome to Central library retrun book process\n here if you are late for due date you pay 10 ruppes per day");
     Scanner sc =new Scanner(System.in);
     System.out.println(" enter the  date when you take book for the library");
     int bringsDate=sc.nextInt();
     System.out.println("please enter your retrun date ");
     int retrunDate= sc.nextInt();
     if (bringsDate == retrunDate){
         System.out.println(" thank for retrun book in time");
     } else if (bringsDate > retrunDate) {
         System.out.println(" your membership is cencel due to late retrun");

     } else if  (retrunDate >30) {
         System.out.println(" you pay 300 hundred");

     }else {
         System.out.println("thank you");
     }

 }
}
