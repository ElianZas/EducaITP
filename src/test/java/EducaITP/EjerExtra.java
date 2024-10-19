package EducaITP;


import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class EjerExtra {

	@Ignore
	public void test() {
        //Precondition
		int a=2;
		int b=3;
		int expectedResults=5;
		//Steps
		int sumaNumeros=a + b;
		//Validation
		System.out.println("================================");
		System.out.println("Resultado Esp.:" + expectedResults);
		System.out.println("Resultado Obtenido:"+ sumaNumeros);
		Assert.assertEquals(expectedResults,sumaNumeros);

	}

	@Test
	public void testOpInvalid() {
		int divNumeros=0;
		try {
			int a=2;
			int b=0;
			divNumeros=a/b ;
			System.out.print("La division es:" + divNumeros);

	    }
		catch(ArithmeticException ex) {
			//System.out.print(ex.getMessage());
			System.out.print("--->ERROR:La división por 0 no es posible"+"\n");
		}
		
		finally {
			
			System.out.println("La operación ha finalizado, liberando recursos...");
			
		}

	}


}
