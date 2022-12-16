package be.technifutur.decouverte.lambda;

import be.technifutur.decouverte.poo.Jedi;
import be.technifutur.decouverte.poo.Soldat;

public class TestPersonnageScenario {

    public static void main(String[] args) {
        Soldat soldat = new Soldat("Léon");
        Jedi jedi = new Jedi("Luc");

        PersonnageScenario scenario = new PersonnageScenario(soldat, jedi);

        scenario.addScennette((h,p)->{
            h.afficheCamps();
            System.out.println("et moi ");
            p.afficheCamps();
        });
        //scenario.addScennette();


        scenario.run();
    }
}
