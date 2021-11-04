

public class Staff extends Employee{
String title;


Staff(){
	this.title="";
}
Staff(String name,String officeNumber,double salery,String title){
	super(name, officeNumber, salery);
	this.title=title;
}






public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}



public String toString() {
	String s=super.toString();
	return s+"   "+"Title"+this.title;



}}
