package accountpack;
import java.util.*;

public class BankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int accno;
       int costumerid;
       int saving;
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the account no");
       accno=sc.nextInt();
       System.out.println("enter the costumer's unique id");
       costumerid=sc.nextInt();
       System.out.println("enter the amount of savings");
       saving=sc.nextInt();
       System.out.println("the informatio about acc is");
       System.out.println(""+accno);
       System.out.println(""+costumerid);
       System.out.println(""+saving);
	}

}
