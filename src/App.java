
public class App {
    public static void main(String[] args) throws Exception {
        // int Idade = 20;
        //String name = "Daniel";
        //var nomes = "Davi";

        //TIPOS PRIMITIVOS = numeros inteiros, decimais e o boolean 
        // numeros inteiros
        //byte são 8  bits que vai de -128 a 127
        //short são 16 bits que vai de -32.768 a 32.767
        //inteiro 32  bits
        //long são 64 bits

        //decimais 
        // float 32 bits, pequenos ex: 10,21
        //double 64 bits, grandes ex:  

        //String
        /* 
        String = palavras 
        char = unica letra ex a,b,c,d,e,
        char MeuChar = 'a';
        MeuChar = "Daniel" Erradooo!
        */


        // boolean bool = true;
        // if(bool){
        //     System.out.println("Verdadeiro!");
        // } else {
        //     System.out.println("FALSE!");
        // }

        // int[] Vetor = {1,2,3,4,5,6};

        // System.out.println(Vetor[4]);
        // System.out.println(Vetor.length);

        // int[] NovoVetor = new int[10];
        // // ja determinei o tamanho do vetor sem determinar o valor das casas

        // System.out.println(NovoVetor[9]);

        // if(NovoVetor[9] == 0){
        //     System.out.println("Realmente é zero e não null");
        //}


        //Frecura, não aceita tipos primitivos, Dito isso o integer == int e fique por isso 
        // ArrayList<Integer> numeros = new ArrayList<>();

        //  String[] nomesArr = new String[10];

        //  nomesArr[0] = "Daniel";
        //  nomesArr[3] = "Balestrin";

        // System.out.println(nomesArr[3]);


        
        //ARRAYLIST

        // ArrayList<String> nomes = new ArrayList<>();

        // nomes.add("Daniel");
        // nomes.add("Braga");
        // nomes.add("Gomes");
        // nomes.add("Anna");
        
        //  System.out.println(nomes);
        //  System.out.println(nomes.size());

        // //é pra usar () e não [] pq é um array e nao um vetor, SIM É ISSO.
        // //usar get se quiser algo mais especifico.

        // // Size pra arraylist e lenght para vetor

        // nomes.remove(0);
        // // ou
        // nomes.remove("Gomes");
        // System.out.println(nomes);
        // System.out.println(nomes.size());

    

        //Loops FOR, WHILE 
        // VARIAVEL DE INTERAÇÃO
        //condicional
        //atribuição/ manipulação
        // for(int i = 0; i <nomes.size(); i++){
        //     System.out.println(nomes.get(i));
        // }

        // Cada String de nomesArr vai, uma por vez, para a variável "a"
        // for( String a : nomesArr){
        //     System.out.println(a); 
        // }

        //algo vai ser executado até uma condição seja atingida
        // int contador = 0;
        // while(contador<10){
        //     System.out.println("Estou no contador");
        //     contador++;
        // }
        
        //Casting
        // Mudar os valores int - double, double  int, string - int, int - string, 
        
        // double - int
        // double numero = 20.0;
        // int numeroint = (int) numero; 
        // System.out.println(numeroint);

        // int - double
        // int numero = 20;
        // double resultado = (double) numero;
        // System.out.println(resultado);


        // // String - int
        // String NomeQualquer = "10";
        // int int2 = Integer.parseInt(NomeQualquer);
        // System.out.println(int2); 

        // //int - string 
        // String minhaString = String.valueOf(int2);
        // System.out.println(minhaString);
        }
}
