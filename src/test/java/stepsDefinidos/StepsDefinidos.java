package stepsDefinidos;

import Screenshot.GerarData;
import Screenshot.GerarPasta;
import Screenshot.GerarPrint;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class StepsDefinidos {
    private WebDriver navegador;
    private GerarPasta gerarPasta = new GerarPasta();
    private GerarData gerarData = new GerarData();


    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sempre IT\\IdeaProjects\\br.com.vivo-GrupoVivo\\driver\\chromedriver.exe");
        navegador = new ChromeDriver();
        navegador.manage().window().maximize();
        navegador.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Dado("que estou no site https://www.vivo.com.br")
    public void queEstouNoSiteHttpsWwwVivoComBrParaVoce() {
        navegador.get("https://www.vivo.com.br");
        String winHandleBefore = navegador.getWindowHandle();

    }

    @E("seleciono Monte seu Combo e preencho meus dados")
    public void selecionoMonteSeuComboEPreenchoMeusDados() throws InterruptedException, IOException {
        gerarPasta.criarPasta("fluxo1");
        TelaHomeCombo telaHomeCombo = new TelaHomeCombo(navegador);
        telaHomeCombo.selecionarMonteCombo();
        String screenshotArquivo = gerarPasta.getPasta() + "//" + GerarData.dataHoraParaArquivo() + ".png";
        GerarPrint.take(navegador, screenshotArquivo);
        TelaHomeCombo telaHomeCombo1 = new TelaHomeCombo(navegador);
        telaHomeCombo1.preencherDadosDisponibilidade();
        String screenshotArquivo1 = gerarPasta.getPasta() + "//" + GerarData.dataHoraParaArquivo() + ".png";
        GerarPrint.take(navegador, screenshotArquivo1);

    }

    @E("monto meu combo")
    public void montoMeuCombo() throws InterruptedException, IOException {
        TelaMonteSeuCombo telaMonteSeuCombo = new TelaMonteSeuCombo(navegador);
        telaMonteSeuCombo.montarCombo();
        String screenshotArquivo = gerarPasta.getPasta() + "//" + GerarData.dataHoraParaArquivo() + ".png";
        GerarPrint.take(navegador, screenshotArquivo);


    }

    @E("forneco os dados restantes")
    public void fornecoOsDadosRestantes() throws InterruptedException, IOException {
        TelaDadosRestantes telaDadosRestantes = new TelaDadosRestantes(navegador);
        telaDadosRestantes.preencherDados();
        String screenshotArquivo = gerarPasta.getPasta() + "//" + GerarData.dataHoraParaArquivo() + ".png";
        GerarPrint.take(navegador, screenshotArquivo);

    }

    @Entao("valido se botao de finalizar pedido esta clicvel")
    public void validoSeBotaoDeFinalizarPedidoEstaClicvel() throws IOException {
        TelaValidaCombo telaValidaCombo = new TelaValidaCombo(navegador);
        telaValidaCombo.validarCombo();
        String screenshotArquivo = gerarPasta.getPasta() + "//" + GerarData.dataHoraParaArquivo() + ".png";
        GerarPrint.take(navegador, screenshotArquivo);

    }

    @Quando("clico Produtos e Servicos")
    public void clicoProdutosEServicos() throws IOException {
        gerarPasta.criarPasta("fluxo2");
        TelaProdutosEServicos telaProdutosEServicos = new TelaProdutosEServicos(navegador);
        telaProdutosEServicos.escolherProduto();
        String screenshotArquivo = gerarPasta.getPasta() + "//" + GerarData.dataHoraParaArquivo() + ".png";
        GerarPrint.take(navegador, screenshotArquivo);

    }

    @E("clico no icone da Aura e pesquiso por lojas")
    public void clicoNoIconeDaAuraEPesquisoPorLojas() throws InterruptedException, IOException {
        TelaLoja telaLoja = new TelaLoja(navegador);
        telaLoja.falarAura();
        String screenshotArquivo = gerarPasta.getPasta() + "//" + GerarData.dataHoraParaArquivo() + ".png";
        GerarPrint.take(navegador, screenshotArquivo);
        TelaLoja telaLoja1 = new TelaLoja(navegador);
        telaLoja1.procurarLoja();
        String screenshotArquivo1 = gerarPasta.getPasta() + "//" + GerarData.dataHoraParaArquivo() + ".png";
        GerarPrint.take(navegador, screenshotArquivo1);

    }


    @Entao("valido o endereco de destino")
    public void validoOEnderecoDeDestino() throws IOException {
        TelaValidaEndereco telaValidaEndereco = new TelaValidaEndereco(navegador);
        telaValidaEndereco.validarEndereco();
        String screenshotArquivo = gerarPasta.getPasta() + "//" + GerarData.dataHoraParaArquivo() + ".png";
        GerarPrint.take(navegador, screenshotArquivo);
    }

}