package alimentos;

public class laticinio extends alimento{
    public laticinio(String n, float vE, float c, float p, float gT, float gS, float fA, float s, float qtd){
        super(n, vE, c, p, gT, gS, fA, s, qtd);
        this.setTipo(4);
    }
}
