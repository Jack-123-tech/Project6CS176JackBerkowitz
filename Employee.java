
public class Employee extends Person {

	String officeNumber;
	double salery;
	Employee(){
		super();
		this.officeNumber="";
		this.salery=0;
	}
Employee(String name,String officeNumber,double salery){
	super(name);
	this.officeNumber=officeNumber;
	this.salery=salery;
}
	
	
	public String getOfficeNumber() {
		return officeNumber;
	}
	public void setOfficeNumber(String officeNumber) {
		this.officeNumber = officeNumber;
	}
	public double getSalery() {
		return salery;
	}
	public void setSalery(double salery) {
		this.salery = salery;
	}
	
	
	public String toString() {
		String s=super.toString();
		return s+"   "+"OfficeNumber:"+this.officeNumber+"    "+
				"Salery:"+this.salery;
	
	
	}
	
	
	
	
	
	
	
	
	
}
