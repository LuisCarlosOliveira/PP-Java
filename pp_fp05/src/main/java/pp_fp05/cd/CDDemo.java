/*
 * @file: 
 * @author: Luis Oliveira <https://github.com/LuisCarlosOliveira>
 * @date
 * @brief
 */
package pp_fp05.cd;

import java.util.Scanner;

/**
 *
 * @author Luis Oliveira <https://github.com/LuisCarlosOliveira>
 */
public class CDDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Artist a1 = new Artist("Artista 1", "1977-03-04", "German");
        Artist[] artists = {a1};

        Track t1 = new Track(1, "Ho Hey", 90);
        System.out.println("Vendedor ou Gratuito?");
        String s = in.nextLine();
        if (s.equals("vendedor")) {
            t1.authors[0] = new Author("Jose", 30, "Felgas", 9999999, 55555555);
            t1.authors[1] = new Author("ANA", 85, "Lousada", 111111111, 2222222);
            //System.out.println("TESTE");
            //System.out.println(t1.authors[0].nomeAutor + "|" + t1.authors[0].nib);
        } else {
            t1.authors[0] = new Author("Manel", 29);
            t1.authors[1] = new Author("Carlos", 15);
            //System.out.println("TESTE");
            //System.out.println(t1.authors[0].nomeAutor + "|" + t1.authors[0].idadeAutor);
        }

        Track t2 = new Track(2, "Stubborn Love", 105);
        System.out.println("Vendedor ou Gratuito?");
        s = in.nextLine();
        if (s.equals("vendedor")) {
            t2.authors[0] = new Author("Paul", 5, "Felgas", 9999999, 55555555);
            //System.out.println("TESTE");
            //System.out.println(t2.authors[0].nomeAutor + "|" + t2.authors[0].nib);
        } else {
            t2.authors[0] = new Author("A", 29);
            t2.authors[1] = new Author("B", 15);
            //System.out.println("TESTE");
            //System.out.println(t2.authors[0].nomeAutor + "|" + t2.authors[0].idadeAutor);
        }

        /*
        versão com limite 15 faixas
        CD cd = new CD("The Lumineers", "The Lumineers", 2012, "Dualtone Records", 195, artists);
         */
        CD cd = new CD(20, "The Lumineers", "The Lumineers", 2012, "Dualtone Records", 195, artists, 30.99);
        cd.tracks[0] = t1;
        cd.tracks[14] = t2;
        /*teste
        System.out.println();
        System.out.println(cd.tracks[0].authors[0].nomeAutor);
        System.out.println(cd.tracks[0].authors[1].nomeAutor);
        System.out.println();
         */

        System.out.println("Nome do cd: " + cd.nomeCD);
        System.out.println("Ano de lançamento: " + cd.ano);
        System.out.println("Editora: " + cd.editora);
        System.out.println("Preço: " + cd.price);

        int nTracks = cd.tracks.length;
        for (int i = 0; i < nTracks; i++) {
            if (cd.tracks[i] != null) {
                Track t = cd.tracks[i];
                System.out.println("Musica numero: " + t.nrFaixa + " com titulo: " + t.nomeFaixa);
                System.out.println("Duraçao (em segundos): " + t.duracao);
                int nrAuthors = cd.tracks[i].authors.length;
                for (int j = 0; j < nrAuthors; j++) {
                    if (cd.tracks[i].authors[j] != null) {
                        System.out.println("Autor numero: " + (j + 1));
                        System.out.println("Nome: " + cd.tracks[i].authors[j].nomeAutor);
                    }
                }
            }
        }

    }

}
