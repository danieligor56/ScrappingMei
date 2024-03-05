package util;

import java.util.Collections;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class ScrappingData {

	public static void main(String[] args) {
		scDate();

	}

	private static void scDate() {
		System.setProperty("webdriver.edge.driver", "src/main/resources/msedgedriver.exe");

		EdgeOptions options = new EdgeOptions();

		// CORRIGIR ERROS OU FALHAS NA EXECUÇÃO
		options.addArguments("--no-sandbox");
		options.addArguments("--disable-dev-shm-usage");
 
		// EVITAR SE DETECTADO COMO BOT
		options.addArguments("--disable-blink-features=AutomationControlled");
		options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
		options.setExperimentalOption("useAutomationExtension", null);
		
		//DEFINIR TAMANHO DA JANELA:
		options.addArguments("window-size=800,600");
		options.addArguments("user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/74.0.3729.169 Safari/537.36");
		
		WebDriver driver = new EdgeDriver(options = options);
		
		driver.get("https://www.consultaaparelhoimpedido.com.br/public-web/welcome");

	}

}
