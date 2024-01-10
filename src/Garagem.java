import Carros.Carro;

import java.util.ArrayList;
import java.util.List;

public class Garagem<G extends Carro> {
    List<G> garagem = new ArrayList<>();

    public void add(G carro) {
        garagem.add(carro);
    }

    public void print() {
        for (G carro : garagem) {
            System.out.println(carro.getModelo());
        }
    }
}
