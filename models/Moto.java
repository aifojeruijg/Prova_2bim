package models;

public class Moto extends Automovel {
    

    @Override
    public String toString(){
        return
            "Modelo: " + getModelo() +
            " | Placa: " + getPlaca() +
            " | Cor: " + getPlaca();
    }
}
