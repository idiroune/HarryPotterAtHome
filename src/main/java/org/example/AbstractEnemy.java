package org.example;

public abstract class AbstractEnemy extends Character {

    public AbstractEnemy(String enemyname, int enemydamage, int enemyhealth, int enemyaccuracy){

        this.enemyName = enemyname;
        this.enemyDamage = enemydamage;
        this.enemyHealth = enemyhealth;
        this.enemyAccuracy = enemyaccuracy;
    }
}
