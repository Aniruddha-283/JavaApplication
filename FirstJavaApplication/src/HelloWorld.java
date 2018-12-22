
public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		Empoyee emp = new Empoyee(1, "Aniruddha Kumbhar");
		emp.DisplayEmployee();
		Project proj = new Project(1,"Cummins","Pune");
		proj.DisplayProjectDetailsForEmployee(emp);
		Empoyee emp1 = new Empoyee(2, "Ishan Pawar");
		emp1.DisplayEmployee();
	}

}
