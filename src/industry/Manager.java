package industry;

public class Manager implements Employees {
	
	private int id;
	private String name;
	private int salary;
	
	public Manager(int id,String name,int salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	public void setSalary(int sal) {
		this.salary=sal;
	}
	
	public int getSalary() {
		return this.salary;
	}
	
	public void print() {
		System.out.print("ID: "+this.id+","+"Name: "+this.name+","+"Salary: "+this.salary);
		System.out.println();
	}

}
