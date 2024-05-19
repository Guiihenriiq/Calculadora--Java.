package Poo;

import java.util.HashMap;
import java.util.Scanner;

public class TestaNumero {
    public static void main(String[] args) {
        Numero n = new numero ();
        
   boolean continuar = true;

   Scanner scan = new Scanner(System.in);
   while (continuar) {
    double x=0;

    double y=0;

    int operacao=0;

    System.out.println(x,"Digite a operação que deseja realizar: "
    +            " /n 1 para soma"
    +            " /n 2 para subtração "
    +            " /n 3 para divisão"
    +            " /n 4 para mutiplicação"
    +            " /n ou 0 para finalizar o programa"
      );

    operacao = scan.nextInt();

    if (operacao==0) {
        continuar=false;
        return;
        
    }
       
    System.out.println("Informe o valor do primeiro número");
    x= scan.nextDouble();
    System.out.println("Informe o valor do segundo número");
    y= scan.nextDouble();

    switch (operacao) {
        case 1:
            imprimeCauculadora(operacao, n.soma(x, y), x, y);
            break;
  
    }
    switch (operacao) {
        case 2:
            imprimeCauculadora(operacao, n.subtracao(x, y), x, y);
            break;
  
    }
    switch (operacao) {
        case 3:
            imprimeCauculadora(operacao, n.dividido(x, y), x, y);
            break;
  
    }
    switch (operacao) {
        case 4:
            imprimeCauculadora(operacao, n.mutiplicacao(x, y), x, y);
            break;
  
    }
}

   scan.close();
   
    }

    static void imprimeCauculadora(int operacao, double resutado, double x,double y){
        HashMap<Integer, String> mapOperacao = new HashMap<>();
        mapOperacao.put(key=1, value= "somado");
        mapOperacao.put(key=2, value= "subtraido");
        mapOperacao.put(key=3, value= "dividido");
        mapOperacao.put(key=4, value= "mutiplicado");

        System.out.println(x, "/n O resutado de " + x + mapOperacao.get(operacao) + "por" + y + "é igual a" + resutado + "/n"
        );
    }
}
