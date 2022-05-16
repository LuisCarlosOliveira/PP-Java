/*
 * @file: 
 * @author: Luis Oliveira <https://github.com/LuisCarlosOliveira>
 * @date
 * @brief
 */
package pt.ipp.estg.pp.pp_fp02;

/**
 *
 * @author Luis Oliveira <https://github.com/LuisCarlosOliveira>
 */
public class ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Exercicio 2
        /*
        int[][] arr1 = {{11, 7, 333},
                     {-20, -23, 63},
                     {-22, 501, 10000}};
        
        
        int count = 0;
        double avg = 0;
        int total = 0;
        
        for(int i = 0; i <arr1[0].length;i++){
            for(int j = 0; j < arr1[0].length; j++){
                total += arr1[i][j];
                count++;
            }
        }
        avg = (double) total/count;
        
        System.out.println("Total: "+total);
        System.out.println("Média: " + avg);
         */
        //EXERCICIO 3
        /*
        int[] lista = {12, 5, -21, 10, -345, 22, 50, -125, 80, -1};
        
        long mult = 1;
        int count = 0;
        int maior = lista[0];
        
        for(int i = 0; i < lista.length; i++){

            if(lista[i] > 0){
                mult *= lista[i];
            }
            else{
                count++;
            }
            
            if(maior < lista[i]){
                maior = lista[i];
            }
            
        }
        System.out.println(mult);
        System.out.println(count);
        System.out.println(maior);
         */
        //EXERCICIO 4
        /*
        char[] nome = {'A', 'n', 'a', ' ', 'S', 'a', 'n', 't', 'o', 's', '\n'};
        int vog = 0;
        int consu = 0;
        int space;
        int end;

        for (int i = 0; i < nome.length; i++) {
            if (nome[i] == 'a'
                    || nome[i] == 'e'
                    || nome[i] == 'i'
                    || nome[i] == 'o'
                    || nome[i] == 'A'
                    || nome[i] == 'u') {
                vog++;
            } else if (nome[i] != ' ' && nome[i] != '\n') {
                consu++;
            }
            if (nome[i] == ' ') {
                space = i;
                System.out.println(space);
                for (int j = space + 1; j < nome.length-1; j++) {
                    System.out.print(nome[j]);
                }
                System.out.print(',');
                for (int j = 0; j < space; j++) {
                    System.out.print(nome[j]);
                }
            }

        }
        
        System.out.println();
        System.out.println(vog);
        System.out.println(consu);
        */
        
        //EXERCICIO 5
        /*
        System.out.print(args[1]);
        System.out.print(',');
        System.out.print(args[0]);
        */
        
        //EXERCICIO 6
        
        int[] listaA = {2, -5, -121, 102, -35, -2, 0, -125, 802, -10};
        int[] listaB = {6, 99, -1, 12, 1, -2};
        
        int[] listaC = new int[listaA.length + listaB.length];
        
        
        int repetidos = 0;
        
        System.arraycopy( listaA, 0, listaC, 0, listaA.length);
        System.arraycopy( listaB, 0, listaC, listaA.length, listaB.length );
        
        
        int temp = 0;
        
        for(int i = 0; i < listaC.length-1; i++){
            
            for(int j = i+1; j < listaC.length; j++){
                if(listaC[i]== listaC[j]){
                    repetidos++;
                    temp = i;
                }
            }   
         }
        int[] arrUnic = new int[listaA.length - repetidos];
        
        int i = 0, j = 0;
        
        while(j < listaA.length ){
            if(j == temp){
                j++;
            }
            arrUnic[i++] = listaA[j++];
        
    }
        //array sem repetidos
        for(i = 0; i < arrUnic.length ; i++){
            System.out.print(arrUnic[i]+" ");
        }
        System.out.println();
        
        int[] arrRep = new int[repetidos];
        
        int k = 0, l = 0;
        
        while(l++ < listaA.length ){
            if(l == temp){
                arrRep[k++] = listaA[l];
            }
        }
        
        for(i = 0; i < arrRep.length ; i++){
            System.out.print(arrRep[i]+" ");
        }
        
  
}  
        
        
}
