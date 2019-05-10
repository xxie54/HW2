import java.util.*;

public class Palindrome 
{

    public static void main(String[] args) 
    {

    	Scanner sc=new Scanner(System.in);
    	
    	System.out.println("Enter your step ");
    	int n=sc.nextInt();
    	

        for (int i = 1; i <= n&&i<=7; i++) 
        {
            for (int j = n; j > i; j--) 
            {
                System.out.print(" ");
            }
            for (int m = 1; m <=i; m++) 
            {
                System.out.print(m);
            }
            
            for(int m=i-1;m>=1;m--)
            {
            	System.out.print(m);
            }

            System.out.print("\n");
        }

        
      
    }
}

