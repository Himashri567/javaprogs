class Prime
{
  private int n;
  Prime(int n)
  {
    this.n=n;
  }
  int isPrime()
  {
    int i;
    for(i=2;i<=n/i;i++)
				if(n%i==0)
				  break;
			if(i>n/i)
			  return 1;
    else
      return 0;
		}
  void display()
  {
    if(isPrime()==1)
      System.out.println(n+"is prime number");
    else
      System.out.println(n+"is not prime number");
  }
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    int a=sc.nextInt();
    Prime ob=new Prime(a);
    ob.display();
  }
}
