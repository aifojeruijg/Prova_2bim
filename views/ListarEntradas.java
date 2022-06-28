package views;
import controllers.EntradaController;
import models.Entrada;

public class ListarEntradas {
    
    public void renderizar(){
        EntradaController entradaController = new EntradaController();

        System.out.println("\n -- Automóveis no Estacionamento -- \n");

        for (Entrada entradaCadastrada : entradaController.listar()){
            System.out.println("Modelo: " + entradaCadastrada.getAutomovel().getModelo());
            System.out.println("Placa: " + entradaCadastrada.getAutomovel().getPlaca());
            System.out.println("Cor:" + entradaCadastrada.getAutomovel().getCor());
        }
    }

}
