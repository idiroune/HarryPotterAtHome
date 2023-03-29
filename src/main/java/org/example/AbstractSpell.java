package org.example;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class AbstractSpell {
    Scanner scanner = new Scanner(System.in);

    @Getter@Setter String SpellUsed;
    protected String spellOption;
}

class LearnSpell extends AbstractSpell {

    @Getter private final List<String> learntSpells = new ArrayList<>();
}

