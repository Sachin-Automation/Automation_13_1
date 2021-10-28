package Encapsulation;
class Name{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

public class Encap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Name N1 =new Name();
		System.out.println(N1.getName());
		N1.setName("Sachin");
		System.out.println(N1.getName());

	}

}
