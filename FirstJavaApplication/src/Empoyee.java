
public class Empoyee {
	public int EmployeeId;
	public String EmployeeName;
	public Empoyee(int EmpId, String EmpName)
	{
		EmployeeId = EmpId;
		EmployeeName = EmpName;
	}
	
	public void DisplayEmployee()
	{
		System.out.println("Employee Id - " + EmployeeId);
		System.out.println("Employee Name - " + EmployeeName);
		
	}
}
