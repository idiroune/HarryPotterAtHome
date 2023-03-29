package org.example;

public class LearningSpell extends AbstractSpell {

    public LearningSpell(String spellOption) {
        this.spellOption = spellOption;
    }

    public void learnSpell() throws InterruptedException {
        Wizard wizard = MakeCharacter.getWizard();

        boolean ok = false;

        System.out.println("Bienvenu à votre cours de magie !");
        System.out.print("Aujourd'hui nous allons apprendre " + this.spellOption + ", un enchantement qui ");

        if(this.spellOption.equals("Wingardium Leviosa")) {
            System.out.println("permet au sorcier qui l'utilise de faire flotter des objets dans l'air et de les déplacer.");

        } else if (this.spellOption.equals("Accio")) {
            System.out.println("permet d'attirer vers soi par lévitation des objets éloignés.");

        } else if (this.spellOption.equals("Expecto Patronum")) {
            System.out.println("fait apparaître son patronus, un esprit protecteur contre les détraqueurs.");
            Thread.sleep(2000);
            System.out.println("...j'espère que vous n'aurez pas à vous en servir !");

        }else if (this.spellOption.equals("Sectumsempra")) {
            System.out.println("blesse violemment la personne visée.");

        }else if (this.spellOption.equals("Expelliarmus")) {
            System.out.println("qui permet le désarmement, très utile pour ôter la baguette des doigts de son ennemi.");

        }

        Thread.sleep(2000);
        System.out.println("\nMaintenant, répétez suffisamment de fois " + this.spellOption + " pour être sûr de sa maîtrise !");
        String repeat = scanner.nextLine();

        do {
            if (repeat.equalsIgnoreCase(this.spellOption)) {
                System.out.println("Oui c'est ça continue...");
                repeat = scanner.nextLine();


                if (repeat.equalsIgnoreCase(this.spellOption)) {
                    System.out.println("Oui...! Encore une fois...");
                    repeat = scanner.nextLine();

                    if (repeat.equalsIgnoreCase(this.spellOption)) {
                        System.out.println("C'est exactement ça ! " + this.spellOption + " n'a plus aucun secret pour vous !");
                        wizard.getLearntSpell().add(this.spellOption);
                        ok = true;
                    }
                }
            }
            if (!ok) {
                System.out.println("Non non non je ne vous sens pas assez concentré... ce n'est pas " + "\"" + repeat + "\"" + ", c'est " + "\"" + this.spellOption + "\"" + " recommencez !");
                repeat = scanner.nextLine();
            }
        } while (!ok);
    }

    public void UseSpell() throws InterruptedException {

        Wizard wizard = MakeCharacter.getWizard();

        String SpellUse = "";

        System.out.println("\n" + "Sorts appris : ");
        for (int i = 0; i < wizard.getLearntSpell().size(); i++) {
            System.out.println((i + 1) + ". " + wizard.getLearntSpell().get(i));
        }

        if (scanner.hasNextInt()) {

            int SpellUseNumber = scanner.nextInt();

            if (1 <= SpellUseNumber && SpellUseNumber <= wizard.getLearntSpell().size()) {
                SpellUse = wizard.getLearntSpell().get(SpellUseNumber - 1);
                System.out.println(SpellUse + " !!\n");

            }
            else {
                System.out.println("Ca n'est pas le moment de jouer.");
            }
            setSpellUsed(SpellUse);
        }
    }
}
