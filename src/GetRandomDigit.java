
public class GetRandomDigit {
	//0~4�����
	int oprator(){
		return (int)(Math.random()*5+1-0.0001);
	}
	
	//3~5�������
	int Time(){
		return (int)(Math.random()*2+3.5);
	}
	
	//0~100 �����
	int randomDigit(){
		return (int)(Math.random()*100);
	}
}
