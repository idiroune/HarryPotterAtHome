package com.isep.HarryPotter.Inventory.Spells;

import com.isep.HarryPotter.CharacterAndEnemy.Wizard;
import com.isep.HarryPotter.Initialisation.MakeCharacter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LearningSpellTest {
    private Wizard wizard;

    @BeforeEach
    void setUp() {
        List<String> spells = new ArrayList<>();
        List<String> potions = new ArrayList<>();
        String pet = "Hedwig";
        String woodCore = "Phoenix feather";
        wizard = new Wizard("Harry", "Gryffindor", spells, potions, pet, woodCore);
        MakeCharacter MakeCharacter = new MakeCharacter();
        MakeCharacter.makeCharacter(wizard);
    }

    @Test
    void learnSpellTest() throws InterruptedException {
        Wizard wizard = MakeCharacter.getWizard();

        // Mock user input
        String input = "Wingardium Leviosa\n";
        InputStream inputStream = new ByteArrayInputStream("Wingardium Leviosa\nWingardium Leviosa\nWingardium Leviosa\n".getBytes());
        System.setIn(inputStream);

        LearningSpell learningSpell = new LearningSpell("Wingardium Leviosa");
        learningSpell.learnSpell();

        // Check if spell has been added to learnt spells
        assertTrue(wizard.getLearntSpell().contains("Wingardium Leviosa"));
    }

    @Test
    void useSpellTest() {
        // Add spell to learnt spells
        wizard.getLearntSpell().add("Wingardium Leviosa");

        // Mock user input
        InputStream inputStream = new ByteArrayInputStream("1".getBytes());
        System.setIn(inputStream);

        LearningSpell learningSpell = new LearningSpell("Wingardium Leviosa");
        learningSpell.UseSpell();

        // Check if spell used has been set correctly
        assertEquals("Wingardium Leviosa", learningSpell.getSpellUsed());
    }
}
