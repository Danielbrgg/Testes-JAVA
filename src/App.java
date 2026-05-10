import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("========== JAVA ESTUDOS ==========\n");

        // =====================================================
        // TIPOS PRIMITIVOS
        // =====================================================

        /*
         * TIPOS PRIMITIVOS
         * 
         * byte   -> 8 bits
         * short  -> 16 bits
         * int    -> 32 bits
         * long   -> 64 bits
         * 
         * float  -> decimal pequeno
         * double -> decimal grande
         * 
         * boolean -> true ou false
         * char -> único caractere
         */

        int idade = 16;
        double altura = 1.75;
        char letra = 'D';
        boolean vivo = true;

        System.out.println("========== TIPOS PRIMITIVOS ==========");
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Letra: " + letra);
        System.out.println("Vivo?: " + vivo);

        // =====================================================
        // ARRAYS
        // =====================================================

        System.out.println("\n========== ARRAYS ==========");

        // Array possui tamanho FIXO

        String[] nomesArr = new String[5];

        nomesArr[0] = "Daniel";
        nomesArr[1] = "Braga";
        nomesArr[2] = "Gomes";

        System.out.println("Tamanho do array: " + nomesArr.length);

        // Cada String do array vai, uma por vez, para "nome"
        for(String nome : nomesArr){

            // evita mostrar null
            if(nome != null){
                System.out.println(nome);
            }
        }

        // =====================================================
        // ARRAYLIST
        // =====================================================

        System.out.println("\n========== ARRAYLIST ==========");

        /*
         * ArrayList:
         * - tamanho dinâmico
         * - usa métodos
         * - size() ao invés de length
         */

        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Anna");
        nomes.add("Maria");
        nomes.add("João");
        nomes.add("Pedro");

        System.out.println("Lista inteira:");
        System.out.println(nomes);

        System.out.println("\nPercorrendo ArrayList:");

        for(String pessoa : nomes){
            System.out.println(pessoa);
        }

        System.out.println("\nTamanho da lista: " + nomes.size());

        nomes.remove("João");

        System.out.println("\nApós remover João:");
        System.out.println(nomes);

        // =====================================================
        // WHILE
        // =====================================================

        System.out.println("\n========== WHILE ==========");

        int contador = 0;

        while(contador < 5){
            System.out.println("Contador: " + contador);
            contador++;
        }

        // =====================================================
        // CASTING
        // =====================================================

        System.out.println("\n========== CASTING ==========");

        // double -> int

        double numeroDouble = 19.99;
        int numeroInt = (int) numeroDouble;

        System.out.println("Double original: " + numeroDouble);
        System.out.println("Convertido para int: " + numeroInt);

        // int -> double

        int numero2 = 10;
        double resultado = (double) numero2;

        System.out.println("\nInt original: " + numero2);
        System.out.println("Convertido para double: " + resultado);

        // String -> int

        String textoNumero = "50";

        int numeroConvertido = Integer.parseInt(textoNumero);

        System.out.println("\nString original: " + textoNumero);
        System.out.println("Convertido para int: " + numeroConvertido);

        // int -> String

        String texto = String.valueOf(numeroConvertido);

        System.out.println("\nInt original: " + numeroConvertido);
        System.out.println("Convertido para String: " + texto);

        // =====================================================
        // FINAL
        // =====================================================

        System.out.println("\n========== FIM DO PROGRAMA ==========");

        //o que EU realmente fiz foi o commit passado, isso aqui eu só pedi pra ia ajeitar o codigo e deixar organizado
    }
}