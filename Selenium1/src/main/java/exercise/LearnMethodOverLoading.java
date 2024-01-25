package exercise;

public class LearnMethodOverLoading {
	public void add(int a,int b) {
		int sum=a+b;
		System.out.println(sum);
	}
	public void add(int a,int b,int c) {
		int res=a+b+c;
		System.out.println(res);
	}
	public void mul(double a,double b)
	{
		double multi1=a*b;
		System.out.println(multi1);
	}
	public void mul(int a,double b)
	{
		double multi2=a*b;
		System.out.println(multi2);
	}
	public static void main(String[] args) {
		LearnMethodOverLoading obj =new LearnMethodOverLoading();
		obj.add(0, 0);
		obj.add(0, 0, 0);
		obj.mul(0, 0);
		obj.mul(0, 0);
		
	}
	

}
