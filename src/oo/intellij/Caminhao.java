package oo.intellij;

public class Caminhao extends Veiculo{
    private String Motor;
    private QuantidadeContainer QuantContainer;
    String num_Serie;
    TamanhoContainer tamanho_Container;
    String marca_Contanier;

    public Caminhao(String marca, String modelo, String cor, int anoFabricacao, String motor, QuantidadeContainer quantContainer) {
        super(marca, modelo, cor, anoFabricacao);
        Motor = motor;
        QuantContainer = quantContainer;
    }

    public String getMotor(){return Motor;}

    public String getQuantContanier(){
        if (QuantContainer == QuantidadeContainer.UM){
            return "O caminhão possui disponibilidade para apenas um container.";
        }else{
            return "O caminhão possui capacidade para dois containers";
        }
    }

    public void dadosContanier(String num_Serie, TamanhoContainer tamanho_Container, String marca_Contanier){
        System.out.println("Dados do Container 1:");
        System.out.println("    Número de série:" + num_Serie);
        System.out.println("    Tamanho: " + tamanho_Container.getText());
        System.out.println("    Marca: " + marca_Contanier);
    }

    public void dadosContanier2(String num_Serie, TamanhoContainer tamanho_Container, String marca_Contanier){
        if (QuantContainer == QuantidadeContainer.UM){
            System.out.println("No caminhão não há espaço para um segundo container.");
        }else{
            System.out.println("Dados do Container 2:");
            System.out.println("    Número de série:" + num_Serie);
            System.out.println("    Tamanho: " + tamanho_Container.getText());
            System.out.println("    Marca: " + marca_Contanier);
        }
    }
}
