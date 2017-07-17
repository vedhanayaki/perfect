package player;
import java.util.Scanner;
public class PerfectSqr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter the value1:");
Scanner s=new Scanner(System.in);
int a=s.nextInt();
System.out.println("Enter the value2:");
int b=s.nextInt();
int c=0;
c=a*b;
System.out.println(c);
if(c/b==0){
	//||c/a==0)
	//System.out.println(a);
	System.out.println(b);
}

	}

}
