package alimentos;

public class fruta extends alimento{

    public fruta(String n, float vE, float c, float p, float gT, float gS, float fA, float s, float qtd){
        super(n, vE, c, p, gT, gS, fA, s, qtd);
        this.setTipo(2);
    }
}
