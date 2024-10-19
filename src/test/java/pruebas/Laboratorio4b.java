package pruebas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import paginas.paginaLogin2;

public class Laboratorio4b {
	
	WebDriver driver;
    paginaLogin2 login;

    // URL de la página de login
    String URL = "http://www.automationpractice.pl/index.php?controller=authentication&back=my-account";

    // Ruta al ejecutable de ChromeDriver
    String PATH = "..\\EducaITP\\Drivers\\chromedriver.exe";

    @BeforeSuite
    public void setUp() {
        // Configuración de ChromeDriver y apertura de la página
        System.setProperty("webdriver.chrome.driver", PATH);
        driver = new ChromeDriver();
        driver.get(URL);
        driver.manage().window().maximize();

        // Inicializamos el objeto de la página
        login = new paginaLogin2(driver);
    }

    @AfterSuite
    public void cierreNavegador() {
        // Cerrar el navegador
        driver.quit();
    }

    @Test
    public void irRegistroLogin() {
        // Usamos el objeto de la página para ingresar las credenciales y enviar el formulario
        login.ingresarDatos("test1@gmail.com", "ABCD");

        // Verificamos el texto del título del formulario después del login
        Assert.assertEquals(login.getTextTitleForm(), "AUTHENTICATION");
    }

}
