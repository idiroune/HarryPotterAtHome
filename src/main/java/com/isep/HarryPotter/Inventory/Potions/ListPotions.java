package com.isep.HarryPotter.Inventory.Potions;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class ListPotions extends AbstractPotion {
    @Getter
    protected List<String> potions = new ArrayList<>();
}
