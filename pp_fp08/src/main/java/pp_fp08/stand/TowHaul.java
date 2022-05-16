/*
 * @file: 
 * @author: Luis Oliveira <https://github.com/LuisCarlosOliveira>
 * @date
 * @brief
 */
package pp_fp08.stand;
import Enumeration.TrailerType;

/**
 *
 * @author Luis Oliveira <https://github.com/LuisCarlosOliveira>
 */
public class TowHaul extends Trailer {
    protected TrailerType trailer;
    
    public TowHaul(int axesNumber, int load, TrailerType trailer){
        super(axesNumber, load);
        this.trailer = trailer;
    }
    
    public TowHaul(int load, TrailerType trailer){
        super(load);
        this.trailer = trailer;
        this.axesNumber = 2;
    }
    /**
     * @return the trailer
     */
    public TrailerType getTrailer() {
        return trailer;
    }

    /**
     * @param trailer the trailer to set
     */
    public void setTrailer(TrailerType trailer) {
        this.trailer = trailer;
    }

    @Override
    public String toString() {
        return "TowHaul{"+ "axesNumber=" + axesNumber + ", load=" + load + 
                ", trailer=" + trailer + '}';
    }
    
}
