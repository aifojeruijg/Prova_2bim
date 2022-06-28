package controllers;

import java.util.ArrayList;
import models.Moto;
import java.util.ArrayList;

public class MotoController {

    private static ArrayList<Moto> motos = new ArrayList<Moto>();

    public void cadastrar (Moto moto){
        motos.add(moto);
    }

    public ArrayList<Moto> listar(){
        return motos;
    }

    
}
