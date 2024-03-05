package br.com.consultar.aparelho.impedido.ConsultarAparelhoImpedido;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.test.context.SpringBootTest;


class ConsultarAparelhoImpedidoApplicationTests {
@Test
	public void pesquisarGoogle() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Daniel Igor\\Documents\\workspace-spring-tool-suite-4-4.21.0.RELEASE\\ConsultarAparelhoImpedido\\src\\main\\java\\br\\com\\consultar\\aparelho\\impedido\\ConsultarAparelhoImpedido\\Driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver navegar = new ChromeDriver();

		navegar.get("https://www.consultaaparelhoimpedido.com.br/public-web/home?cid=1300135");
	}

}
