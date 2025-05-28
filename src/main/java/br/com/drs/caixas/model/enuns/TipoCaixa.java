package br.com.drs.caixas.model;

public enum TipoCaixa {
    CAIXA_1(30, 40, 80),
    CAIXA_2(80, 50, 40),
    CAIXA_3(50, 80, 60);

    public final int altura, largura, comprimento;
    TipoCaixa(int altura, int largura, int comprimento) {
        this.altura = altura;
        this.largura = largura;
        this.comprimento = comprimento;
    }
}