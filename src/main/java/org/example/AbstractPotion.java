package org.example;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractPotion {
    @Getter protected int damagePotion = 5;
    @Getter protected int healthPotion = 10;
    @Getter protected int accuracyPotion = 3;
}
class ListPotions extends AbstractPotion {
    @Getter protected List<String> potions = new ArrayList<>();
}
