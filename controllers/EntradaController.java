package controllers;
import java.util.ArrayList;
import models.Automovel;
import models.Entrada;

public class EntradaController {
    
    private static ArrayList<Entrada> entradas = new ArrayList<Entrada>();

    public void cadastrar(Entrada entrada){
        entradas.add(entrada);
    }

    public ArrayList<Entrada> listar() {
        return entradas;
    }
    
    public Entrada buscarPorPlaca(String placa){
        for (Entrada entradaCadastrada : entradas){
            if (entradaCadastrada.getPlaca().equals(placa)){
                return entradaCadastrada;
            }
        }
        return null;
    }

    private static ArrayList <Automovel> automovels = new ArrayList<Automovel>();

    public void remover (Automovel Automovel){
        automovels.remove(Automovel);
    }


}
