package com.isep.HarryPotter.Initialisation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PetTest {

    @Test
    void testPetEnum() {
        Pet cat = Pet.CAT;
        Pet rat = Pet.RAT;
        Pet owl = Pet.OWL;
        Pet toad = Pet.TOAD;

        assertEquals("Chat", cat.getMyPet());
        assertEquals("Rat", rat.getMyPet());
        assertEquals("Hibou", owl.getMyPet());
        assertEquals("Crapaud", toad.getMyPet());
    }
}

