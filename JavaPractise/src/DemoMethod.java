
public class DemoMethod {
	int a=20;
	int b=30;
	static int c;
	
	public void add() {
		c=a+b;
		System.out.println(c);
		
	}
	
	public static void multiplication() {
		DemoMethod obj=new DemoMethod();
		c=obj.a*obj.b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		
		DemoMethod obj=new DemoMethod();
		obj.add();  // obj - Non static methods
		DemoMethod.multiplication(); // class - static methods
		System.out.println(c);
		

	}

}
