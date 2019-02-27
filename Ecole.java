/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecoleapplication;

import java.util.HashMap;

/**
 *
 * @author hp
 */
public class Ecole {

    HashMap<String, Groupe> groupes;
    HashMap<String, Prof> profs;
    HashMap<String, Eleve> eleves;
    private Object goupes;

    public Ecole(String nomEcole) {
        groupes = new HashMap<>();
        profs = new HashMap<>();
        eleves = new HashMap<>();
    }

    public void ajouterGroupe(String id, String nomGroupe) {
        Groupe groupe = new Groupe(id, nomGroupe);
        groupes.put(id, groupe);
    }
    public void afficherGroupes() {
        for (Groupe groupe : groupes) {
            System.out.println(groupe);
        }
    }
    
    
     public void ajouterProf(String nom, String prenom) {
        Prof prof = new Prof(nom, prenom);
        profs.put(nom, prof);
    }

    public void afficherProf() {
        for (Prof prof : profs) {
            System.out.println(prof);
        }
    }
    
     public void ajouterEleve(String nom, String prenom) {
        Eleve eleve = new Eleve(nom, prenom);
        eleves.put(nom, eleve);
    }

    public void afficherEleve() {
        for (Eleve eleve : eleves) {
            System.out.println(eleve);
        }
    }
    public String affecterEleve(String idEleve, String idGroupe){
      if(eleves.containsValue(goupes)==null){
        goupes.put(idEleve, idGroupe);
      }
      else{
          groupes.remove(idEleve);
          groupes.add(idEleve, idGroupe);
      }
        return "eleve " +idEleve +"ajouter dans " +idGroupe;
    }
}
