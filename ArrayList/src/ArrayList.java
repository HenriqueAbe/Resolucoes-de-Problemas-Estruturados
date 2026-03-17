import java.util.Arrays;

public class ArrayList {
    private int[] lista;
    private int tamanho;


    public ArrayList() {
        lista = new int[10];
        tamanho = 0;
    }

    public void adicionar(int valor) {
        if (tamanho == lista.length) {
            aumentarCapacidade();
        }
        lista[tamanho] = valor;
        tamanho++;
    }

    private void aumentarCapacidade() {
        int[] novo = new int[lista.length / 2 + lista.length];

        for (int i = 0; i < lista.length; i++) {
            novo[i] = lista[i];
        }

        lista = novo;
    }

    public int pegar(int indice) {
        if(indice >= tamanho) {
            throw new IndexOutOfBoundsException();
        }
        return lista[indice];
    }

    public void listar() {
        int[] listado = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            listado[i] = lista[i];
        }

        System.out.println(Arrays.toString(listado));
    }

    public int tamanho() {
        return tamanho;
    }

}
