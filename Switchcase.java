import java.util.Scanner;
public class Switchcase
{
  public static void main (String []args)
  {
    int choice;
    Scanner sc=new Scanner(System.in);
    System.out.println("Pick 1. Hii \t 2. Hey \t 3. Hello ");
    choice= sc.nextInt();
    switch(choice)
    {
      case 1:
      System.out.println("You said Hii");
      break;
      case 2:
      System.out.println("You said Hey");
      break;
      case 3:
      System.out.println("You said Hello");
      break;
      default:
      System.out.println("Invalid input");
      break;
    }
  }
}
