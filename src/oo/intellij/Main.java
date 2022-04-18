package oo.intellij;

public class Main {

    public static void main(String[] args) {
	// Criando objeto
        Veiculo veiculo = new Veiculo("Hyundai", "Hb20", "Vinho", 2018);
        Carro carro_Yhago = new Carro("Fiat", "Siena", "Prata", 2011, 1.4);
        Moto moto_Yhago = new Moto("Honda", "Hornet", "Branca", 2017, 600);
        Caminhao caminhao_Yhago = new Caminhao("Scania", "R500", "Branca", 2020, "500cv", QuantidadeContainer.UM);

        /*System.out.println(carro_Yhago.getAnoFabricacao());
        System.out.println(carro_Yhago.velocidade);
        System.out.println(carro_Yhago.acelerar(5));
        System.out.println(carro_Yhago.frear(6));
        System.out.println(carro_Yhago.mostraPosicao());
        carro_Yhago.fazerZerinho(Direcao.ESQUERDA);
        carro_Yhago.Virar(Direcao.DIREITA);
        carro_Yhago.fazerZerinho(Direcao.DIREITA);
        System.out.println(moto_Yhago.baguncar());
        System.out.println(moto_Yhago.empinar());*/
        caminhao_Yhago.dadosContanier("660913", TamanhoContainer.QUARENTA_PES, "CSAV");
        caminhao_Yhago.dadosContanier2("005678", TamanhoContainer.VINTE_PES, "CSAV");
    }
}
