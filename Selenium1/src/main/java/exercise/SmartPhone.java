package exercise;

public class SmartPhone extends AndroidPhone {

	public void takeVideo() {
		
		System.out.println("SmartPhone");
	}
	public static void main(String[] args) {
		AndroidPhone obj =new SmartPhone();
		obj.takeVideo();
		
	}
}
