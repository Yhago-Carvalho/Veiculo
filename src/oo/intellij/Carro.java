package oo.intellij;

public class Carro extends Veiculo{
    private double Motor;
    public Carro(String marca, String modelo, String cor, int anoFabricacao, double motor) {
        super(marca, modelo, cor, anoFabricacao);
        Motor = motor;
    }

    public double getMotor(){return Motor;}

    public void fazerZerinho(Direcao direcao){
        for (int i=0; i<4; i++){
            System.out.println(Virar(direcao));;
        }
    }
}
