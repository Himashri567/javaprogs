import java.util.*;
class Employee
{ 
  String name, address;
  int yoj;// year of joining
  public static void main (String args [])
  { 
   Scanner sc=new Scanner(System.in);
   Employee obj = new Employee();
   for(int i=1;i<=3;i++)
    {
      obj.input();
      obj.display(i);
    }
   }
  void input()
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter name, address and year of joining");
    name= sc.nextLine();
    address=sc.nextLine();
    yoj=sc.nextInt();
  }
  void display (int k)
  {
    System.out.println("NAME  YEAR OF JOINING  ADDRESS");
    System.out.println(k+"  "+name+"  "+address+"  "+yoj);
  }
}
