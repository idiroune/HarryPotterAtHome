package com.isep.HarryPotter.CharacterAndEnemy;

import com.isep.HarryPotter.Initialisation.Color;

import java.util.List;
import java.util.Scanner;

public class Wizard extends Character {

    public Wizard(String wizardName, String house, List<String> learntSpell, List<String> potions , String pet, String woodCore){

        this.wizardName = wizardName;
        this.house = house;
        this.learntSpell = learntSpell;
        this.potions = potions;
        this.pet = pet;
        this.woodCore = woodCore;

        setWizardDamage(getBasicWizardDamage() + getBonusDamage());
        setWizardAdditionalDamage(getBasicWizardAdditionalDamage() + getBonusBonusDamage());
        setWizardHealth(getBasicWizardHealth() + getBonusHealth());
        setWizardAccuracy(getBasicWizardAccuracy() + getBonusAccuracy());

        switch (house) {
            case "Poufsouffle" -> setPotionEfficacy(2);
            case "Serpentard" -> setWizardAdditionalDamage(getBasicWizardAdditionalDamage());
            case "Gryffondor" -> setWizardHealth(getBasicGryffondorHealth());
            case "Serdaigle" -> setWizardAccuracy(getBasicSerdaigleAccuracy());
        }

    }
    void ResetWizardStatut(){

        setWizardDamage(getBasicWizardDamage() + getBonusDamage());
        setWizardAdditionalDamage(getBasicWizardAdditionalDamage() + getBonusBonusDamage());
        setWizardHealth(getBasicWizardHealth() + getBonusHealth());
        setWizardAccuracy(getBasicWizardAccuracy() + getBonusAccuracy());

        switch (house) {
            case "Serpentard" -> setWizardAdditionalDamage(getBasicWizardAdditionalDamage() + getBonusBonusDamage());
            case "Gryffondor" -> setWizardHealth(getBasicGryffondorHealth() + getBonusHealth());
            case "Serdaigle" -> setWizardAccuracy(getBasicSerdaigleAccuracy() + getBonusAccuracy());
        }
    }

    public void UpdateStatut() throws InterruptedException{

        Scanner scanner = new Scanner(System.in);

        String update;

        System.out.println("\nAprès un tel combat vous sentez avoir acquis une certaine expérience... vous pouvez augmenter une compétence !");
        Thread.sleep(2000);
        System.out.println("\nQuelle compétence voulez-vous améliorer ?");

        do {
            Thread.sleep(1000);
            System.out.println("""
                    1. Votre puissance d'attaque ?
                    2. Vos points de vie ?
                    3. Votre précision ?""");

            update = scanner.nextLine();

            switch (update) {
                case "1" -> {
                    setBonusDamage(getBonusDamage() + 2);
                    setBonusBonusDamage(getBonusBonusDamage() + 5);
                    System.out.println(Color.ROUGE + "Vous obtenez plus de dégâts !" + Color.RESET);
                }
                case "2" -> {
                    setBonusHealth(getBonusHealth() + 10);
                    System.out.println(Color.VERT + "Vous obtenez plus de vie !" + Color.RESET);
                }
                case "3" -> {
                    setBonusAccuracy(getBonusAccuracy() + 2);
                    System.out.println(Color.JAUNE + "Vous obtenez plus de précision !" + Color.RESET);
                }
            }
            if(!update.equals("1") && !update.equals("2") && !update.equals("3")){
                System.out.println("Vous ne voulez vraiment pas améliorer une compétence ?\n");
            }
        }while (!update.equals("1") && !update.equals("2") && !update.equals("3"));

        ResetWizardStatut();

        Thread.sleep(2000);

    }
}
