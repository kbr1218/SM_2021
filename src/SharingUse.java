public class SharingUse implements Sharing{
	//Chapter3 OPP - 3.3 Interface : Lab 3.5-1 (2) SharingUse

	public SharingUse() {
	}
	
	public void sprint() {			//overriding, interface의 implement
		System.out.println("Printing for Interface");
		System.out.print("IT공학전공 1915438 KBR");
	}

}
