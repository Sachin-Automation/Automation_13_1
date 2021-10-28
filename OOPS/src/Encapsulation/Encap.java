package Encapsulation;
class Demo{
	private  int EmpId=4000;
	private double salary =25000;
	
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
}

public class Encap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo D1=new Demo();
		
		System.out.println(D1.getEmpId());
		System.out.println(D1.getSalary());
		double updatesalary = D1.getSalary()+5000;
		System.out.println("print updatesalary="+updatesalary);
		System.out.println(D1.getSalary());
		D1.setEmpId(15000);
		D1.setSalary(20000);
		System.out.println(D1.getSalary());
		System.out.println(D1.getEmpId ());
	

	}

}
