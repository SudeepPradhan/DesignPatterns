package prototype_pattern;

public class Client {

	public static void main(String[] args) {
		
		Employee superVisor = new Employee();
		superVisor.setId(0);
		superVisor.setFirstname("John");
		superVisor.setLastname("Lennon");
		
		Employee emp = new Employee();
		emp.setId(0);
		emp.setFirstname("Jack");
		emp.setLastname("Carry");
		
		emp.setSupervisor(superVisor);
		
		Employee[] staff = new Employee[1];
		staff[0] = emp;	
		superVisor.setStaff(staff);
		
		Employee empCopy = (Employee) emp.clone();
		
		System.out.println("Id: " + empCopy.getId() + ", Name: " + empCopy.getFirstname() + " "
				+ empCopy.getLastname() + ", SuperVisor FirstName: " + empCopy.getSupervisor().getFirstname());
	}

}
