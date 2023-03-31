package com.isep.HarryPotter.BattleAndDeath;

import com.isep.HarryPotter.CharacterAndEnemy.Wizard;
import com.isep.HarryPotter.Initialisation.MakeCharacter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DeathTest {
    private Wizard wizard;
    private final InputStream systemIn = System.in;

    @BeforeEach
    public void setUp() {
        // create a mock Wizard object
        List<String> spells = new ArrayList<>();
        List<String> potions = new ArrayList<>();
        String pet = "Hedwig";
        String woodCore = "Phoenix feather";
        wizard = new Wizard("Harry", "Gryffindor", spells, potions, pet, woodCore);
        MakeCharacter MakeCharacter = new MakeCharacter();
        MakeCharacter.makeCharacter(wizard);
    }

    @Test
    public void testWizardDeath() throws InterruptedException {

        Death death = new Death("PV");

        // Capture console output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Call WizardDeath method
        death.WizardDeath();

        // Check console output
        String expectedOutput = wizard.getWizardName() + " tes forces sont arrivées à bout...\n" +
                "Tu vois la prochain attaque arriver sans avoir la volonté de l'esquiver.\n" +
                "Tu fermes les yeux et acceptes ton dur destin.\n" +
                "Mmh ?\n" +
                "Vous entendez un étrange bruit venant de votre poitrine.\n" +
                "C'est votre pendentif.\n" +
                "Le temps s'est arrêté ?";
        assertEquals(expectedOutput, outContent.toString());
    }
}
