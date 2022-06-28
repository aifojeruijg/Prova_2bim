package models;

public class Entrada {

    private Automovel automovel;

    public Automovel getAutomovel(){
        return automovel;
    }
    public void setAutomovel(Automovel automovel){
        this.automovel = automovel;
    }

    @Override
    public String toString(){
        return
        "Modelo: " + automovel.getModelo() +
        "| Placa: " + automovel.getPlaca() +
        "| Cor: " +automovel.getCor();
    }
    public Object getPlaca() {
        return null;
    }
    
}
