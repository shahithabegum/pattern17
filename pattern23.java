import java.util.*;
class pattern23	
{
     public static void main(String arg[])
    {
        try{
            int n,i,j,k;
            
            Scanner t=new Scanner(System.in);
            System.out.println("Enter n");
            n=t.nextInt();
            for (i = 0; i <= n; i++)
        {
            char alphabet = 'A';
            for (j = n; j > i; j--)
            {
                System.out.print(" ");
            }
            for ( k = 0; k <= i; k++)
            {
                System.out.print(alphabet+ " ");
	 alphabet++;
            }
            
            System.out.println();
              }
           }
   
       catch(Exception e)
	{
	   System.out.println(e);
	 }
       }
}
