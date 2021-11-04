

public class Faculty extends Employee {
String rank;


Faculty(){
	super();
	this.rank="";
}

Faculty(String name,String officeNumber,double salery,String rank){
	super(name,officeNumber,salery);
	this.rank=rank;
}







public String getRank() {
	return rank;
}

public void setRank(String rank) {
	this.rank = rank;
}





public String toString() {
	String s=super.toString();
	return s+","+"Rank:"+this.rank;

}}
