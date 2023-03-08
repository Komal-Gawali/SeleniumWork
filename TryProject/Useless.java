package TryProject;

import java.awt.Component;

import javax.swing.Spring;

import net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForAbstractMethod;

public class Useless {

	public static void main(String[] args) {
	
	int star = 1,  hashL = 2;
	for(int row = 1; row<=5; row++) {
		
		for(int k =1; k<= hashL; k++)
		{
			System.out.print("#");
		}
		for(int i = 1; i<= star; i++) {
			System.out.print("*");
		}
		for(int k =1; k<= hashL; k++)
		{
			System.out.print("#");
		}
		System.out.println();
		if(row<3) {
		star=star+2;
		hashL--;
		}
		else
		{
			star=star-2;
			hashL++;
		}
	  }
	
	}

}
