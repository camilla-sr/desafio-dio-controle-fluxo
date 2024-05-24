package controleFluxo;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe um número");
        int valorA = sc.nextInt();
        
        System.out.println("Informe o segundo número");
        int valorB = sc.nextInt();
        
        try{
            contar(valorA, valorB);
        }catch(ParametrosInvalidosException e){
            System.out.println("Erro: " + e.getMessage());
        }
    }
    
    static void contar(int valorA, int valorB) throws ParametrosInvalidosException{
        if(valorA > valorB){
            throw new ParametrosInvalidosException("O primeiro valor não pode ser maior que o segundo");
        }
        int contagem = valorB - valorA;
        System.out.printf("%d menos %d é igual a %d, dessa forma: \n", valorB, valorA, contagem);
        
        for(int i = 1; i <= contagem ; i++){
            System.out.printf("Imprimimos: %d\n", i );    
        }
    }
}
