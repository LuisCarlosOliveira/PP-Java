/*
 * @file: 
 * @author: Luis Oliveira <https://github.com/LuisCarlosOliveira>
 * @date
 * @brief
 */
package Enum;

/**
 *
 * @author Luis Oliveira <https://github.com/LuisCarlosOliveira>
 */
public enum ProgrammerType {
    
    JUNIOR, 
    SENIOR;
    
    @Override
    public String toString(){
        switch (this){
            case JUNIOR:
                return "Júnior";
            case SENIOR:
                return "Sénior";
            default:
                throw new IllegalArgumentException();
        }

    }
}

