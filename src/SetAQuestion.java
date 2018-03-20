import java.util.ArrayList;

public class SetAQuestion {
	int n;
	int next,time;
	String topic;
	GetRandomDigit grd=null;
	ArrayList<Topic> al;
	Topic question;
	ArithmeticResult ar;
	public SetAQuestion(int n,String path,String schoolNumber){
		this.n=n;
		init();
		setQuestion();
		new WriteToFile(path, al, n,schoolNumber);
	}
	
	
	public void init(){
		grd=new GetRandomDigit();
		al=new ArrayList<Topic>();
		ar=new ArithmeticResult();
	}
	
	public void setQuestion(){
		//出题的数量
		int[] questionTopic;;
		int[] questionOprator;
		for(int i=0;i<n;i++){
			//出题的长度
			time=grd.Time();
			questionTopic=new int[time];
			questionOprator=new int[time-1];
			for(int t=0;t<time;t++){
				questionTopic[t]=grd.randomDigit();
				if(t<time-1){
					questionOprator[t]=grd.oprator();
				}
			}
			topic="";
			for(int t=0;t<time;t++){
				topic=topic+questionTopic[t];
				if(t<time-1){
					topic=topic+getType(questionOprator[t]);
				}
			}
			topic=topic+"=";
			System.out.println(topic);
			double a=ar.Result(topic);
			if(a<0||a%1!=0){
				i--;
				continue;
			}
			question=new Topic(topic,(int)a);
			al.add(question);
		}
	}
	
	String getType(int type){
		if(type==1){
			return "+";
		}else if(type==2){
			return "-";
		}else if(type==3){
			return "×";
		}else{
			return "÷";
		}
	}
	
	//解析运算符，并给出答案
	int type(int type,int a,int b){
		if(type==1){
			return a+b;
		}else if(type==2){
			if(judge(type,a,b)){
				return a-b;
			}else{
				return -1;
			}
		}else if(type==3){
			return a*b;
		}else{
			if(judge(type,a,b)){
				return a/b;
			}else{
				return -1;
			}
		}
	}
	
	//判断减法和乘法
	boolean judge(int type,int a,int b){
		if(type==2){
			if(a-b>0){
				return true;
			}else{
				return false;
			}
		}else{
			if(b!=0){
				if(a%b==0){
					return true;
				}else{
					return false;
				}
			}else{
				return false;
			}
		}

	}
}
