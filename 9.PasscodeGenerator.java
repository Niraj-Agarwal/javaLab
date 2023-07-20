import java.util.*;
public class passcodeGenerator{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        String s;
        int sum=0;
        System.out.println("enter the name");
        s=sc.nextLine();
        System.out.println("roomNo::");
        int room=sc.nextInt();
        System.out.println("enter the number");
        int number=sc.nextInt();
        int room1=room;
        char ch[]={'!','@','#','^'};
        while(room!=0)
        {
            while(room!=0)
            {
                int temp=room%10;
                sum=sum+temp;
                room=room/10;
            }
            if(sum>=10)
            {
                room=sum;
                sum=0;
            }
        }
        int c=room1/100;
        int len=s.length();
        System.out.print("\nPassowrd is ");
        System.out.println(""+s.charAt(0)+sum+(number%10)+ch[c]+s.charAt(len-1));
       
    }
}
