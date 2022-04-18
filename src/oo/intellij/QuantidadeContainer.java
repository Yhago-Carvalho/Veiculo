package oo.intellij;

enum TamanhoContainer{
    VINTE_PES("Vinte pés"), QUARENTA_PES("Quarenta pés");

    private String Text;
    TamanhoContainer(String text) {
        Text = text;
    }

    public String getText(){
        return Text;
    }
}

public enum QuantidadeContainer {
    UM, DOIS;
}
