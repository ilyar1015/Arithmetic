
public class GetRandomDigit {
	//0~4�����
	int oprator(){
		return (int)(Math.random()*4);
	}
	
	//3~5�������
	int Time(){
		return (int)(Math.random()*2+3);
	}
	
	//0~100 �����
	int randomDigit(){
		return (int)(Math.random()*100);
	}
}
