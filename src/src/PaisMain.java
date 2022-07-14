import java.util.*;
public class PaisMain {
    public static void main(String[] args) {
        List<String> vizinhosBrasil = new ArrayList<>();
        Pais brasil = new Pais("BRA", "Brasil", 212.6, 8.516, vizinhosBrasil);
        vizinhosBrasil.add("Argentina");
        vizinhosBrasil.add("Uruguai");
        vizinhosBrasil.add("Paraguai");
        vizinhosBrasil.add("Bolívia");
        vizinhosBrasil.add("Peru");
        vizinhosBrasil.add("Colômbia");
        vizinhosBrasil.add("Venezuela");
        vizinhosBrasil.add("Guiana");
        vizinhosBrasil.add("Guiana Francesa");
        vizinhosBrasil.add("Suriname");
        brasil.apresentar();
        brasil.densidade();
        System.out.println("O Brasil tem fronteira com a Argentina? " + brasil.verificacaoFronteira("Argentina"));

        List<String> vizinhosArgentina = new ArrayList<>();
        Pais argentina = new Pais("ARG", "Argentina", 45.38, 2.780, vizinhosArgentina);
        vizinhosArgentina.add("Brasil");
        vizinhosArgentina.add("Uruguai");
        vizinhosArgentina.add("Paraguai");
        vizinhosArgentina.add("Bolívia");
        vizinhosArgentina.add("Chile");
        argentina.apresentar();
        argentina.densidade();
        System.out.println("A Argentina tem fronteira com o Brasil? " + argentina.verificacaoFronteira("Brasil"));
    }
}



