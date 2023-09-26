package entites;

public class Empresa {
    private String nome;
    private String cnpj;
    private int qtdFunc;

    public Empresa() {
    }

    public Empresa(String nome, String cnpj, int qtdFunc) {
        this.setNome(nome);
        this.setCnpj(cnpj);
        this.setQtdFunc(qtdFunc);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public int getQtdFunc() {
        return qtdFunc;
    }
    public void setQtdFunc(int qtdFunc) {
        this.qtdFunc = qtdFunc;
    }
}
