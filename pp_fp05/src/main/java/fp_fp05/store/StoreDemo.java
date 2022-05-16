/*
 * @file: 
 * @author: Luis Oliveira <https://github.com/LuisCarlosOliveira>
 * @date
 * @brief
 */
package fp_fp05.store;
package pp_fp05.cd;

import pp_fp05.cd.Artist;
import pp_fp05.cd.CD;


/**
 *
 * @author Luis Oliveira <https://github.com/LuisCarlosOliveira>
 */
public class StoreDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Artist a1 = new Artist("Artista 1", "1977-03-04", "German");
        Artist[] artists = {a1};
        
        CD cd1 = new CD(20, "The Lumineers", "The Lumineers/*", 2012, "Dualtone Records", 195, artists, 30.99);
        CD cd2 = new CD(10, "A", "B", 2012, "C", 195, artists, 30.99);
        CD cd3 = new CD(20, "R", "T", 2012, "G", 195, artists, 30.99);
        CD cd4 = new CD(20, "The Lumineers", "The Lumineers", 2012, "Dualtone Records", 195, artists, 10);
        CD cd5 = new CD(10, "A", "B", 2012, "C", 195, artists, 10);
        CD cd6 = new CD(20, "R", "T", 2012, "G", 195, artists, 10);
        
        CD[] cds1 = {cd1, cd2, cd3};
        CD[] cds2 = {cd4, cd5, cd6};
        
        Sale v1 = new Sale("2020-12-05", cds1);
        Sale v2 = new Sale("1991-13-04", cds2);
        
        System.out.println("Venda: " +  v1.id);
        System.out.println("Data: " + v1.date);
        System.out.println("Valor: " + v1.finalPrice + "€");
        System.out.println(v2.id);
        System.out.println(v2.date);
        System.out.println(v2.finalPrice);

    }
    
}
