public class Aritmetica implements MediaStrategy{

    @Override
    public double calcularMedia(double p1, double p2) {
        double media = (p1 + p2)/2;
        return media;
    }

    @Override
    public String verificarSituacao(double media) {
        String situacao = "Reprovado";
        if(media >= 5)
            situacao = "Aprovado";
        return situacao;
    }
}
