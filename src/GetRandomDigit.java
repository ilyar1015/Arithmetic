
public class GetRandomDigit {
	//0~4随机数
	int oprator(){
		return (int)(Math.random()*4);
	}
	
	//3~5的随机数
	int Time(){
		return (int)(Math.random()*2+3);
	}
	
	//0~100 随机数
	int randomDigit(){
		return (int)(Math.random()*100);
	}
}
