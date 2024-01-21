package academy.testes.arvoredebusca.dominio;

public class No {
    private Integer valor;
    private No direita;
    private No esquerda;

    public No() {
    }

    public No(Integer valor) {
        this.valor = valor;
    }

    public No(Integer valor, No direita, No esquerda) {
        this(valor);
        this.direita = direita;
        this.esquerda = esquerda;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public No getDireita() {
        return direita;
    }

    public void setDireita(No direita) {
        this.direita = direita;
    }

    public No getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(No esquerda) {
        this.esquerda = esquerda;
    }
}
