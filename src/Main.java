import Carros.BMW3Series;
import Carros.Carro;
import Carros.FordMustang;
import Carros.HondaCivic;

public class Main {
    public static void main(String[] args) {
        Garagem<Carro> garagem = new Garagem<>();

        garagem.add(new HondaCivic());
        garagem.add(new FordMustang());
        garagem.add(new BMW3Series());

        garagem.print();
    }
}