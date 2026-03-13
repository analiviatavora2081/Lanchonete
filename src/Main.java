import Model.Cliente;
import Model.Hamburguer;
import Model.Pedido;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> ingredientesList = new ArrayList<String>();
        IngredientesList.add("pao");
        IngredientesList.add("hamburguer");
        IngredientesList.add("queijo");
        IngredientesList.add("bacon");
        IngredientesList.add("frango");
        IngredientesList.add("chedar");

        Cliente cliente= new Cliente("Ana", "Tavora");
        Hamburguer simples = new Hamburguer("pao", "queijo","amburg", "cebola");

        Pedido pedido1 = new Pedido(cliente, simples);

    System.out.println(pedido1.getCliente().getNomeInteiro());
    System.out.println(pedido1. getLanche().getIngrediente());
    System.out.println(pedido1.getstatus());

    }
}

