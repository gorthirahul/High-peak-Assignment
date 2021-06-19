import java.util.*;

public class Assignment{
    //This method for finding the minimum value

    static int minDiff(int a[], int N, int M)
    {
        int result = Integer.MAX_VALUE;
        Arrays.sort(a);
        for (int i=0; i<= N-M;i++)
            result = Math.min(result, a[i + M - 1] - a[i]);
        return result;
    }
    //Thkis method for finding the start index in order to print the goodies with minimum values

    static int findEle(int res,int a[], int N, int M)
    {
        int result = Integer.MAX_VALUE;
        for(int i=0; i<=N; i++)
        {
            result = Math.min(result, a[i + M - 1] - a[i]);
            if (res==result)
                return i;
        }
        return 0;
    }

    public static void main(String[] args) {

        int a[]={7980,22349,999,2799,229900,11101,9999,2195,9800,4999};
        String items[]={"Fitbit Plus: 7980","IPods: 22349","MI Band: 999","Cult Pass: 2799", "Macbook Pro: 229900", "Digital Camera: 11101", "Alexa: 9999", "Sandwich Toaster: 2195", "Microwave Oven: 9800", "Scale: 4999" };
        int N = a.length;
        System.out.println("Enter the number of employees");
        Scanner s = new Scanner(System.in);
        int M=s.nextInt();
        int result=minDiff(a, N, M);
        System.out.println("Number of the employees:"+M);
        int startindex=findEle(result,a,N,M);
        System.out.println("Here the goodies that are selected for distribution are:");
        for(int i=startindex;i<startindex+M;i++)
            System.out.println(items[i]);
        System.out.println("\n");
        System.out.println("And the difference between the chosen goodies with highest price and the lowest price is:"+result);
    }
}



