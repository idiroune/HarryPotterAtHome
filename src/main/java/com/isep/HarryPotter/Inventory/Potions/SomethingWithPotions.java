package com.isep.HarryPotter.Inventory.Potions;

import com.isep.HarryPotter.Initialisation.MakeCharacter;
import com.isep.HarryPotter.CharacterAndEnemy.Wizard;

import java.util.Scanner;

public class SomethingWithPotions extends AbstractPotion {

    public void MakePotion() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        Wizard wizard = MakeCharacter.getWizard();

        boolean ok = false;

        Thread.sleep(2000);
        System.out.println("\nProfesseur :");

        System.out.println("\n« Bienvenu à votre cours de potions !");
        Thread.sleep(2000);
        System.out.println("Aujourd'hui nous allons préparer ensemble une potion.");
        Thread.sleep(2000);
        System.out.println("\nQuelle potion voulez-vous fabriquer ?");
        do {
            System.out.println("""
                    1. Philtre Revigorant
                    2. Solution de Force
                    3. Potion d'Aiguise-Méninges""");

            if (scanner.hasNextInt()) {

                int choix = scanner.nextInt();

                switch (choix) {
                    case 1 -> {
                        wizard.getPotions().add("Philtre Revigorant");
                        System.out.println("En voilà un beau philtre !");
                        Thread.sleep(2000);
                        System.out.println("== Le Philtre Revigorant a été ajoutée à vos potions en possession ==");
                        ok = true;
                    }
                    case 2 -> {
                        wizard.getPotions().add("Solution de Force");
                        System.out.println("En voilà une belle solution !");
                        Thread.sleep(2000);
                        System.out.println("== La Solution de Force a été ajoutée à vos potions en possession ==");
                        ok = true;
                    }
                    case 3 -> {
                        wizard.getPotions().add("Potion d'Aiguise-Méninges");
                        System.out.println("En voilà une belle potion !");
                        Thread.sleep(2000);
                        System.out.println("== La Potion d'Aiguise-Méninges a été ajoutée à vos potions en possession ==");
                        ok = true;
                    }
                }
                if (!ok) {
                    System.out.println(wizard.getWizardName() + "... soyons sérieux, je te demande de choisir parmi :");

                }
            } else {
                System.out.println(wizard.getWizardName() + "... soyons sérieux, je te demande de choisir parmi :");
                scanner.nextLine();
            }
        } while (!ok);

        Thread.sleep(2000);
        System.out.println("Je sais à quel point il est compliqué de consommer une potion unique que l'on créé, mais si vous vous sentez trop en danger n'hésitez pas !");
        Thread.sleep(3000);
        System.out.println("Voilà ça sera tout ! On se retrouve pour le prochain cours, d'ici là prenez soin de vous ! »\n");
        Thread.sleep(2000);
    }

    public void UsePotion() {
        Scanner scanner = new Scanner(System.in);

        Wizard wizard = MakeCharacter.getWizard();

        if (wizard.getPotions().isEmpty()) {
            System.out.println("Vous n'avez aucune potion en votre possession...");
        } else {
            System.out.println("Voici la liste de vos potions en possession :");
            for (int i = 0; i < wizard.getPotions().size(); i++) {
                System.out.println((i + 1) + ". " + wizard.getPotions().get(i));
            }

            if (scanner.hasNextInt()) {

                int choix = scanner.nextInt();

                if (choix > 0 && choix <= wizard.getPotions().size()) {
                    String potion = wizard.getPotions().get(choix - 1);
                    wizard.getPotions().remove(choix - 1);
                    System.out.print("Vous prenez une longue gorgée de votre " + potion + " vous attribuant tous ses bienfaits.");
                    switch (potion) {
                        case "Philtre Revigorant" ->
                                wizard.setWizardHealth(wizard.getWizardHealth() + (healthPotion * wizard.getPotionEfficacy()));
                        case "Solution de Force" ->
                                wizard.setWizardDamage(wizard.getWizardDamage() + (damagePotion * wizard.getPotionEfficacy()));
                        case "Potion d'Aiguise-Méninges" ->
                                wizard.setWizardAccuracy(wizard.getWizardAccuracy() + (accuracyPotion * wizard.getPotionEfficacy()));
                    }
                } else {
                    System.out.print("En cherchant une potion qui n'existe pas tu as perdu du temps !");
                }
            } else {
                System.out.print("Ca n'est pas le moment de jouer.");
            }
        }
    }
}
