import java.util.Random;

public class GetRandomDigit {
	private Random random;
	public GetRandomDigit(){
		random=new Random();
	}
	
	//1~4随机数
	int oprator(){
		return random.nextInt(4)+1;
	}
	
	//3~5的随机数
	int Time(){
		return random.nextInt(3)+3;
	}
	
	//0~100 随机数
	int randomDigit(){
		return random.nextInt(100);
	}
	
	//
}
