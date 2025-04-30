public class Main {
    public static void main(String[] args) {
        // MediaStrategy estrategia = new Aritmetica();      
        MediaStrategy estrategia = new Geometrica();      
        Disciplina d = new Disciplina(estrategia);

        d.setNome("Padrões de Desenvolvimento");
        d.setP1(10);
        d.setP2(0);
        d.calcularMedia();
        d.verificarSituacao();

        System.out.printf("P1: %.2f  P2: %.2f  Média: %.2f  Situação: %s%n",
                d.getP1(), d.getP2(), d.getMedia(), d.getSituacao());
    }
}
