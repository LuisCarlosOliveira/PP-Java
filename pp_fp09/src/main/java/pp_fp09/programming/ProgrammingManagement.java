/*
 * @file: 
 * @author: Luis Oliveira <https://github.com/LuisCarlosOliveira>
 * @date
 * @brief
 */
package pp_fp09.programming;

/**
 *
 * @author Luis Oliveira <https://github.com/LuisCarlosOliveira>
 */
public class ProgrammingManagement {

    private Programmer[] programmers;
    private int count;

    public ProgrammingManagement(int size) {
        this.programmers = new Programmer[size];
        this.count = 0;
    }

    /**
     * @return the programmers
     */
    public Programmer[] getProgrammers() {
        return programmers;
    }

    /**
     * @param programmers the programmers to set
     */
    public void setProgrammers(Programmer[] programmers) {
        this.programmers = programmers;
    }

    /**
     * @return the count
     */
    public int getCount() {
        return count;
    }

    /**
     * @param count the count to set
     */
    public void setCount(int count) {
        this.count = count;

    }

    public boolean expandProgrammers() {
        if (getCount() == getProgrammers().length) {
            Programmer[] temp = new Programmer[getProgrammers().length * 2];
            System.arraycopy(programmers, 0, temp, 0, getProgrammers().length);
            setProgrammers(temp);
            return true;
        }
        return false;
    }

    public boolean addProgrammer(Programmer p) {
        expandProgrammers();
        this.programmers[getCount()] = p;
        setCount(getCount() + 1);
        return true;

    }

    public void printAllManagement() {
        for (int i = 0; i < getCount(); i++) {
            this.programmers[i].printInfo();
        }
    }

    public void printOnlyManagemers() {

        for (int i = 0; i < getCount(); i++) {

            if (this.programmers[i].getClass().getSimpleName().equals("ProjectManager")) {
                //https://stackoverflow.com/questions/6271417/java-get-the-current-class-name
                this.programmers[i].printInfo();
            }

        }
    }
}
