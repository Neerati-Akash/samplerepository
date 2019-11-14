import java.util.*;
class Sumofdigits {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int a,i,sum=0;
		for(i=0;i<n;i++)
		{
		  a=input.nextInt();
		  while(a!=0) {
			  sum=sum+a%10;
			 a=a/10;
		  }
		  System.out.println(""+sum);
		 sum=0;
		}
				

	}

}
