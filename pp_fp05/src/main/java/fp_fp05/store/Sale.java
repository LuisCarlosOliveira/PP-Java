/*
 * @file: 
 * @author: Luis Oliveira <https://github.com/LuisCarlosOliveira>
 * @date
 * @brief
 */
package fp_fp05.store;
//package pp_fp05.cd;

import pp_fp05.cd.CD;

/**
 *
 * @author Luis Oliveira <https://github.com/LuisCarlosOliveira>
 */
public class Sale {

    protected int id;
    private static int count = 1;
    protected String date;
    protected CD[] cds;
    protected double finalPrice = 0;

    public Sale(String date, CD[] cds) {
        this.id = this.count++;
        //this.cds = new CD[10]; nao e preciso iniciar pois estou a apontar para objecto
        this.cds = cds;
        this.date = date;
        int nrCDs = this.cds.length;
        for (int i = 0; i < nrCDs; i++) {
            //if(this.cds[i] != null){ nao é preciso 
            this.finalPrice += this.cds[i].price;
            //}
        }
    }
    
    

}
