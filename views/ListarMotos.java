package views;
import controllers.MotoController;
import models.Moto;

public class ListarMotos {

    public void renderizar() {
        MotoController motoController = new MotoController();
         System.out.println(" -- Listagem das motos cadastrados -- ");
        for (Moto motoCadastrada:motoController.listar()){
            System.out.println( "Modelo: " + motoCadastrada.getModelo());
            System.out.println("Placa: " + motoCadastrada.getPlaca());
            System.out.println("Cor: " + motoCadastrada.getCor() + "\n");
        }
    }
    
}
