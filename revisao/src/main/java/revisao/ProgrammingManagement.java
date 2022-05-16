/*
 * @file: 
 * @author: Luis Oliveira <https://github.com/LuisCarlosOliveira>
 * @date
 * @brief
 */
package revisao;

/**
 *
 * @author Luis Oliveira <https://github.com/LuisCarlosOliveira>
 */
public class ProgrammingManagement {
    
    private int size;
    private Software[] workers = new Software[3];
    
    public ProgrammingManagement(){
        this.size = 0;
    }
    
    public void checkSize(){
        if(this.size == this.workers.length){
            Software[] temp = new Software[this.workers.length * 2];
            
            System.arraycopy(workers, 0, temp, 0, this.workers.length);
            workers = temp;
        }
    }
    
    public void addWorker( Software worker){
        checkSize();
        this.workers[size] = worker;
        this.size++;
    }
    
    public void removeWorker(Software worker){
        int index= -1;
        for(int i = 0; i < this.size; i++){
            if(this.workers.equals(worker)){
                index = i;
            }
        }
        
        if(index != -1){
            for(int i = index; i < this.size; i++){
                this.workers[i] = this.workers[i+1];
            }
            this.size--;
        }
    }
    
    public void printProjectManager(){
        int temp = 0;
        for(int i = 0; i < this.size; i++){
            if(this.workers[i] instanceof ProjectManager){
                System.out.println(this.workers[i].toString());
                System.out.println();
                temp++;
            }
        }
        if(temp ==0){
            System.out.println("Zero Project Managers");
        }
    }
    
}
