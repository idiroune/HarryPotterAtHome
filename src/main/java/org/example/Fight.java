package org.example;

import java.util.Random;
import java.util.Scanner;

public class Fight {
    private final Wizard wizard;
    private final Enemy enemy;

    public Fight(Wizard wizard, Enemy enemy) {
        this.wizard = wizard;
        this.enemy = enemy;
    }

    public void BattleBegin() {
        Scanner scanner = new Scanner(System.in);
        SomethingWithPotions SomethingWithPotions = new SomethingWithPotions();

        Random random = new Random();

        int esquive = 0;

        // Combat
        while (wizard.getWizardHealth() > 0 && enemy.getEnemyHealth() > 0) {



            int wizardAttack = (wizard.getWizardDamage() + random.nextInt(wizard.getWizardAdditionalDamage()));
            int wizardAccuracy = random.nextInt(wizard.getWizardAccuracy());
            // Tour du joueur

            System.out.println(enemy.getEnemyName() + " est à " + enemy.getEnemyHealth() + " de vie.");

            System.out.println("Que voulez-vous faire ?");
            System.out.println("""
                    1. Attaquer
                    2. Utiliser une potion""");
            if(esquive >= 3) {
                System.out.println("3. Esquiver");
            }

            String choice = scanner.nextLine();

            if(choice.equalsIgnoreCase("1")) {

                System.out.println("Vous attaquez " + enemy.getEnemyName() + ".");

                if (wizardAccuracy == 0) {
                    System.out.print("Eeeeet...");
                    System.out.println("C'est loupé...");
                } else {
                    enemy.setEnemyHealth(enemy.getEnemyHealth() - wizardAttack);
                    if (wizardAttack == wizard.getWizardDamage() + wizard.getWizardAdditionalDamage()) {
                        System.out.println("C'est un critique !");
                    }
                    System.out.println("Vous infligez " + wizardAttack + " de dégâts à " + enemy.getEnemyName());
                    esquive += 1;

                    if (enemy.getEnemyHealth() <= 0) {
                        break;
                    }
                    else {
                        System.out.println("Il lui reste " + enemy.getEnemyHealth() + " de vie.");
                    }
                }
            }
            else if (choice.equalsIgnoreCase("2")){

                SomethingWithPotions.UsePotion();

            }
            else if(choice.equalsIgnoreCase("3") && esquive >= 3) {
                System.out.println("Les mouvements de votre adversaire se font plus lent... vous essayez une esquive. ");


            }else if (!choice.equals("1") && !choice.equals("2") && esquive < 3 ){

                System.out.println("Qu'est-ce que vous faîtes ? Vous perdez du temps !");

            } else if (!choice.equals("1") && !choice.equals("2") && !choice.equals("3") && esquive >= 3 ){

                System.out.println("Qu'est-ce que vous faîtes ? Vous perdez du temps !");

            }


            // Tour du monstre

            int enemyAttack = (enemy.getEnemyDamage() + random.nextInt(enemy.getEnemyAdditionalDamage()));
            int enenmyAccuracy = random.nextInt(enemy.getEnemyAccuracy()) - esquive;

            System.out.println(enemy.getEnemyName() + "vous attaque.");



                if (enenmyAccuracy == 0 || ( choice == "3" && esquive >= 3)) {
                    System.out.println("C'est loupé !");

                }
                else {
                    if(choice == "3" && esquive >= 3){
                        System.out.println("Malgré votre tentative vous ne parvenez pas à esquiver l'attaque.");


                    }
                    wizard.setWizardHealth(wizard.getWizardHealth() - enemyAttack);
                    if (enemyAttack == enemy.getEnemyDamage() + enemy.getEnemyAdditionalDamage()) {
                        System.out.println(enemy.getEnemyName() + "vous fait ");
                    } else {
                        System.out.println(enemy.getEnemyName() + "vous inflige " + enemyAttack + " de dégâts");

                    }
                    if (wizard.getWizardHealth() <= 0) {
                        System.out.println("Vous êtes mort");
                        break;
                    } else {
                        System.out.println("Il vous reste " + wizard.getWizardHealth() + " de vie.");
                    }
                }


        }
        if (wizard.getWizardHealth() <= 0) {
            /*Fermer console avec message sur pendentif remontant dans le temps*/
        }
    }
}
