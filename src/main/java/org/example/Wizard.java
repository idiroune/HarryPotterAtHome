package org.example;

import java.util.List;
import java.util.Random;

class Wizard extends Character{


    public Wizard(String wizardName, String house, List<String> learntSpell, List<String> potions , String pet){

        this.wizardName = wizardName;
        this.house = house;
        this.learntSpell = learntSpell;
        this.potions = potions;
        this.pet = pet;

        if (house == "Poufsouffle") {
            setPotionEfficacity(2);

        } else if (house == "Serpentard") {
            setWizardDamage(20);
            setWizardBonusDamage(20);

        } else if (house == "Gryffondor") {
            setWizardHealth(80);

        } else if (house == "Serdaigle") {
            setWizardAccuracy(3);
        }

    }
    void ResetWizardStatut(){

        setWizardDamage(15);
        setWizardBonusDamage(15);
        setWizardHealth(50);
        setWizardAccuracy(1);

        if (house == "Serpentard") {
            setWizardDamage(20);
            setWizardBonusDamage(20);

        } else if (house == "Gryffondor") {
            setWizardHealth(80);

        } else if (house == "Serdaigle") {
            setWizardAccuracy(3);
        }
    }
}
