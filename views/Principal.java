package views;
import utils.Console;

public class Principal {
    public static void main(String[] args){
        int opc = 0;

        do {
            System.out.println(" ________________________________________");
            System.out.println("|                  MENU                  |");
            System.out.println("|   1 - Cadastrar um Carro               |");
            System.out.println("|   2 - Cadastrar uma Moto               |");
            System.out.println("|   3 - Entrada do Automóvel             |");
            System.out.println("|   4 - Saída do automóvel               |");
            System.out.println("|   5 - Listar Carros NO Estacionamento  |");
            System.out.println("|   6 - Listar Motos                     |");
            System.out.println("|                0 - Sair                |");
            System.out.println("|________________________________________|");
            opc = Console.readInt("\nDigite uma opção: ");

            switch(opc){
                case 1:
                CadastrarAutomovel cadastrarAutomovel = new CadastrarAutomovel();
                cadastrarAutomovel.renderizar();
                    break;

                case 2:
                CadastrarMoto cadastrarMoto = new CadastrarMoto();
                cadastrarMoto.renderizar();
                case 3:
                CadastrarEntrada cadastrarEntrada = new CadastrarEntrada();
                cadastrarEntrada.renderizar();
                    break;

                case 4:
                Sair sair = new Sair();
                sair.renderizar();
                    break;

                case 5:
                ListarEntradas listarEntradas = new ListarEntradas();
                listarEntradas.renderizar();
                    break;

                case 6:
                ListarMotos listarAutomoveis = new ListarMotos();
                listarAutomoveis.renderizar();
            }


        }while (opc !=0);
    }
}
