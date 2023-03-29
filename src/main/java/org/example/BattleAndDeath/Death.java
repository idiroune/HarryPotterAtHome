package org.example.BattleAndDeath;

import org.example.MakeCharacter;
import org.example.Wizard;

public class Death {

    private final String reason;

    public Death(String reason) {
        this.reason = reason;
    }

    public void WizardDeath() throws InterruptedException{
        Wizard wizard = MakeCharacter.getWizard();

        switch (reason){
            case "PV" ->{
                System.out.println(wizard.getWizardName() + "t'es forcent sont arrivées à bout...");
                Thread.sleep(2000);
                System.out.println("Tu vois la prochain attaque arriver sans avoir la volonté de l'esquiver.");
                Thread.sleep(2000);
                System.out.println("Tu fermes les yeux et acceptes ton dur destin.");
            }
            case "WrongSpell" ->{
                System.out.println(wizard.getWizardName() + "t'esforcent sont arrivées à bout...");
                Thread.sleep(2000);
                System.out.println("Tu vois la prochain attaque arriver sans avoir la volonté de l'esquiver.");
                Thread.sleep(2000);
                System.out.println("Tu fermes les yeux et acceptes ton dur destin.");
            }
        }

        Thread.sleep(3000);
        System.out.println("Mmh ?");
        Thread.sleep(2000);
        System.out.println("Vous entendez un étrange bruit venant de votre poitrine.");
        Thread.sleep(2000);
        System.out.println("");
        Thread.sleep(2000);
        System.out.println("Le temps s'est arrêté ?");

        System. exit(0);
    }
}
