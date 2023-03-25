package org.example;

import lombok.Getter;
import lombok.Setter;

public abstract class AbstractEnemy extends Character {

    @Getter@Setter protected String enemyName;
    @Getter@Setter protected int enemyDamage;
    @Getter@Setter protected int enemyAdditionalDamage;
    @Getter@Setter protected int enemyHealth;
    @Getter@Setter protected int enemyAccuracy;

    @Getter@Setter protected String defeatWay;
}
