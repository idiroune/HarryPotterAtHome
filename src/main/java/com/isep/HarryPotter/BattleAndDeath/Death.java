package com.isep.HarryPotter.BattleAndDeath;

import com.isep.HarryPotter.CharacterAndEnemy.Wizard;
import com.isep.HarryPotter.Initialisation.MakeCharacter;

public class Death {

    private final String reason;

    public Death(String reason) {
        this.reason = reason;
    }

    public void WizardDeath() throws InterruptedException{
        Wizard wizard = MakeCharacter.getWizard();

        switch (reason){
            case "PV" ->{
                System.out.println(wizard.getWizardName() + " tes forces sont arrivées à bout...");
                Thread.sleep(2000);
                System.out.println("Tu vois la prochain attaque arriver sans avoir la volonté de l'esquiver.");
            }
            case "WrongSpell" ->{
                System.out.println(wizard.getWizardName() + " non ! Il n'y a rien qui vous permet d'utiliser ce sort !!");
                Thread.sleep(2000);
                System.out.println("L'ennemi profite de votre erreur pour vous lancer une attaque dévastatrice.");
                Thread.sleep(2000);
                System.out.println("Tu n'as pas le temps d'esquiver la prochaine attaque, ni d'en lancer une.");
            }
        }
        Thread.sleep(2000);
        System.out.println("Tu fermes les yeux et acceptes ton dur destin.");
        Thread.sleep(3000);
        System.out.println("Mmh ?");
        Thread.sleep(2000);
        System.out.println("Vous entendez un étrange bruit venant de votre poitrine.");
        Thread.sleep(2000);
        System.out.println("C'est votre pendentif.");
        Thread.sleep(2000);
        System.out.println("Le temps s'est arrêté ?");

        System. exit(0);
    }
}
