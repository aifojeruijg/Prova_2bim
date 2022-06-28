package models;

public class Carro extends Automovel {

    @Override
    public String toString(){
        return
            "Modelo: " + getModelo() +
            " | Placa: " + getPlaca() +
            " | Cor: " + getPlaca();
    }
}
