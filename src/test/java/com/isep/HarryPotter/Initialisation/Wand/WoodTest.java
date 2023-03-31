package com.isep.HarryPotter.Initialisation.Wand;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class WoodTest {
    @Test
    public void testRandomWood() {
        Wood wood = new Wood();
        String randomWood = wood.getRandomWood();
        assertTrue(randomWood.length() > 0);
    }

    @Test
    public void testPreposition() {
        Wood wood = new Wood();
        String preposition = wood.getPreposition();
        assertTrue(preposition.equals(" d'") || preposition.equals(" de "));
    }
}
