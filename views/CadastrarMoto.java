package views;
import controllers.MotoController;
import models.Moto;
import utils.Console;

public class CadastrarMoto {
    
    public void renderizar(){

        Moto moto = new Moto();
        MotoController motoController = new MotoController();
        System.out.println("\n -- Cadastrar uma moto \n -- ");
        moto.setModelo(Console.readString("Digite o Modelo: "));
        moto.setPlaca(Console.readString("Digite a Placa: "));
        moto.setCor(Console.readString("Digite a Cor: "));
        motoController.cadastrar(moto);
        System.out.println("Moto cadastrada com sucesso \n");
    }

}
