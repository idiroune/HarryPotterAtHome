package com.isep.HarryPotter.Initialisation.Wand;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CoreTest {
    @Test
    public void testRandomCore() {
        Core core = new Core();
        String randomCore = core.getRandomCore();
        assertTrue(randomCore.length() > 0);
    }
}
