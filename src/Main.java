import java.util.Scanner;

public class Main {
	@SuppressWarnings({ "resource" })
	public static void main(String[] args) {
		String path = "result.txt";
		Scanner sc = null;
		int n = 0;
		System.out.print("���������ѧ��:");
		sc=new Scanner(System.in);
		String schoolNumber=sc.nextLine();
		while(true){
			if(args.length==0){
				System.out.print("�����������ɵ���Ŀ������(1~1000):");		
				try {
					n=sc.nextInt();	
				} catch (Exception e) {
					System.out.println("�벻Ҫ���������Ƿ��ִ�");
					sc.next();
					continue;
				}
			}else{
				try {
					n=Integer.parseInt(args[0]);
					args=null;
				} catch (Exception e) {
					System.out.println("�벻Ҫ���������Ƿ��ִ�");
					continue;
				}
			}
			if(n<=0||n>=1001){
				System.out.println("��Ŀ����������������������");
				continue;
			}else{
				break;
			}
		}
		System.out.println("����������Ŀ�����Ժ�......");
		new SetAQuestion(n,path,schoolNumber);
		System.out.println("�������");
	}
}
