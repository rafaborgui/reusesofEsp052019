import java.awt.List;
import java.util.ArrayList;

public class Estacao implements IEstacao
{
    private double temperatura;
    private double pressao;
    private double umidade;

    private List<interessado> listaInteressados;
    public Estacao() {
        this.listaInteressados = ArrayList<>();
    }
    public void unregister(Interessado interessado) {
        this.listaInteressados.remove(interessado);
    }

    public void register() {

    }

    public void notificar() {
//        this.listaInteressados
    }
}
