package OopsConcepts;

public class Hyndai extends Car {

	

		@Override
		public void Break() {
			// TODO Auto-generated method stub
			System.out.println("HYndai Break");

		}

		@Override
		public void Seat() {
		
			// TODO Auto-generated method stub
			System.out.println("Hyndai Seats");

		}

		@Override
		public void Color() {
			// TODO Auto-generated method stub
			System.out.println("Hyundai Colors black red White grey blue");

		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Hyndai obj = new Hyndai();
			
			obj.Break();
			obj.Seat();
			obj.Color();
			obj.Aircondition();

		}

	

}