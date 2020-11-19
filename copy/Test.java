package copy;

public class Test {

	public static void main(String[] args) {
        
	Address a=new Address();
	a.setCity("HN");
	Person s=new Person();
	s.setAddress(a);
	
	Person s2= new Person(s);
	System.out.println(s2.getAddress().getCity());
	
	
	
	
	////sau khi thay doi thanh pho
	
	a.setCity("dddđ");
	System.out.println(s2.getAddress().getCity());
       
	}

}
