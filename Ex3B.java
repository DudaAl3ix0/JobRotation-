import java.util.ArrayList;

public class Ex3B {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(4);
        list.add(8);
        list.add(32);
        list.add(64);

        int tamanhoLista = list.size();
        int ultimoElemento = list.get(tamanhoLista - 1);
        int proximoElemento = ultimoElemento * 2;

        System.out.println(proximoElemento);
    }
}
