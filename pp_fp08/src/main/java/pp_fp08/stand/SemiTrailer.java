/*
 * @file: 
 * @author: Luis Oliveira <https://github.com/LuisCarlosOliveira>
 * @date
 * @brief
 */
package pp_fp08.stand;

/**
 *
 * @author Luis Oliveira <https://github.com/LuisCarlosOliveira>
 */
public class SemiTrailer extends Trailer {
    protected int spareTyreNumber;
    
    public SemiTrailer(int axesNumber, int load, int spareTyreNumber){
        super(axesNumber, load);
        this.spareTyreNumber = spareTyreNumber;
    }
    
    public SemiTrailer(int load, int spareTyreNumber){
        super(load);
        this.spareTyreNumber = spareTyreNumber;
        this.axesNumber = 2;
    }

    /**
     * @return the spareTyreNumber
     */
    public int getSpareTyreNumber() {
        return spareTyreNumber;
    }

    /**
     * @param spareTyreNumber the spareTyreNumber to set
     */
    public void setSpareTyreNumber(int spareTyreNumber) {
        this.spareTyreNumber = spareTyreNumber;
    }

    @Override
    public String toString() {
        return "SemiTrailer{"+ "axesNumber=" + axesNumber + ", load=" + load + 
                ", spareTyreNumber=" + spareTyreNumber + '}';
    }
    
}
