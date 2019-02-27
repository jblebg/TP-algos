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
public class Groupe {
    public Groupe(String id, String nomGroupe){
        
    }
    
    @Override
    public String toString(){
       for (Groupe groupe : groupes.values()){
           System.out.println(groupe);
       }
        return "???";
    }
    
    public String groupe(){
       String x = System.out.println(ecole.groupe("S101"));
       return x;
    }
}
