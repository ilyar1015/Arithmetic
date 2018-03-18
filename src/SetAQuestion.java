import java.util.ArrayList;

public class SetAQuestion {
	int n;
	int next,time;
	String topic;
	GetRandomDigit grd=null;
	ArrayList<Topic> al;
	Topic question;
	public SetAQuestion(int n,String path){
		this.n=n;
		init();
		setQuestion(time);
		new WriteToFile(path, al, n);
	}
	
	
	public void init(){
		grd=new GetRandomDigit();
		time=grd.Time();
		al=new ArrayList<Topic>();
	}
	
	public void setQuestion(int time){
		//���������
		for(int i=0;i<n;i++){
			int t=0;
			//����ĳ���
			topic="";
			int a=grd.randomDigit();
			topic=topic+a;
			while(t<time){
//				System.out.println("------");
				int b=grd.randomDigit();
				int type=grd.oprator();
				if(type(type,a,b)!=-1){
					a=type(type,a,b);
					topic=topic+getType(type)+b;
					t++;
				}else{
					continue;
				}
			}
			topic=topic+"=";
			question=new Topic(topic, a);
			al.add(question);
		}
	}
	
	String getType(int type){
		if(type==1){
			return "+";
		}else if(type==2){
			return "-";
		}else if(type==3){
			return "��";
		}else{
			return "��";
		}
	}
	
	//�������������������
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
	
	//�жϼ����ͳ˷�
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
