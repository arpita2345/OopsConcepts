package OopsConcepts;

public class Samsung implements MobilePhone {

	public void Calling() {
		// TODO Auto-generated method stub
		System.out.println("Please use left corner button for Calling");
	}

	public void SendSMS() {
		// TODO Auto-generated method stub
		System.out.println("Please use Centre button for Sending SMS");
	}

	public void Camera() {
		// TODO Auto-generated method stub
		System.out.println("Please touch Home button and select Camera");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Samsung sam = new Samsung();
		System.out.println("Calling from Samsung Class" + sam.name);
		sam.Calling();
		sam.SendSMS();
		sam.Camera();

	}

}
