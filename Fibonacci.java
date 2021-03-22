import java.util.*;
class Fibonacci
{
  int n;
  Fibonacci(int n)
  {
    this.n=n;
  }
  int fibo(int a,int b)
  {
    int c=a+b;
    System.out.println(c+" ");
    if(c==n)
      return c;
    else
      return(fibo(b,c));
  }
  public static void main(String args[])
  {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the ending limit of the series");
    int x=sc.nextInt();
    int y=0,z=1;
    Fibonacci ob=new Fibonacci(x);
    System.out.println(y+" "+z);
    x=ob.fibo(y,z);
     System.out.println(x+" ");
  }
}
