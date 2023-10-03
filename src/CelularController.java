import java.util.List;
import java.util.ArrayList;
class CelularController {
    private List<Celular> celulares;
    private CelularFactory factory;

    public CelularController() {
        celulares = new ArrayList<Celular>();
        factory = new CelularFactory();
    }
    
    public void cadastrarCelular(int num) {
        Celular celular = factory.criarCelular(num);
        celulares.add(celular);
    }

    public void exibirCelulares() {
        for (Celular celular : celulares) {
            celular.exibirInfo();
        }
    }

    public void atualizarCelular(int indice, Celular novoCelular) {
        celulares.set(indice, novoCelular);
    }

    public void deletarCelular(int indice) {
        celulares.remove(indice);
    }
}
