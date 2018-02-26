package OopsConcepts;

public class Maruti extends Car {

	@Override
	public void Break() {
		// TODO Auto-generated method stub
		System.out.println("Maruti Break");

	}

	@Override
	public void Seat() {
	
		// TODO Auto-generated method stub
		System.out.println("Maruti Seats");

	}

	@Override
	public void Color() {
		// TODO Auto-generated method stub
		System.out.println("Maruti Colors black red White");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maruti obj = new Maruti();
		obj.Break();
		obj.Seat();
		obj.Color();
		obj.Aircondition();

	}

}
