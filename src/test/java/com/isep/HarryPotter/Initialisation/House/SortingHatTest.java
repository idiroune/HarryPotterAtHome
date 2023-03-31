package com.isep.HarryPotter.Initialisation.House;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortingHatTest {

        @Test
        void testSortingHat() {
                SortingHat sortingHat = new SortingHat();
                String[] expectedHouse = {"Gryffondor", "Poufsouffle", "Serdaigle", "Serpentard"};
                assertTrue(String.join(",", expectedHouse).contains(sortingHat.getRandomHouse()));
        }
}
