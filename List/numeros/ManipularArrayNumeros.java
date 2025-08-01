import java.util.List;

public class ManipularArrayNumeros {

    public static void adicionarNumero(List<Integer> numeros, int i) {
        if (buscarPosicaoNumero(numeros, i) != -1) {
            throw new IllegalArgumentException("Numero jah contido na lista");
        }
        numeros.add(i);
    }

    public static void removerNumero(List<Integer> numeros, int i) {
        if(buscarPosicaoNumero(numeros, i) == -1) {
            throw new IllegalArgumentException("Numero nao encontrado na lista");
        }
        numeros.remove(Integer.valueOf(i));
    }

    public static void substituirNumero(List<Integer> numeros, int numeroSubstituir, int numeroSubstituto) {
        int posicao = buscarPosicaoNumero(numeros, numeroSubstituir);
        if(posicao == -1) {
            adicionarNumero(numeros, numeroSubstituto);
            return;
        }
        numeros.set(posicao, numeroSubstituto);
    }

    public static int buscarPosicaoNumero(List<Integer> numeros, int i) {
        return numeros.indexOf(i);
    }

}
