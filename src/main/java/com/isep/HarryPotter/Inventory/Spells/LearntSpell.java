package com.isep.HarryPotter.Inventory.Spells;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class LearntSpell extends AbstractSpell {
    @Getter
    private final List<String> learntSpells = new ArrayList<>();
}
