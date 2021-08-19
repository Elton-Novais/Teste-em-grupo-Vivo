package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TelaLoja {
    WebDriver navegador;

    public TelaLoja(WebDriver navegador) {
        this.navegador = navegador;
    }

    public void falarAura() throws InterruptedException {
//        //FAZER SCROLL E ESCOLHER PRODUTOS
//        ((RemoteWebDriver) navegador).executeScript("scrollBy(0,1350)", "");
//        navegador.findElement(By.xpath("(//*[@class='body-2 links-purple '])[2]")).click();
//        navegador.findElement(By.xpath("(//*[@class='img-responsive'])[5]")).click();
//        Thread.sleep(1000);
//        WebElement confirmacao = navegador.findElement(By.xpath("//*[text()='Sou humano']"));
//        String texto = confirmacao.getText();
//        Assert.assertEquals("Sou humano", texto);
//        System.out.println("_____________________________________");
//        System.out.println("               " + texto);
//        System.out.println("_____________________________________");
//        //navegador.findElement(By.xpath("//div[@id='checkbox']")).click();
//        //navegador.findElement(By.xpath("(//*[@class='btn btn-lg btn-block green-btn light-green-btn add-to-cart-btn btn-pdp-cobranded'])[2]")).click();
//        //navegador.findElement(By.xpath("//*[@id='BtnContinueChecout']")).click();


        //CLICAR PRA FALAR COM A AURA
        navegador.findElement(By.xpath("//*[@id='launch_button']")).click();
        navegador.findElement(By.xpath("//*[@id='btnComecar']")).click();
        //CLICAR NO CAMPO, PREENCHER E CLICAR EM PROCURAR
        navegador.findElement(By.xpath("//*[@id='chatSend']")).sendKeys("Encontre uma loja");
        navegador.findElement(By.xpath("//*[@id='fab_send']")).click();
        //CLICAR LOCALIZAR LOJA
        navegador.findElement(By.xpath("//*[@href='http://vivo.tl/lojasvivo']")).click();

        //navegador.findElement(By.xpath("//*[@class='new_tab-modal__content__box__button--accept btn-purple']")).click();
        //navegador.findElement(By.xpath("(//*[@class='tactile-searchbox-input'])[2]")).click();
    }

    public void procurarLoja() {
        //INSERIR CEP
        for (String winHandle : navegador.getWindowHandles()) {
            navegador.switchTo().window(winHandle);
        }
        navegador.findElement(By.xpath("//input[@name='search']")).sendKeys("04551000");
        navegador.findElement(By.xpath("//*[@class='map__result-list--focus']")).click();
        //CLICAR ENDEREÇO LOJA
        navegador.findElement(By.xpath("(//h4[@class='body black'])[1]")).click();
        navegador.findElement(By.xpath("//*[@class='button__transparent button__strong']")).click();

    }
}
