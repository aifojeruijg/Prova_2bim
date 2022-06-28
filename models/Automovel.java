package models;
import java.util.Random;

public class Automovel {

    private String modelo;
    private String cor;
    private String placa;
    

    public String getModelo(){
        return modelo;
    }
    public String getCor(){
        return cor;
    }
    public String getPlaca(){
        return placa;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    public void setPlaca(String placa){
        this.placa = placa;
    }

    Random random = new Random();
    int nmr = random.nextInt(60);
    public int getAleatorio(){
        return nmr;
    }
}