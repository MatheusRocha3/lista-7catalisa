import java.util.ArrayList;
import java.util.List;

public class  Vizinhos extends Pais {
    public Vizinhos(String codigoIso, String nomeDoPais, double populacao, double dimensao, List<String> listaVizinhos) {
        super(codigoIso, nomeDoPais, populacao, dimensao, listaVizinhos);
    }

    public static void main(String[] args) {
        List<String> vizinhosBrasil = new ArrayList<>();
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


        List<String> vizinhosArgentina = new ArrayList<>();
        vizinhosArgentina.add("Brasil");
        vizinhosArgentina.add("Uruguai");
        vizinhosArgentina.add("Paraguai");
        vizinhosArgentina.add("Bolívia");
        vizinhosArgentina.add("Chile");

        List<String> vizinhosParaguai = new ArrayList<>();
        vizinhosParaguai.add("Argentina");
        vizinhosParaguai.add("Bolívia");
        vizinhosParaguai.add("Brasil");

        List<String> vizinhosBolivia = new ArrayList<>();

        vizinhosBolivia.add("Argentina");
        vizinhosBolivia.add("Brasil");
        vizinhosBolivia.add("Paraguai");
        vizinhosBolivia.add("Peru");
        vizinhosBolivia.add("Chile");


        List<String> vizinhosColombia = new ArrayList<>();
        vizinhosColombia.add("Brasil");
        vizinhosColombia.add("Equador");
        vizinhosColombia.add("Venezuela");
        vizinhosColombia.add("Peru");
        vizinhosColombia.add("Panamá");

    }
}


