package views;
import utils.Console;
import controllers.AutomovelController;
import controllers.EntradaController;
import models.Automovel;
import models.Entrada;

public class Sair {

    public void renderizar(){
        EntradaController entradaController = new EntradaController();
        Automovel automovel = new Automovel();
        Entrada entrada = new Entrada();
        AutomovelController automovelController = new AutomovelController();

        System.out.println(" -- Sair do estacionamento -- ");

        String placa = Console.readString("Digite a placado automóvel saindo do estacionamento: ");
        automovel = automovelController.buscarPorPlaca(placa);
            if(automovel != null){
                System.out.println("O automóvel ficou: " + automovel.getAleatorio() + " minutos no estacionamento");
                System.out.println("O valor final foi de: " + automovel.getAleatorio()*5 + " Reais");
                automovelController.remover(automovel);
            } else {
                System.out.println("Placa inválda");
            }
    }
}
