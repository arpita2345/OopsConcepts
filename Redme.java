package OopsConcepts;

public class Redme implements MobilePhone {

	public void Calling() {
		// TODO Auto-generated method stub
		System.out.println("Please use centre button for Calling");
	}

	public void SendSMS() {
		// TODO Auto-generated method stub
		System.out.println("Please use left for Sending SMS");
	}

	public void Mp3player() {
		System.out.println("VLC player is the default media player");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Redme red = new Redme();
		System.out.println("Calling from Redme Class" + red.name);
		red.Calling();
		red.SendSMS();
		red.Mp3player();
	}

}
