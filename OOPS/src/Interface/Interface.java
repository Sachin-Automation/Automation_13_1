package Interface;

interface RBI1 {
	float rateOfinterest(); // by default public and Abstract
}

class SBI1 implements RBI1 {
	public float rateOfinterest() {
		return 9.15f;

	}
}

class PNB1 implements RBI1 {
	public float rateOfinterest() {
		return 6.5f;

	}
}

public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBI1 R1 = new SBI1();
		System.out.println("SBI ROI:" + R1.rateOfinterest());
		
		PNB1 P1 = new PNB1();
		System.out.println("SBI ROI:" + P1.rateOfinterest());

		RBI1 V1 = new PNB1();
		System.out.println("SBI ROI:" + P1.rateOfinterest());

	}

}
