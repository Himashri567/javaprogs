import java.util.*;
class years
{
  public static void main(String[] args)
  {
    int m,y,d;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the minutes");
    m=sc.nextInt();
    y=m/(365*24*60);
    d=m%(365*24*60);
    System.out.println(y+"years and "+d+"days");
   }
}
