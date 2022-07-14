import java.util.*;
public class PaisMain {
    public static void main(String[] args) {
        List<String> vizinhosBrasil = new ArrayList<>();
        Pais brasil = new Pais("BRA", "Brasil", 212.6, 8.516, vizinhosBrasil);
        brasil.apresentar();
        brasil.densidade();
        System.out.println("O Brasil tem fronteira com a Argentina? " + brasil.verificacaoFronteira("Argentina"));

        List<String> vizinhosArgentina = new ArrayList<>();
        Pais argentina = new Pais("ARG", "Argentina", 45.38, 2.780, vizinhosArgentina);
        argentina.apresentar();
        argentina.densidade();
        System.out.println("A Argentina tem fronteira com o Brasil? " + argentina.verificacaoFronteira("Brasil"));

        List<String> vizinhosParaguai = new ArrayList<>();
        Pais paraguai = new Pais("PRY","Paraguai", 63.4, 4.06,vizinhosParaguai);
        paraguai.apresentar();
        paraguai.densidade();
        System.out.println("O Paraguai faz fronteira com a Bolívia? " + paraguai.verificacaoFronteira("Bolívia"));

        List<String> vizinhosBolivia = new ArrayList<>();
        Pais bolivia = new Pais("BOL", "Bolívia",12.57, 1.09,vizinhosBolivia);
       bolivia.apresentar();
        bolivia.densidade();
        System.out.println("A Bolívia faz fronteira com o Uruguai? " + bolivia.verificacaoFronteira("Uruguai"));

        List<String> vizinhosColombia = new ArrayList<>();
        Pais colombia = new Pais("COL", "Colômbia",51.88,1.14,vizinhosColombia);
        colombia.apresentar();
        colombia.densidade();
        System.out.println("A Bolívia faz fronteira com o Uruguai? " + colombia.verificacaoFronteira("Uruguai"));
    }
}




