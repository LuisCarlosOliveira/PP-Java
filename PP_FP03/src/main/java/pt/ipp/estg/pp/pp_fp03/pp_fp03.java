/*
 * @file: 
 * @author: Luis Oliveira <https://github.com/LuisCarlosOliveira>
 * @date
 * @brief
 */
package pt.ipp.estg.pp.pp_fp03;

import java.lang.Math;

/**
 *
 * @author Luis Oliveira <https://github.com/LuisCarlosOliveira>
 */
public class pp_fp03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // EXERCICIO 1
        /*
        int original[][] = {{1, 3, 4}, {2, 4, 3}, {3, 4, 5}};
        int transp[][] = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                transp[i][j] = original[j][i];
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(transp[i][j] + " ");
            }

        }
         */
        // EXERCICIO 2
        /*
        
        
        int sum = 0;
        int arr[]= {7, 3, 4, 6, 28, 12};
        int arrTempPerf[] = new int[arr.length];
        int arrTempPrim[] = new int[arr.length];
        int countPerf = 0, countPrim = 0;
        int k = 0, l = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 1; j < arr[i]; j++){
                if(arr[i] % j ==0){
                    sum += j;
                } 
            }
            if(sum == arr[i]){
                arrTempPerf[k++] = arr[i];
                countPerf++;
            }
            if(sum == 1){
                arrTempPrim[l++] = arr[i];
                countPrim++;
            }
            sum =0;
        }
        
        int arrPerf[] = new int[countPerf];
        int arrPrim[] = new int[countPrim];
        
        for(int i = 0; i < countPerf; i++){
            arrPerf[i] = arrTempPerf[i];
            System.out.print(arrPerf[i] + ",");
        }
        
        System.out.println();
        
        for(int i = 0; i < countPrim; i++){
            arrPrim[i] = arrTempPrim[i];
            System.out.print(arrPrim[i] + ",");
        }

         */
        //EXERCICIO 3
        /*
        int mat[][] = {{1, 3, 2},
        {4, 5, 6},
        {10, 5, 8},
        {2, 3, 5}};

        System.out.println(mat.length);
        System.out.println(mat[0].length);
        int menor = mat[0][0], maior = 0, repetido = 0, temp;

        //array para contar ocorrencias
        int count[] = new int[mat[0].length * mat.length];

        temp = mat[0][0];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] > maior) {
                    maior = mat[i][j];
                }
                if (mat[i][j] < menor) {
                    menor = mat[i][j];
                }
                //se o indice do array aparecer, aumenta 1
                //https://stackoverflow.com/questions/18689632/2d-array-that-looks-for-the-most-repeated-number-within-the-array
                count[mat[i][j]]++;
                
            }
            System.out.println("Linha: " + i);
            System.out.println("maior " + maior);
            System.out.println("menor " + menor);

            maior = 0;
            menor = mat[i][0];

        }
        // procurar no array de ocurrencias o indice de maior valor
        //https://stackoverflow.com/questions/18689632/2d-array-that-looks-for-the-most-repeated-number-within-the-array
        int max = 0;
        int val = -1;
        for (int i = 0; i < count.length; i++) {
            System.out.print(count[i] + ",");
            if (count[i] > max) {
                max = count[i];
                val = i;
            }
        }
        
    System.out.println("\n" + val);
         */
        //Exercicio 4
        /*
        //passa string para int
        int graus = Integer.parseInt(args[0]);
        System.out.println(graus * (Math.PI/180));
         */
        //Exercicio 5
        /*
        double valor = Double.parseDouble(args[0]);
        
        if(args[1].equals('e') || args[1].equals('E')){
            valor *= 1.09;
        }else if(args[1].equals('d') || args[1].equals('D')){
            valor *= 0.92;
        }else{
            System.out.println("moeda invalida");
        }
        
        System.out.println(valor);
         */
        //Exercicio 6
        /*
        int centimos = Integer.parseInt(args[0]);
        
        System.out.println((double)centimos/100);
         */
        //Exercicio 7
        /*
        int val1 = 10;//Integer.parseInt(args[0]);
        int val2 = 4;//Integer.parseInt(args[1]);
        int divi =0;
        
        while(val1 >= val2){
            val1-= val2;
            divi++;
        }
        // val1 passa a ser o resto depois do while
        System.out.println(divi + " -- " + val1 );
         */
        

//Exercicio 8
        double valor;

        int doisEuros = 0;
        int umEuro = 0;
        int cinquentaCent = 0;
        int vinteCent = 0;
        int dezCent = 0;
        int cincoCent = 0;
        int doisCent = 0;
        int umCent = 0;
        //mais moedas

        valor = 20.40; // Double.parseDouble(args[0]);         // converter string recebida na linha de comandos em double

        if (valor >= 2) {
            doisEuros = (int) valor / 2;                         //valor é double, fazer casting para int para obter valor int
            valor = valor - (doisEuros * 2);
            System.out.println(valor);
            System.out.println(doisEuros + " moedas de 2 euros");

        }
        if (valor >= 1) {
            umEuro = (int) valor / 1;                         //valor é double, fazer casting para int para obter valor int
            System.out.println("Teste" + umEuro + " " + valor);
            valor = valor - (umEuro * 1);
            
            System.out.println(valor);
            System.out.println(umEuro + " moedas de 1 euro");

        }
        if (valor >= 0.5) {
            cinquentaCent = (int) (valor / 0.5);                    //valor e 0.5 são double, fazer casting para int em ambos
            valor = valor - (cinquentaCent * 0.5);
            System.out.println(valor);
            System.out.println(cinquentaCent + " moedas de 50 centimos");
        }
        if (valor >= 0.2) {
            vinteCent = (int) (valor / 0.2);                    //valor e 0.2 são double, fazer casting para int em ambos
            System.out.println(vinteCent);
            valor = valor - (vinteCent * 0.2);
            System.out.println(valor);
            System.out.println(vinteCent + " moedas de 20 centimos");
        }if (valor >= 0.1) {

            dezCent = (int) (valor / 0.1);                    //valor e 0.2 são double, fazer casting para int em ambos
            valor = valor - (dezCent * 0.1);
            System.out.println(valor);
            System.out.println(dezCent + " moedas de 10 centimos");
        }if (valor >= 0.05) {
            cincoCent = (int) (valor / 0.05);                    //valor e 0.2 são double, fazer casting para int em ambos
            valor = valor - (cincoCent * 0.05);
            System.out.println(valor);
            System.out.println(cincoCent + " moedas de 5 centimos");
        }
    }

}


