public class Geometrica {
    @Override
    public double calcularMedia(double p1, double p2) {
        return Math.sqrt(p1 * p2);
    }

    @Override
    public String situacao(double media) {
        if (media > 7.0) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }
}
