

public class TestPersons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person pete = new Person();            
		pete.setName("Pete");           
		System.out.println(pete + "\n");   
		Student stan = new Student();        
		stan.setName("Stan");          
		stan.setYear(Student.SUPERSENIOR);     
		System.out.println(stan );
		
		
		
		
		Employee anne = new Employee();         
		anne.setName("Anne");            
		anne.setOfficeNumber("E153");      
		anne.setSalery(50000);            
		System.out.println(anne + "\n");      
		Faculty coddington = new Faculty();    
		coddington.setName("Codd");            
		coddington.setRank("Associate");        
		coddington.setOfficeNumber("BH202");     
		coddington.setSalery(70000);         
		System.out.println(coddington + "\n");   
		Staff starr = new Staff();            
		starr.setName("Starr");         
		starr.setTitle("Grounds Keeper");    
		starr.setOfficeNumber("SH102");        
		starr.setSalery(40000);            
		System.out.println(starr);
	}
	
	

}
