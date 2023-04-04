package com.isep.HarryPotter.Inventory.Potions;

import lombok.Getter;

public abstract class AbstractPotion {
    @Getter protected int damagePotion = 5;
    @Getter protected int healthPotion = 10;
    @Getter protected int accuracyPotion = 3;
}
