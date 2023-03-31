package com.isep.HarryPotter.Initialisation.House;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HouseTest {

     @Test
     void testHouse() {
          House house = new House();
          String[] expectedHouse = {"Gryffondor", "Poufsouffle", "Serdaigle", "Serpentard"};
          assertArrayEquals(expectedHouse, house.getHouse());
     }
}

