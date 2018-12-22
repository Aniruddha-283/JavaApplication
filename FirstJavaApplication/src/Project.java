
public class Project {
	public int ProjectId;
	public String ProjectName;
	public String ProjectLocation;
	public Project(int _ProjectId, String _ProjectName, String _ProjectLocation)
	{
		ProjectId = _ProjectId;
		ProjectName = _ProjectName;
		ProjectLocation = _ProjectLocation;
	}
	public void DisplayProjectDetailsForEmployee(Empoyee emp)
	{
		System.out.println("Employee Name -" + emp.EmployeeName);
		System.out.println("Project Name - " + ProjectName);
		System.out.println("Project Location - " + ProjectLocation);
	}
}
