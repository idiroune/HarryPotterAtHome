package org.example;

import java.util.List;

class Wizard extends Character{


    public Wizard(String wizardName, String house, List<String> learntSpell, List<String> potions , String pet){

        this.wizardName = wizardName;
        this.house = house;
        this.learntSpell = learntSpell;
        this.potions = potions;
        this.pet = pet;

        setWizardDamage(getBasicWizardDamage() + getBonusDamage());
        setWizardAdditionalDamage(getBasicWizardAdditionalDamage() + getBonusBonusDamage());
        setWizardHealth(getBasicWizardHealth() + getBonusHealth());
        setWizardAccuracy(getBasicWizardAccuracy() + getBonusAccuracy());

        switch (house) {
            case "Poufsouffle" -> setPotionEfficacity(2);
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
}
