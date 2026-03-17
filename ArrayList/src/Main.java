//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList lista = new ArrayList();

        lista.adicionar(1);
        lista.adicionar(2);
        lista.adicionar(3);
        lista.adicionar(4);
        lista.adicionar(5);
        lista.adicionar(6);
        lista.adicionar(7);
        lista.adicionar(8);
        lista.adicionar(9);
        lista.adicionar(10);
        lista.adicionar(11);

        System.out.println(lista.pegar(0));

        System.out.println(lista.tamanho());

        System.out.println(lista);

        lista.listar();

    }
}