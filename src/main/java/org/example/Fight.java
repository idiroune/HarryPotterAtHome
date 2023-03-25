package org.example;

import java.sql.Time;
import java.util.Random;
import java.util.Scanner;

public class Fight {
    private final Wizard wizard;
    private final Enemy enemy;

    public Fight(Wizard wizard, Enemy enemy) {
        this.wizard = wizard;
        this.enemy = enemy;
    }

    public void BattleBegin() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        SomethingWithPotions SomethingWithPotions = new SomethingWithPotions();

        Random random = new Random();

        int concentration = 0;
        int critical = 0;

        // Combat
        while (wizard.getWizardHealth() > 0 && enemy.getEnemyHealth() > 0) {
            int dodge = 0;

            int wizardAttack = (wizard.getWizardDamage() + random.nextInt(wizard.getWizardAdditionalDamage()));
            int wizardAccuracy = random.nextInt(wizard.getWizardAccuracy());

            // Tour du joueur
            Thread.sleep(2000);

            if(concentration == 3){
                System.out.println(Color.VERT + "\nLes attaques multiples sur votre adversaire vous ont faits gagner en concentration." + Color.RESET);
                Thread.sleep(1500);
                concentration++;
            }

            System.out.println("\n" + Color.MAGENTA + enemy.getEnemyName() + Color.RESET + " est à " + Color.MAGENTA + enemy.getEnemyHealth()+ Color.RESET+ " de vie.\n");

            Thread.sleep(1500);


            System.out.println("Que voulez-vous faire ?");
            System.out.println("1. " + Color.ROUGE + "Attaquer" + Color.RESET);
            System.out.println("2. " + Color.BLEU + "Utiliser une potion" + Color.RESET);
            if(concentration >= 3) {
                System.out.println("3. "+ Color.VERT + "Esquiver" + Color.RESET);
            }
            if(critical == 1) {
                System.out.println("3. "+ Color.JAUNE + "Attaque puissante" + Color.RESET);
            }

            String choice = scanner.nextLine();

            if(choice.equalsIgnoreCase("1") || (choice.equalsIgnoreCase("3") && critical == 1)) {

                System.out.println("Vous attaquez " + Color.MAGENTA + enemy.getEnemyName() + Color.RESET + ".\n");
                Thread.sleep(2000);
                System.out.print("Eeeeet...");
                Thread.sleep(2500);

                if (wizardAccuracy == 0 && critical == 0) {
                    System.out.println("C'est loupé...");
                } else {

                    if (wizardAttack == wizard.getWizardDamage() + wizard.getWizardAdditionalDamage() || critical == 1) {

                        wizardAttack = wizard.getWizardDamage() + wizard.getWizardAdditionalDamage();
                        System.out.println(Color.JAUNE + "C'est un critique !" + Color.RESET + "\n");
                        Thread.sleep(1000);
                        System.out.println("Vous infligez " + Color.JAUNE + wizardAttack + Color.RESET + " de dégâts à " + Color.MAGENTA + enemy.getEnemyName() + Color.RESET);
                        enemy.setEnemyHealth(enemy.getEnemyHealth() - wizardAttack);
                    }
                    else {
                        System.out.println("Vous infligez " + Color.ROUGE + wizardAttack + Color.RESET + " de dégâts à " + Color.MAGENTA + enemy.getEnemyName() + Color.RESET);
                        enemy.setEnemyHealth(enemy.getEnemyHealth() - wizardAttack);
                    }
                    concentration ++;

                    if (enemy.getEnemyHealth() <= 0) {
                        break;
                    }
                    else {
                        Thread.sleep(2000);
                        System.out.println("Il lui reste " + Color.MAGENTA + enemy.getEnemyHealth()+ Color.RESET + " de vie.");
                    }
                }
            }
            else if (choice.equalsIgnoreCase("2")){

                SomethingWithPotions.UsePotion();

            }
            else if(choice.equalsIgnoreCase("3") && concentration >= 3) {

                System.out.println("Les mouvements de votre adversaire se font plus lent... vous essayez d'esquiver la prochaine attaque.");
                concentration = 0;
                dodge = (3 * enemy.getEnemyAccuracy()) / 2;


            }else if (!choice.equals("1") && !choice.equals("2") && concentration < 3 ){

                System.out.println("Qu'est-ce que vous faîtes ?! Vous perdez du temps !");

            } else if (!choice.equals("1") && !choice.equals("2") && !choice.equals("3") && concentration >= 3 ){

                System.out.println("Qu'est-ce que vous faîtes ?! Vous perdez du temps !");

            }

            critical = 0;


            // Tour du monstre

            int enemyAttack = (enemy.getEnemyDamage() + random.nextInt(enemy.getEnemyAdditionalDamage()));
            int enenmyAccuracy = random.nextInt(enemy.getEnemyAccuracy());

            Thread.sleep(2000);
            System.out.println("\n" + Color.MAGENTA + enemy.getEnemyName() + Color.RESET + " vous attaque.\n");
            Thread.sleep(2000);

            if (enenmyAccuracy == 0) {
                /*Si l'ennemie vise mal et que le sorcier esquive ou non, dans tous les cas l'ennemie a mal visé donc
                une esquive bonne ou mauvaise n'aurait rien changée */
                System.out.println("L'ennemi à raté son attaque !");

            } else if (enenmyAccuracy > 0 && (enenmyAccuracy - dodge <= 0)) {
                /*Si l'ennemie vise bien mais que le sorcier esquive*/
                System.out.println("C'est raté !");
                Thread.sleep(1000);
                System.out.println(Color.VERT + "Votre esquive vous a permis de voir le sort venir et de l'esquiver !" + Color.RESET + "\n");
                Thread.sleep(2000);
                System.out.println(Color.JAUNE + "L'ennemi est destabilisé par votre esquive, vous pouvez charger une attque plus puissante ! " + Color.RESET);

                critical = 1;

            } else {
                if (choice == "3" && dodge != 0) {
                    /*Si le sorcier tente d'esquiver mais que les actions précédentes n'ont pas aboutie*/
                    System.out.println("Malgré votre tentative vous ne parvenez pas à esquiver l'attaque.");

                }

                wizard.setWizardHealth(wizard.getWizardHealth() - enemyAttack);

                if (enemyAttack == enemy.getEnemyDamage() + enemy.getEnemyAdditionalDamage()) {
                    System.out.println(Color.JAUNE + "Coup critique.\n" + Color.RESET);
                    System.out.println(Color.MAGENTA + enemy.getEnemyName() + Color.RESET + " vous inflige " + Color.JAUNE + enemyAttack + Color.RESET + " de dégâts.");

                } else {
                    System.out.println(Color.MAGENTA + enemy.getEnemyName() + Color.RESET + " vous inflige " + Color.ROUGE + enemyAttack + Color.RESET + " de dégâts.");

                }
                if (wizard.getWizardHealth() <= 0) {
                    System.out.println("Vous êtes mort.");
                    break;
                } else {
                    Thread.sleep(2000);
                    System.out.println("Il vous reste " + wizard.getWizardHealth() + " points de vie.");
                }
            }


        }
        if (wizard.getWizardHealth() <= 0) {
            /*Fermer console avec message sur pendentif remontant dans le temps*/
        }
    }
}
