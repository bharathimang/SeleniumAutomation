
public class Automation {
	static int a=0;
	static int b=20;
	public void uft() {
		System.out.println("This is UFT");
		int age=20;
	}
	
	public void qtp() {
		System.out.println("This is QTP");
	}
	
	public void selenium() {
		System.out.println("This is Selenium");
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		System.out.println("This is main");
		Automation obj=new Automation();
		obj.uft();
		obj.qtp();
		obj.selenium();
		
		System.out.println(Automation.a);
		System.out.println(b);
	}

}
