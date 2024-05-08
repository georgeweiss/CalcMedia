public class Disciplina {
    private String nome;
    private double p1;
    private double p2;
    private CalculoMedia calculo;

    public Disciplina(CalculoMedia calculo) {
        this.calculo = calculo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setP1(double p1) {
        this.p1 = p1;
    }

    public void setP2(double p2) {
        this.p2 = p2;
    }

    public void CalcularMedia() {
        double media = calculo.calcularMedia(p1, p2);
        String situacao = calculo.situacao(media);
        System.out.println(String.format("P1:%.2f P2:%.2f Media:%.2f Situacao: %s", p1, p2, media, situacao));
    }

    public double getP1() {
        return p1;
    }

    public double getP2() {
        return p2;
    }

    public double getMedia() {
        return p1 + p2;
    }

    public String getSituacao() {
        return situacao;
    }

}
