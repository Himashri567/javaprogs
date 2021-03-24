import java.util.*;
public class Matrix
{
  public static void main (String []args)
  {
    Scanner sc= new Scanner(System.in);
    int i,j;
    int a[][]=new int[3][3];
    int b[][]=new int[3][3];
    int c[][]=new int[3][3];
    int d[][]=new int[3][3];
    int e[][]=new int[3][3];
    int f[][]=new int[3][3];
    int g[][]=new int[3][3];
    System.out.println("Enter the elements in a[][]");
    for(i=0;i<3;i++)
      for(j=0;j<3;j++)
         a[i][j]=sc.nextInt();
    System.out.println("Enter the elements in b[][]");
    for(i=0;i<3;i++)
      for(j=0;j<3;j++)
         b[i][j]=sc.nextInt();
    for(i=0;i<3;i++)
      for(j=0;j<3;j++)
      {
         c[i][j]= a[i][j]+b[i][j];
      }
  for(i=0;i<3;i++)
    {
      for(j=0;j<3;j++)
      System.out.print(a[i][j]+" ");
     System.out.println();
     }
  System.out.println();
  for(i=0;i<3;i++)
    {
      for(j=0;j<3;j++)
      System.out.print(b[i][j]+" ");
     System.out.println();
     }
    System.out.println("The resultant matrix after addition is:");
    for(i=0;i<3;i++)
    {
      for(j=0;j<3;j++)
      System.out.print(c[i][j]+" ");
     System.out.println();
     }
    for(i=0;i<3;i++)
    {
      for(j=0;j<3;j++)
      {
	d[i][j]=a[i][0]*b[0][j];
	e[i][j]=a[i][1]*b[1][j];
	f[i][j]=a[i][2]*b[2][j];
	g[i][j]=d[i][j]+e[i][j]+f[i][j];
      }
    }
    for(i=0;i<3;i++)
    {
      for(j=0;j<3;j++)
      {
	g[i][j]=d[i][j]+e[i][j]+f[i][j];
      }
    }
    System.out.println("The resultant matrix after multiplication is:");
    for(i=0;i<3;i++)
    {
      for(j=0;j<3;j++)
      System.out.print(g[i][j]+" ");
     System.out.println();
     }
   }
}
