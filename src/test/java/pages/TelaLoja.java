package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TelaLoja {
    WebDriver navegador;

    public TelaLoja(WebDriver navegador) {
        this.navegador = navegador;
    }

    public void escolherProduto() throws InterruptedException {
        //FAZER SCROLL E ESCOLHER PRODUTOS
        ((RemoteWebDriver) navegador).executeScript("scrollBy(0,1350)", "");
        navegador.findElement(By.xpath("(//*[@class='body-2 links-purple '])[2]")).click();
        navegador.findElement(By.xpath("(//*[@class='img-responsive'])[5]")).click();
        Thread.sleep(1000);
        WebElement confirmacao = navegador.findElement(By.xpath("//*[text()='Sou humano']"));
        String texto = confirmacao.getText();
        Assert.assertEquals("Sou humano", texto);
        System.out.println("_____________________________________");
        System.out.println("               " + texto);
        System.out.println("_____________________________________");
        //navegador.findElement(By.xpath("//div[@id='checkbox']")).click();
        //navegador.findElement(By.xpath("(//*[@class='btn btn-lg btn-block green-btn light-green-btn add-to-cart-btn btn-pdp-cobranded'])[2]")).click();
        //navegador.findElement(By.xpath("//*[@id='BtnContinueChecout']")).click();
    }
}
