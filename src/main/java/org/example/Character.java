package org.example;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

public abstract class Character {
    @Getter@Setter protected String wizardName;
    @Getter protected String house;

    @Getter protected List<String> learntSpell;
    @Getter protected List<String> potions;
    @Getter @Setter protected int potionEfficacity = 1;
    @Getter protected String pet;
    @Getter@Setter protected int wizardDamage = 15;
    @Getter@Setter protected int wizardBonusDamage = 15;

    @Getter@Setter protected int wizardHealth = 50;

    @Getter@Setter protected int wizardAccuracy = 4;

    @Getter protected String enemyName;
    @Getter@Setter protected int enemyDamage;
    @Getter@Setter protected int enemyHealth;
    @Getter@Setter protected int enemyAccuracy;


}
