package accountpack;
import java.util.*;

public class Savingsaccount implements Calculate{
 
	private int principle,time;
	private float rate;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);

Calculate a=new Savingsaccount();
int p=100;
int r=200;
int z=300;
a.si(p,r,z);}
	
	@Override
	public void si(int p, int r, int t) {
		// TODO Auto-generated method stub
		r=r/100;
		int s=p*t*r;
		System.out.println("si is:"+s);
	}
 
}