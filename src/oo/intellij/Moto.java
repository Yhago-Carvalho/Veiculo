package oo.intellij;

public class Moto extends Veiculo{
    private int Motor;
    public Moto(String marca, String modelo, String cor, int anoFabricacao, int motor) {
        super(marca, modelo, cor, anoFabricacao);
        Motor = motor;
    }

    public int getMotor(){return Motor;}

    public String empinar(){return "Empinando...";}

    public String baguncar(){return "Randandandan Randandandan...";}
}
