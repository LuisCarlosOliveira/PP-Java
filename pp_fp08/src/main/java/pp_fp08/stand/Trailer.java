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
public class Trailer {
    protected int axesNumber;
    protected int load;

    public Trailer(int load) {
        this.axesNumber = 2;
        this.load = load;
    }
    
    public Trailer(int load, int axesNumber) {
        this.axesNumber = axesNumber;
        this.load = load;
    }

    /**
     * @return the axesNumber
     */
    public int getAxesNumber() {
        return axesNumber;
    }

    /**
     * @param axesNumber the axesNumber to set
     */
    public void setAxesNumber(int axesNumber) {
        this.axesNumber = axesNumber;
    }

    /**
     * @return the load
     */
    public int getLoad() {
        return load;
    }

    /**
     * @param load the load to set
     */
    public void setLoad(int load) {
        this.load = load;
    }

    @Override
    public String toString() {
        return "Trailer{" + "axesNumber=" + axesNumber + ", load=" + load + '}';
    }
    
}
