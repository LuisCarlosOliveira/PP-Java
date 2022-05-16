/*
 * @file: 
 * @author: Luis Oliveira <https://github.com/LuisCarlosOliveira>
 * @date
 * @brief
 */
package pp_fp05.cd;

/**
 *
 * @author Luis Oliveira <https://github.com/LuisCarlosOliveira>
 */
public class Track {
    
    private final int NR_AUTHORS = 5;
    protected int nrFaixa;
    protected String nomeFaixa;
    protected int duracao;
    //protected String autor;
    protected Author[] authors;
    
    
    public Track( int tempNrFaixa, String tempNomeFaixa, int tempDuracao/*, String tempAutor*/){
        nrFaixa = tempNrFaixa;
        nomeFaixa = tempNomeFaixa;
        duracao = tempDuracao;
        //autor = tempAutor;
        authors = new Author[NR_AUTHORS];
    }
    
}
