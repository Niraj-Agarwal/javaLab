import java.util.*;
public class MatrixMul
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows in 1st matrix");
        int row1;
        row1=sc.nextInt();
        System.out.println("Enter number of columns in 1st matrix");
        int col1;
        col1=sc.nextInt();
        System.out.println("Enter number of rows in 2nd matrix");
        int row2;
        row2=sc.nextInt();
        System.out.println("Enter number of columns in 2nd matrix");
        int col2;
        col2=sc.nextInt();
        if(col1!=row2)
        {
            System.out.println("Error");
        }
        else
        {
            int a[][]=new int[row1][col1];
            int b[][]=new int[row2][col2];
            int c[][]=new int[row1][col2];
            System.out.println("Enter elements of 1st matrix");
            for(int i=0;i<row1;i++)
            {
                for(int j=0;j<col1;j++)
                {
                    a[i][j]=sc.nextInt();
                }
            }
            System.out.println("Enter elements of 2nd matrix");    
            for(int i=0;i<row2;i++)
            {
                for(int j=0;j<col2;j++)
                {
                    b[i][j]=sc.nextInt();
                }
            }
            System.out.println("matrix mul is::");
            for(int i=0;i<row1;i++)
            {
                for(int j=0;j<col2;j++)
                {
                    
                
                for(int k=0;k<col1;k++)
                {
                    c[i][j]+=a[i][k] * b[k][j];
                }
                System.out.print(c[i][j]+" ");
                }
                System.out.println(" ");
            }
        }
    }
}
