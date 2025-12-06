public class Patient {
	static String hospitalName;
	String patientName;
	int age ;
	Patient( String Name,  int age){
	this.name=Name;
        this. age=age;
	}
public	void printDetails() {
		System.out.println("hospital Name:" + hospitalName);
		System.out.println("patientName:" +patientName);
		System.out.println("age:" + age);
		System.out.println("__________________");
	}
	public static void main(String[] args) {
		
           patient.hospitalName="City Care Hospital ";
		
	Patient p=new Patient("john Doe",45);
	
		Patient p=new Patient("Emma Watson",30);
	p1.printDetails();
	p2.printDetails();
	

	}

}
