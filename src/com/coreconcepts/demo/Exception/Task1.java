/* *************************************
 * Write a Java Program to validate the full name of an employee. 
 * Create and throw a user defined exception if firstName and lastName is blank.
 * 
 */

package com.coreconcepts.demo.Exception;

public class Task1 {
	
	public static  void checkName(String fname, String lname) throws NameNotFoundException {
        if (fname.isEmpty() &&  lname.isEmpty()) {
           throw new NameNotFoundException("Employee First and last name missing");
       }     else if(fname.isEmpty()){
           throw new NameNotFoundException("Employee First name is missing");
       }
        else  if(lname.isEmpty()){
           throw new NameNotFoundException("Employee Last name is missing");
       }
	}

	public static void main(String []args) {
		Employee emp = new Employee();
		//Employee emp2 = new mployee
		
		emp.setEid(101);
		emp.setFname("");
		emp.setLname("");
		
		try {
			checkName(emp.getFname(),emp.getLname());
			System.out.println("Employee name is : "+ emp.getFname()+emp.getLname());
			
		}catch(NameNotFoundException m) {
			System.out.println(m);
		}
	}
		

}
