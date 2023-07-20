import java.util.*;
public class pattern{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enther the levels");
        int levels=sc.nextInt();
        for(int row=1;row<levels+1;row++)
        {
            for(int spaces=row;spaces<levels+1;spaces++)
            {
                System.out.print("  ");
            }
            for(int col=row;col<=2*row-1;col++)
            {
                System.out.print(col+" ");
            }
            for(int k=2*row-2;k>=row;k--)
            {
                System.out.print(k+" ");
            }
            System.out.println(" ");
        }
        
        
    }
}
