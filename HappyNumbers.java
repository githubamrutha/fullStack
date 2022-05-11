To find a happy number, it is necessary to choose a natural number greater than 1 and calculate the sum of squares of its digits. This process must be repeated successively, if the calculated sequence ends in 1, it is possible to say that the number submitted to the process is a “happy” number, otherwise, it is considered a “sad” number. The number 203 is a happy number because:

22 + 02 + 32 = 4+0+9 = 13;

12 + 32 = 1+9 = 10;

12 +02 = 1+0 = 1

Number 4, on the other hand, is a sad number because:

42 = 16

12 +62 = 1+36 = 37

32 +72 = 9+49 = 58

52 +82 = 25+64 = 89

82 +92 = 64+81 = 145

12 +42 +52 = 1+16+25 = 42

42 +22 = 16+4 = 20

22 +02 = 4 (returning to the initial number)

Find the amount of happy numbers present in a given sequence.









import java.io.IOException;
import java.io.*;
import java.util.*;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
 
       
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int count=0;
        for(int i=0;i<n;i++)
        {
            int sum=0;
            int r;
            while(a[i]>0)
            {    
               r=a[i]%10;
               sum=sum+r*r;    
               a[i]=a[i]/10;  
            }
            while(sum!=1 && sum!=4)
            {
                a[i]=sum;
                sum=0;
                while(a[i]>0)
                {    
                   r=a[i]%10;
                   sum=sum+r*r;    
                   a[i]=a[i]/10;  
                }
            }
            if(sum==1)
            {
                count=count+1;
            }
            else
            {
                count=count+0;
            }
        }
        System.out.println(count);
    }
 
}
