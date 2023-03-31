package com.isep.HarryPotter.Inventory.Potions;

import lombok.Getter;

import java.util.Scanner;

public abstract class AbstractPotion {
    Scanner scanner = new Scanner(System.in);
    @Getter protected int damagePotion = 5;
    @Getter protected int healthPotion = 10;
    @Getter protected int accuracyPotion = 3;
}
