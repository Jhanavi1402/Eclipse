package TNS.B09;

public class ConstructerDemo extends Customer {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer ob = new Customer(2,"manu","bang");
		System.out.println(ob);
		boolean output = ((ob) instanceof Customer);
		System.out.println(output);
	}

}