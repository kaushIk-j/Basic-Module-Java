package com.coreconcepts.demo;


public class Employee {
private int eid;
private String ename;
private Departments edeptName;
 
public Departments getEdeptName()
{
    return edeptName;
}
 
//Employee emp1=new Employee(); // eid=0,ename=null,edeptName=null;
//emp1.getDetails(101,"Ronit",Departments.IT);
 
public void getDetails(int eid, String ename,Departments edeptName)
{
    this.eid=eid;
    this.ename=ename;
    this.edeptName=edeptName;
}
public void setEid(int eid)
{
    this.eid=eid;
}
public void display()
{
    System.out.println(eid+"\t"+ename+"\t"+edeptName);
}
}