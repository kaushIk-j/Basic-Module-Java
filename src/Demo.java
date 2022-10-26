import com.coreconcepts.demo.Departments;
import com.coreconcepts.demo.Employee;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

        System.out.println("Hello World!!!");

       

        Employee emp=new Employee();
        emp.getDetails(101, "Geeta",Departments.IT);

        System.out.println(emp.getEdeptName().getTotalEmps());
        emp.display();
    }


}
