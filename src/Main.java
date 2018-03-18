import java.util.Scanner;

public class Main {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		String path = "result.txt";
//		int n=Integer.parseInt(args[0]);
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(n);
		new SetAQuestion(n,path);
		
	}
	

}
