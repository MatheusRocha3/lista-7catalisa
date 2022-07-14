import java.util.*;
public class Pais {
    private String codigoIso;
    private String nomeDoPais;
    private double populacao;
    private double dimensao;
    private List<String> listaVizinhos;
    public Pais(String codigoIso, String nomeDoPais, double populacao, double dimensao, List<String> listaVizinhos) {
        this.codigoIso = (codigoIso);
        this.nomeDoPais = (nomeDoPais);
        this.populacao = (populacao);
        this.dimensao = (dimensao);
        this.listaVizinhos = (listaVizinhos);
    }
    public void apresentar() {
        System.out.println("Informações referente ao País: ");
        System.out.println("Código ISO: " + this.codigoIso);
        System.out.println("Nome do país: " + this.nomeDoPais);
        System.out.println("Número populacional:" + this.populacao);
        System.out.println("Tamho do país " + this.dimensao + " km²");
    }
public void densidade() {
    System.out.printf("A sua densidade demográfica é de: %.2f km²\n", densidadeDemografica());
}
    public boolean verificacaoFronteira(String nomePais) {
        return listaVizinhos.contains(nomePais);
    }
    public double densidadeDemografica() {
        return this.populacao / this.dimensao;
    }
    public String getCodigoIso() {
        return codigoIso;
    }
    public void setCodigoIso(String codigoIso) {
        this.codigoIso = codigoIso;
    }
    public String getNomeDoPais() {
        return nomeDoPais;
    }
    public void setNomeDoPais(String nomeDoPais) {
        this.nomeDoPais = nomeDoPais;
    }
    public double getPopulacao() {
        return populacao;
    }
    public void setPopulacao(double populacao) {
        this.populacao = populacao;
    }
    public double getDimensao() {
        return dimensao;
    }
    public void setDimensao(double dimensao) {
        this.dimensao = dimensao;
    }
    public List<String> getListaVizinhos() {
        return listaVizinhos;
    }
    public void setListaVizinhos(List<String> listaVizinhos) {
        this.listaVizinhos = listaVizinhos;
    }
}

