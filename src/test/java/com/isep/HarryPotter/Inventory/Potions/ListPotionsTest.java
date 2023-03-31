package com.isep.HarryPotter.Inventory.Potions;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListPotionsTest {

    @Test
    void testGetPotions() {
        ListPotions listPotions = new ListPotions();
        listPotions.getPotions().addAll(Arrays.asList("Potion1", "Potion2", "Potion3"));
        assertEquals(Arrays.asList("Potion1", "Potion2", "Potion3"), listPotions.getPotions());
    }

    @Test
    void testGetPotionsEmpty() {
        ListPotions listPotions = new ListPotions();
        assertEquals(new ArrayList<>(), listPotions.getPotions());
    }
}
