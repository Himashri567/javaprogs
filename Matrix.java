import java.util.*;
public class Matrix
{
  public static void main (String []args)
  {
    Scanner sc= new Scanner(System.in);
    int n,i,j;
    System.out.println("Enter the size of the array");
    n=sc.nextInt();
    int a[][]=new int[n][n];
    int b[][]=new int[n][n];
    int c[][]=new int[n][n];
    int d[][]=new int[n][n];
    System.out.println("Enter the elements in a[][]");
    for(i=0;i<n;i++)
      for(j=0;j<n;j++)
         a[i][j]=sc.nextInt();
    System.out.println("Enter the elements in b[][]");
    for(i=0;i<n;i++)
      for(j=0;j<n;j++)
         b[i][j]=sc.nextInt();
    for(i=0;i<n;i++)
      for(j=0;j<n;j++)
      {
         c[i][j]= a[i][j]+b[i][j];
         d[i][j]= a[i][j]*b[i][j];
      }
    System.out.println("The resultant matrix after addition is:");
    for(i=0;i<n;i++)
    {
      for(j=0;j<n;j++)
      System.out.print(c[i][j]);
     System.out.println();
     }
    System.out.println("The resultant matrix after multiplication is:");
    for(i=0;i<n;i++)
    {
      for(j=0;j<n;j++)
      System.out.print(d[i][j]);
     System.out.println();
     }
   }
}
