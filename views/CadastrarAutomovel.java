package views;
import controllers.AutomovelController;
import models.Automovel;
import utils.Console;

public class CadastrarAutomovel {
    
    public void renderizar(){
        
        Automovel automovel = new Automovel();
        AutomovelController automovelController = new AutomovelController();
        System.out.println("\n-- Cadastrar um automovel --\n");
        automovel.setModelo(Console.readString("Digite o Modelo: "));
        automovel.setPlaca(Console.readString("Digite a Placa: "));
        automovel.setCor(Console.readString("Digite a Cor: "));
        automovelController.cadastrar(automovel);
        System.out.println("\n -- Automóvel cadastrado com sucesso! -- \n");
    }

}
