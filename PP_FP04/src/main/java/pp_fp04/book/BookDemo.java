/*
 * @file: 
 * @author: Luis Oliveira <https://github.com/LuisCarlosOliveira>
 * @date
 * @brief
 */
package pp_fp04.book;

/**
 *
 * @author Luis Oliveira <https://github.com/LuisCarlosOliveira>
 */
public class BookDemo {

    /**
     * @param args the command line arguments
     */
    
    //static Book book1;
    public static void main(String[] args) {
        // TODO code application logic here
        Book book1 = null;
        
        book1.title = new char[]{'L', 'i', 'v', 'r', 'o'};
        book1.editor = new char[]{'L', 'e', 'i', 'a'};
        book1.year = 1991;
        book1.rate = new int[]{7, 8, 7};
        
        
        System.out.println(book1.title);
        System.out.println(book1.editor);
        System.out.println(book1.authors.number1Codigo);
        System.out.println(book1.authors.number1Name);
        System.out.println(book1.authors.number2Codigo);
        System.out.println(book1.authors.number2Name);
        System.out.println(book1.year);
        System.out.println((book1.rate[0]+book1.rate[1]+book1.rate[2])/3);
       
        
        
        
    }
    
}
