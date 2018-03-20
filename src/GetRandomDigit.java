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
	
	//产生随机数，让其20概率
	int probabilityQuestion(){
		return random.nextInt(200);
	}
	
	//产生括号的随机数
	int BracketsIndex(int time){
		return random.nextInt(time-2);
	}
}
