/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecoleapplication;

/**
 *
 * @author hp
 */
public class EcoleApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Ecole ecole = new Ecole ("Ecole de Musique");
       ecole.ajouterGroupe("S101", "Saxophone débutant");
       ecole.ajouterGroupe("C301", "Cornemuse anvancée");
       ecole.afficherGroupes();
       
       
    }
    
}
