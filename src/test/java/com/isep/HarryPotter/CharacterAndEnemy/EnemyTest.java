package com.isep.HarryPotter.CharacterAndEnemy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EnemyTest {

    @Test
    public void testEnemyCreation() {
        String enemyName = "Voldemort";
        int enemyDamage = 25;
        int enemyAdditionalDamage = 40;
        int enemyHealth = 100;
        int enemyAccuracy = 10;
        String defeatWay = "Expelliarmus";

        Enemy enemy = new Enemy(enemyName, enemyDamage, enemyAdditionalDamage, enemyHealth, enemyAccuracy, defeatWay);

        assertEquals(enemyName, enemy.getEnemyName());
        assertEquals(enemyDamage, enemy.getEnemyDamage());
        assertEquals(enemyAdditionalDamage, enemy.getEnemyAdditionalDamage());
        assertEquals(enemyHealth, enemy.getEnemyHealth());
        assertEquals(enemyAccuracy, enemy.getEnemyAccuracy());
        assertEquals(defeatWay, enemy.getDefeatWay());
    }

}
