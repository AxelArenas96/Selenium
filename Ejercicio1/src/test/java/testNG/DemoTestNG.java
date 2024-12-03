package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class DemoTestNG {
	
	@BeforeClass
	public void setup() {
		System.out.println("Aqui va la configuracion previa a las ejecuciones");
	}

	@Test(priority = 1)
	public void test1() {
		System.out.println("Hola soy test 1");
		int a = 10;
		int b = 10;
		if(a == b) {
			System.out.println("Los números son iguaes");
			}else {
				Assert.fail("Los números no son iguales");				
			}
	}

	@Test(priority = 2, dependsOnMethods = "test1")
	public void test2() {
		System.out.println("Hola soy test 2");
	}

	@AfterMethod
	public void afeter() {
		System.out.println("Terminaste de ejecutar un test");
	}
	
	@AfterClass
	public void tearDown() {
		System.out.println("Cerrar el driver");
	}

}
