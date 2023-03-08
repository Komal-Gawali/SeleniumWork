package Practice;

import org.bouncycastle.jcajce.provider.symmetric.DSTU7624.CCM128;

public class StatiProg2 extends StaticProg  {

	public void m3() {
		System.out.println("My new prog. " + b);
	}
	
	
	public static void main(String[] args) {
		m1();
		StaticProg s = new StaticProg();
		s.m2();
		s.m1();
	}

}
