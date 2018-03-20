import java.util.Scanner;

public class Main {
	@SuppressWarnings({ "resource" })
	public static void main(String[] args) {
		String path = "result.txt";
		Scanner sc = null;
		int n = 0;
		System.out.print("请输入你的学号:");
		sc=new Scanner(System.in);
		String schoolNumber=sc.nextLine();
		while(true){
			if(args.length==0){
				System.out.print("请输入所生成的题目的数量(1~1000):");		
				try {
					n=sc.nextInt();	
				} catch (Exception e) {
					System.out.println("请不要输入其他非法字串");
					sc.next();
					continue;
				}
			}else{
				try {
					n=Integer.parseInt(args[0]);
					args=null;
				} catch (Exception e) {
					System.out.println("请不要输入其他非法字串");
					continue;
				}
			}
			if(n<=0||n>=1001){
				System.out.println("题目数量输入有误，请重新输入");
				continue;
			}else{
				break;
			}
		}
		System.out.println("正在生成题目，请稍后......");
		new SetAQuestion(n,path,schoolNumber);
		System.out.println("操作完成");
	}
}
