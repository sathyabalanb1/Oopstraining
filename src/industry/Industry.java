package industry;

import java.util.ArrayList;
import java.util.List;

public class Industry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Engineer e1 = new Engineer(21,"sathyabalan",40000);
		Engineer e2 = new Engineer(22,"monisha",50000);
		Engineer e3 = new Engineer(23,"srimathi",35000);
		
		Manager m1 = new Manager(101,"reshma",70000);
		Manager m2 = new Manager(102,"kavinila",80000);
		Manager m3 = new Manager(103,"stella",50000);
		
		int engSalary;
		engSalary = e2.getSalary();
		System.out.println(engSalary);
		
		int manSalary;
		manSalary = m2.getSalary();
		System.out.println(manSalary);
		
		List<Employees>emps = new ArrayList<>();
		
		emps.add(e1);
		emps.add(e2);
		emps.add(e3);
		emps.add(m1);
		emps.add(m2);
		emps.add(m3);
		
		int total;
		total=totalSalary(emps);
		System.out.println(total);
		
		Employees topSalaryEmployee;
		topSalaryEmployee=highestSalary(emps);
		topSalaryEmployee.print();

	}
	
	public static int totalSalary (List<Employees>emps) {
		int i=0,sum=0;
		
		while(i<emps.size()) {
			sum=sum+emps.get(i).getSalary();
			i++;
		}
		
		return sum;
	}
	
	public static Employees highestSalary(List<Employees>emps) {
		int i=0,maxSalary=Integer.MIN_VALUE;
		
		Employees maxSalaryEmployee=null;
		
		while(i<emps.size()) {
			if(emps.get(i).getSalary()>maxSalary) {
				maxSalary=emps.get(i).getSalary();
				maxSalaryEmployee=emps.get(i);
			}
			i++;
		}
		
		return maxSalaryEmployee;
	}

}
