package OopsConcepts;

public class Maths extends Teacher {
	void does(){
		//super.does();
	System.out.println("Teaching Maths");
	}
	public Maths(){
		System.out.println("Math Class Constructor");
	}
	{
		System.out.println("Instance Initializer");
	}
	public void Integration() {
		System.out.println("Integration function in maths class");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maths m =  new Maths();
		m.does();
		Teacher t = new Maths();
		t.does();
		//((Object) t).integration();

	}

}
