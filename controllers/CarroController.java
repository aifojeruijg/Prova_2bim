package controllers;
import java.util.ArrayList;
import models.Carro;

public class CarroController {

    private static ArrayList<Carro> carros = new ArrayList<Carro>();

    public void cadastrar (Carro carro){
        carros.add(carro);
    }
    
}
