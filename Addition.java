import java.util.Scanner;  
public class Addition
{
	public static void main(String[] args) {
	Scanner y= new Scanner(System.in);
	int n1=	y.nextInt();
	int n2=y.nextInt();
	System.out.println(add(n1,n2));
	
	}

public static int add(int n1, int n2)
{
	int s=n1+n2;
	return s;
}
}

