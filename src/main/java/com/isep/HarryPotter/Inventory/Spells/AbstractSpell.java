package com.isep.HarryPotter.Inventory.Spells;

import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;

public abstract class AbstractSpell {
    Scanner scanner = new Scanner(System.in);

    @Getter@Setter String SpellUsed;
    protected String spellOption;
}

