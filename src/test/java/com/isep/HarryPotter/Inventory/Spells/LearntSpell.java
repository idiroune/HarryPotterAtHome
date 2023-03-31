package com.isep.HarryPotter.Inventory.Spells;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LearntSpellTest {

    @Test
    void testAddSpell() {
        LearntSpell learntSpell = new LearntSpell();
        learntSpell.getLearntSpells().add("Wingardium Leviosa");
        learntSpell.getLearntSpells().add("Accio");
        learntSpell.getLearntSpells().add("Expecto Patronum");
        assertEquals(3, learntSpell.getLearntSpells().size());
    }

}
