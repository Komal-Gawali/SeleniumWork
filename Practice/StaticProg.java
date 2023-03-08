package Practice;

public class StaticProg {

	public  static int b = 12 ;
	
	public  StaticProg() {
//		  return name = "komal";   unable to return the constructor.  if we are going to 
//        return in constructor this is no more constructor it became method
	}
	
	public static void  m1() {
		
		System.out.println("This is static method. " + b);
	}
	public void m2() {
		
		
		System.out.println("This is non static method." + b);
	}
	public static void main(String[] args) {
		m1();
		StaticProg a = new StaticProg();
		a.m2();
	}

}
