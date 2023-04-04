package com.isep.HarryPotter.Inventory.Spells;

import lombok.Getter;
import lombok.Setter;

public abstract class AbstractSpell {

    @Getter@Setter String SpellUsed = "";
    protected String spellOption;
}

