import java.util.Arrays;
import java.util.Scanner;

public class negativeelement {
    public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
            System.out.println("enter size of array");
            int m=s.nextInt();
            int[]a=new int[m];
            int [] newa1=new int[a.length];
        int j=0;
        for(int i=0;i<a.length;i++)
        {
            a[i]=s.nextInt();
        }

        for(int i=0;i<a.length;i++)
        {
            if(a[i]<0)
            {
                newa1[j]=a[i];
                j++;
            }
        }
        for(int i=0;i<a.length;i++) {
            if (a[i] > 0) {
                newa1[j] = a[i];
                j++;
            }

            System.out.print(" "+ newa1[i]);
        }

    }
}
