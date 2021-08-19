# language: pt

  Funcionalidade: Entrar no site da Vivo e contratar serviços
    Como cliente
    Desejo entrar no site da vivo
    Montar meu pacote de dados e contratar serviços de celular

  Contexto:
    Dado que estou no site https://www.vivo.com.br

  Cenario: Montar pacote de dados e solicitar pedido
    E seleciono Monte seu Combo e preencho meus dados
    E monto meu combo
    E forneco os dados restantes
    Entao valido se botao de finalizar pedido esta clicvel

  Cenario: Comprando produto
    Quando clico Produtos e Servicos
    E clico em ver todos na loja e seleciono o produto desejado
    E preencho os dados
    Entao valido se o Botao finalizar compra esta habilitado

