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
public class IdProvider {

    protected  IdProvider instance = null;

    public IdProvider getInstance() {
        if (instance == null) {
            instance = new IdProvider();
        }

        return instance;
    }

    private int nextID = 0;

    public int getUniqueId() {
        if (nextID < 0) {
            throw new IllegalStateException("Out of IDs!");
        }

        int uniqueId = nextID;
        nextID++;

        return uniqueId;
    }
}
