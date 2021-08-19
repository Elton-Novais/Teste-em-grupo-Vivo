package stepsDefinidos;

import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Rule;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;

import java.util.concurrent.TimeUnit;

public class StepsDefinidos {
    private WebDriver navegador;

    @Rule
    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sempre IT\\IdeaProjects\\br.com.vivo-GrupoVivo\\driver\\chromedriver.exe");
        navegador = new ChromeDriver();
        navegador.manage().window().maximize();
        navegador.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

    }

    @Dado("que estou no site https://www.vivo.com.br")
    public void queEstouNoSiteHttpsWwwVivoComBrParaVoce() {
        navegador.get("https://www.vivo.com.br");
        //navegador.findElement(By.xpath("(//*[@class='search__results__link'])[1]")).click();
    }

    @E("seleciono Monte seu Combo e preencho meus dados")
    public void selecionoMonteSeuComboEPreenchoMeusDados() {
        TelaHomeCombo telaHomeCombo = new TelaHomeCombo(navegador);
        telaHomeCombo.selecionarMonteCombo();
        TelaHomeCombo telaHomeCombo1 = new TelaHomeCombo(navegador);
        telaHomeCombo1.preencherDadosDisponibilidade();

    }

    @E("monto meu combo")
    public void montoMeuCombo() throws InterruptedException {
        TelaMonteSeuCombo telaMonteSeuCombo = new TelaMonteSeuCombo(navegador);
        telaMonteSeuCombo.montarCombo();

    }

    @E("forneco os dados restantes")
    public void fornecoOsDadosRestantes() throws InterruptedException {
        TelaDadosRestantes telaDadosRestantes = new TelaDadosRestantes(navegador);
        telaDadosRestantes.preencherDados();

    }

    @Entao("valido se botao de finalizar pedido esta clicvel")
    public void validoSeBotaoDeFinalizarPedidoEstaClicvel() {
        TelaValidaCombo telaValidaCombo = new TelaValidaCombo(navegador);
        telaValidaCombo.validarCombo();

    }

    @Quando("clico Produtos e Servicos")
    public void clicoProdutosEServicos() {
        TelaProdutosEServicos telaProdutosEServicos = new TelaProdutosEServicos(navegador);
        telaProdutosEServicos.escolherProduto();

    }

    @E("clico em ver todos na loja e seleciono o produto desejado")
    public void clicoEmVerTodosNaLojaESelecionoOProdutoDesejado() throws InterruptedException {
        TelaLoja telaLoja = new TelaLoja(navegador);
        telaLoja.escolherProduto();

    }

    @E("preencho os dados")
    public void preenchoOsDados() {
        TelaDadosDeCompra telaDadosDeCompra = new TelaDadosDeCompra(navegador);
        telaDadosDeCompra.preencherDadosDeCompra();

    }

    @Entao("valido se o Botao finalizar compra esta habilitado")
    public void validoSeOBotaoFinalizarCompraEstaHabilitado() {
        TelaValidaBTN telaValidaBTN = new TelaValidaBTN(navegador);
        telaValidaBTN.validarBtn();
    }
}