public class Aritmetica {
    @Override
    public double calcularMedia(double p1, double p2) {
        return (p1 + p2) / 2;
    }

    @Override
    public String situacao(double media) {
        if (media > 5.0) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }
}
