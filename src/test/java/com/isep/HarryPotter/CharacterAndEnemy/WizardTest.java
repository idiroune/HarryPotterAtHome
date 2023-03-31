package com.isep.HarryPotter.CharacterAndEnemy;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WizardTest {

    @Test
    public void testWizardCreation() {
        String wizardName = "Harry Potter";
        List<String> spells = new ArrayList<>();
        spells.add("Expelliarmus");
        List<String> potions = new ArrayList<>();
        potions.add("Philtre Revigorant");
        String house = "Gryffindor";
        String pet = "Hedwig";
        String woodCore = "Phoenix feather";

        Wizard wizard = new Wizard(wizardName, house, spells, potions, pet, woodCore);

        assertEquals(wizardName, wizard.getWizardName());
        assertEquals(house, wizard.getHouse());
        assertEquals(pet, wizard.getPet());
        assertEquals(woodCore, wizard.getWoodCore());
        assertEquals(1, wizard.getLearntSpell().size());
        assertEquals(1, wizard.getPotions().size());
    }

    @Test
    public void testWizardStatutUpdate() throws InterruptedException {
        String wizardName = "Ron Weasley";
        String house = "Gryffindor";
        String pet = "Scabbers";
        String woodCore = "Willow";

        Wizard wizard = new Wizard(wizardName, house, List.of("Wingardium Leviosa"), List.of("Veritaserum"), pet, woodCore);

        int basicHealth = wizard.getWizardHealth();
        int basicAccuracy = wizard.getWizardAccuracy();

        String input = "1\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        wizard.UpdateStatut();

        assertEquals(17, wizard.getBasicWizardAdditionalDamage());
        assertEquals(10, wizard.getBasicWizardDamage());

        // Check that the updated stat is consistent with the chosen option
        if (wizard.getBonusHealth() > 0) {
            assertEquals(basicHealth + wizard.getBonusHealth(), wizard.getWizardHealth());
        } else if (wizard.getBonusAccuracy() > 0) {
            assertEquals(basicAccuracy + wizard.getBonusAccuracy(), wizard.getWizardAccuracy());
        }
    }
}