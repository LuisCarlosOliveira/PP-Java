/*
 * @file: 
 * @author: Luis Oliveira <https://github.com/LuisCarlosOliveira>
 * @date
 * @brief
 */
package pp_fp06.pizza_restaurant;

/**
 *
 * @author Luis Oliveira <https://github.com/LuisCarlosOliveira>
 */
public class Ementas {

    protected int nrEmentas;
    protected Ementa[] ementas;

    public Ementas(Ementa[] ementas) {
        this.nrEmentas = ementas.length;
        this.ementas = ementas;
    }

    public void activarEmenta(int ementaAActivar) {
        int count = 0;
        for (int i = 0; i < this.nrEmentas; i++) {
            if (this.ementas[i].status == false) {
                count++;
            }
        }
        if (count == this.nrEmentas) {
            this.ementas[ementaAActivar - 1].activateEmenta();
        } else {
            System.out.println("Ja há ementa activada");
        }
    }

}
