package org.example;

public class Enemy extends AbstractEnemy {

    public Enemy(String enemyName, int enemyDamage, int enemyAdditionalDamage, int enemyHealth, int enemyAccuracy, String deafeatWay){

        this.enemyName = enemyName;
        this.enemyDamage = enemyDamage;
        this.enemyAdditionalDamage = enemyAdditionalDamage;
        this.enemyHealth = enemyHealth;
        this.enemyAccuracy = enemyAccuracy;
        this.defeatWay = deafeatWay;
    }

}
