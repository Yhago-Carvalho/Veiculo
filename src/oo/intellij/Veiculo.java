package oo.intellij;

public class Veiculo { //Criando classe Veículo
    //Declarando os atributos de cada veículo
    private String Marca;
    private String Modelo;
    private String Cor;
    private int AnoFabricacao;

    //Declarando variáveis a serem usadas
    int velocidade = 0;
    int posicao_inicial = 0;
    Posicao Orientacao;

    //Criando o construtor
    public Veiculo(String marca, String modelo, String cor, int anoFabricacao){
        Marca = marca;
        Modelo = modelo;
        Cor = cor;
        AnoFabricacao = anoFabricacao;
    }

    //Métodos que retornem os atributos do veículo
    public String getMarca(){return Marca;}

    public String getModelo(){return Modelo;}

    public String getCor(){return Cor;}

    public int getAnoFabricacao(){return AnoFabricacao;}

    //Métodos da classe (ações do carro)
    public int acelerar(int valor){return velocidade += valor;}

    public int frear(int valor){
        velocidade -= valor;
        if (velocidade < 0)
            velocidade = 0;
        return velocidade;
    }

    public Posicao mostraPosicao(){
        return Posicao.getValue(posicao_inicial);
    }

    public Posicao Virar(Direcao direcao){
        if(direcao == Direcao.DIREITA) {
            posicao_inicial += 1;
            if (posicao_inicial == 4) {
                posicao_inicial = 0;
            }
        }else{
            posicao_inicial -= 1;
            if (posicao_inicial < 0){
                posicao_inicial = 3;
            }
        }
        return Orientacao = Posicao.getValue(posicao_inicial);
    }
}
