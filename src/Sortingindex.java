import java.util.*;
public class Sortingindex {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
        int i;
        for(i=0;i<T;i++)
        {
        	int N = in.nextInt();
           int arr[]= new int[N];
           int K = in.nextInt();
           for(i=0;i<N;i++)
           {
        	   arr[i]=in.nextInt();
           }
            int count=0;
            for(i=0;i<N;i++)
            {
            	if(arr[i]<arr[K-1])
            	{
            		count++;
            	}
            }
            count++;
            System.out.println(count);
           
        }
	}

}
