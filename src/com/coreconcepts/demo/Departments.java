package com.coreconcepts.demo;

public enum Departments {
	
	 IT(15),Payroll(12),Production(50),Sales(20),QA(10),HR(5);

    int totalEmps;
    Departments(int tE)
    {
        totalEmps=tE;
    }
    public int getTotalEmps()
    {
        return totalEmps;
    }

}
