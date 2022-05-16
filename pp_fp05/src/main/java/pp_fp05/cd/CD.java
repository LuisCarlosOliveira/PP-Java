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
public class CD {

    /*versao com limitação 15
    private final int NR_FAIXAS = 15; */
    protected int nrFaixas;
    protected String nomeBanda;
    protected String nomeCD;
    protected int duracaoCD;
    protected int ano;
    protected String editora;
    protected Artist[] artists;
    protected Track[] tracks;
    public double price;

    public CD(int tempNrFaixas, String tempBanda, String tempCD, int tempAno, String tempEditora,
            int tempDuracao, Artist[] tempArtist, double tempPrice) {
        nrFaixas = tempNrFaixas;
        nomeBanda = tempBanda;
        nomeCD = tempCD;
        ano = tempAno;
        editora = tempEditora;
        duracaoCD = tempDuracao;
        //artists = new Artist[5];
        artists = tempArtist;
        tracks = new Track[nrFaixas];
        price = tempPrice;

    }

    public CD(int tempNrFaixas, String tempBanda, String tempCD, int tempAno, String tempEditora,
            int tempDuracao, Artist[] tempArtist) {
        nrFaixas = tempNrFaixas;
        nomeBanda = tempBanda;
        nomeCD = tempCD;
        ano = tempAno;
        editora = tempEditora;
        duracaoCD = tempDuracao;
        //artists = new Artist[5];
        artists = tempArtist;
        tracks = new Track[nrFaixas];

    }

}
