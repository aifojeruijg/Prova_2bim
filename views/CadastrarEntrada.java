package views;
import utils.Console;
import controllers.AutomovelController;
import controllers.EntradaController;
import models.Automovel;
import models.Entrada;

public class CadastrarEntrada {

    public void renderizar(){
        Entrada entrada = new Entrada();
        Automovel automovel = new Automovel();
        EntradaController entradaController = new EntradaController();
        AutomovelController automovelController = new AutomovelController();


        System.out.println("\n -- Cadastrar a entrada de um automóvel -- \n");
        String placaAutomovel = Console.readString("Insira a placa do automóvel: ");
        automovel = automovelController.buscarPorPlaca(placaAutomovel);
        if (automovel != null){
            entrada.setAutomovel(automovel);
            entradaController.cadastrar(entrada);
            System.out.println("\n -- Entrada com Sucesso -- \n");
        }else {
            System.out.println("\n -- Placa errada ou não cadastrada! --\n");
        }
        
    }
    
}
