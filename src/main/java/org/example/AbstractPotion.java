package org.example;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class AbstractPotion {

    @Getter protected int damagePotion = 5;
    @Getter protected int healthPotion = 10;
    @Getter protected int accuracyPotion = 3;
}
class ListPotions extends AbstractPotion {
    @Getter protected List<String> potions = new ArrayList<>();
}


class SomethingWithPotions extends AbstractPotion {

    public void MakePotion() {
        Wizard wizard = MakeCharacter.getWizard();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quelle potion voulez-vous fabriquer ?\n" +
                "1. Potion de santé\n" +
                "2. Potion de force\n" +
                "3. Potion de precision");
        int choix = scanner.nextInt();

        switch (choix) {
            case 1:
                wizard.getPotions().add("Potion de soin");
                System.out.println("La potion de santé a été ajoutée à vos potions en possession.");
                break;
            case 2:
                wizard.getPotions().add("Potion de force");
                System.out.println("La potion de force a été ajoutée à vos potions en possession.");
                break;
            case 3:
                wizard.getPotions().add("Potion de precision");
                System.out.println("La potion de precision a été ajoutée à vos potions en possession.");
                break;
        }
    }

    public void UsePotion() {
        Wizard wizard = MakeCharacter.getWizard();
        Scanner sc = new Scanner(System.in);
        System.out.println("Voici la liste de vos potions en possession :");
        for (int i = 0; i < wizard.getPotions().size(); i++) {
            System.out.println((i + 1) + ". " + wizard.getPotions().get(i));
        }

        System.out.println("Quelle potion voulez-vous utiliser ?");
        int choix = sc.nextInt();

        if (choix > 0 && choix <= wizard.getPotions().size()) {
            String potion = wizard.getPotions().get(choix - 1);
            wizard.getPotions().remove(choix - 1);
            System.out.println("Vous avez utilisé la potion " + potion + " et elle a été supprimée de vos potions en possession.");
            if (potion.equals("Potion de soin")){
                wizard.setWizardHealth(wizard.getWizardHealth() + (healthPotion * wizard.getPotionEfficacity()));
            }
            else if (potion.equals("Potion de force")){
                wizard.setWizardDamage(wizard.getWizardDamage() + (damagePotion * wizard.getPotionEfficacity()));
            }
            else if (potion.equals("Potion de precision")){
                wizard.setWizardAccuracy(wizard.getWizardAccuracy() + (accuracyPotion * wizard.getPotionEfficacity()));
            }
        } else {
            System.out.println("Choix invalide.");
        }
    }
}
