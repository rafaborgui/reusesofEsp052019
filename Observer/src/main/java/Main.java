public class Main {
    public static void Main(String args[]) {
        IEstacao estacao = new Estacao();
        Interessado interessado = new ClimaTempo(estacao);
        Interessado immet = new Immet(estacao);

        estacao.register(interessado);
        estacao.register(immet);

        estacao.setTemperatura(10);
        estacao.setUmidade(80);
        estacao.setPressao(50);
    }
}
