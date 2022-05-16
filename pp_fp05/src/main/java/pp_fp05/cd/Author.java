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
public class Author {

    protected String nomeAutor;
    protected int idadeAutor;
    protected String morada;
    protected int nif;
    protected int nib;

    //vendedor
    public Author(String nomeAutor, int idadeAutor, String morada, int nif, int nib) {
        this.nomeAutor = nomeAutor;
        this.idadeAutor = idadeAutor;
        this.morada = morada;
        this.nif = nif;
        this.nib = nib;

    }

    //gratuito
    public Author(String nomeAutor, int idadeAutor) {
        this.nomeAutor = nomeAutor;
        this.idadeAutor = idadeAutor;

    }
}
