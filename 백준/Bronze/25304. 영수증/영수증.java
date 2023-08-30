import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		int total=sc.nextInt();
		int num=sc.nextInt();
		int sum=0;
		
		int a;
		int b;
		
		for(int i=0;i<num;i++) {
			a=sc.nextInt();
			b=sc.nextInt();
			sum+=a*b;
		}
		
		if(sum==total)
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}