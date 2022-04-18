package oo.intellij;

public enum Posicao {
    NORTE, LESTE, SUL, OESTE;

    public static Posicao getValue(int posicao){
        return values()[posicao];
    }
}
