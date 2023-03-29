package org.example;

import java.util.Scanner;

public class SomethingWithPotions extends AbstractPotion {

    public void MakePotion() {
        Wizard wizard = MakeCharacter.getWizard();
        Scanner scanner = new Scanner(System.in);
        boolean ok = false;

        System.out.println("Quelle potion voulez-vous fabriquer ?");
        do {
            System.out.println("""
                    1. Potion de soin
                    2. Potion de force
                    3. Potion de precision""");

            if (scanner.hasNextInt()) {

                int choix = scanner.nextInt();

                switch (choix) {
                    case 1 -> {
                        wizard.getPotions().add("Potion de soin");
                        System.out.println("La potion de santé a été ajoutée à vos potions en possession.");
                        ok = true;
                    }
                    case 2 -> {
                        wizard.getPotions().add("Potion de force");
                        System.out.println("La potion de force a été ajoutée à vos potions en possession.");
                        ok = true;
                    }
                    case 3 -> {
                        wizard.getPotions().add("Potion de precision");
                        System.out.println("La potion de precision a été ajoutée à vos potions en possession.");
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
    }

    public void UsePotion() {
        Wizard wizard = MakeCharacter.getWizard();
        Scanner scanner = new Scanner(System.in);

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
                    System.out.println("Vous avez utilisé la potion " + potion + " et elle a été supprimée de vos potions en possession.");
                    switch (potion) {
                        case "Potion de soin" ->
                                wizard.setWizardHealth(wizard.getWizardHealth() + (healthPotion * wizard.getPotionEfficacity()));
                        case "Potion de force" ->
                                wizard.setWizardDamage(wizard.getWizardDamage() + (damagePotion * wizard.getPotionEfficacity()));
                        case "Potion de precision" ->
                                wizard.setWizardAccuracy(wizard.getWizardAccuracy() + (accuracyPotion * wizard.getPotionEfficacity()));
                    }
                } else {
                    System.out.println("En cherchant une potion qui n'existe pas tu as perdu du temps !");
                }
            } else {
                System.out.println("En cherchant une potion qui n'existe pas tu as perdu du temps !");
            }
        }
    }
}
