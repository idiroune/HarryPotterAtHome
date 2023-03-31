package com.isep.HarryPotter.Inventory.Potions;

import com.isep.HarryPotter.CharacterAndEnemy.Wizard;
import com.isep.HarryPotter.Initialisation.MakeCharacter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SomethingWithPotionsTest {

    @BeforeEach
    public void setUp() {
        // create a mock Wizard object
        List<String> spells = new ArrayList<>();
        List<String> potions = new ArrayList<>();
        String pet = "Hedwig";
        String woodCore = "Phoenix feather";
        Wizard wizard = new Wizard("Harry Potter", "Gryffindor", spells, potions, pet, woodCore);
        MakeCharacter MakeCharacter = new MakeCharacter();
        MakeCharacter.makeCharacter(wizard);
    }

    @Test
    public void testMakePotion() throws InterruptedException {
        Wizard wizard = MakeCharacter.getWizard();

        // set the input stream to simulate user input
        String input = "1\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        SomethingWithPotions potion = new SomethingWithPotions();
        potion.MakePotion();

        // verify that the potion was created and added to the wizard's inventory
        assertEquals("Philtre Revigorant", wizard.getPotions().get(0));
    }

    @Test
    public void testUsePotion() {
        Wizard wizard = MakeCharacter.getWizard();

        // add a health potion to the wizard's inventory
        wizard.getPotions().add("Philtre Revigorant");

        // set the input stream to simulate user input
        String input = "1\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        SomethingWithPotions potion = new SomethingWithPotions();
        potion.UsePotion();

        // verify that the wizard's health has been increased
        assertEquals(60, wizard.getWizardHealth());
    }
}
