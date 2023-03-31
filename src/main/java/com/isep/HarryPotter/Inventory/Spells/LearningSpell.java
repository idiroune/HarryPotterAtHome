package com.isep.HarryPotter.Inventory.Spells;


import com.isep.HarryPotter.CharacterAndEnemy.Wizard;
import com.isep.HarryPotter.Initialisation.MakeCharacter;

public class LearningSpell extends AbstractSpell {

    public LearningSpell(String spellOption) {
        this.spellOption = spellOption;
    }

    public void learnSpell() throws InterruptedException {

        Wizard wizard = MakeCharacter.getWizard();

        boolean ok = false;

        Thread.sleep(2000);
        System.out.println("\nProfesseur :");

        System.out.println("\n« Bienvenu à votre cours de magie !");
        Thread.sleep(2000);
        System.out.print("Aujourd'hui nous allons apprendre " + this.spellOption + ", un enchantement qui ");

        switch (this.spellOption) {
            case "Wingardium Leviosa" ->
                    System.out.println("permet au sorcier qui l'utilise de faire flotter des objets dans l'air et de les déplacer.");
            case "Accio" -> System.out.println("permet d'attirer vers soi des objets éloignés.");
            case "Expecto Patronum" -> {
                System.out.println("fait apparaître son patronus, un esprit protecteur contre les détraqueurs.");
                Thread.sleep(2000);
                System.out.println("...j'espère que vous n'aurez pas à vous en servir !");
            }
            case "Sectumsempra" -> System.out.println("blesse violemment la personne visée.");
            case "Expelliarmus" ->
                    System.out.println("qui permet le désarmement, très utile pour ôter la baguette des doigts de son ennemi.");
        }

        Thread.sleep(3000);
        System.out.println("\nMaintenant, répétez suffisamment de fois \"" + this.spellOption + "\" pour être sûr de sa maîtrise !");
        String repeat = scanner.nextLine();

        do {
            if (repeat.equalsIgnoreCase(this.spellOption)) {
                System.out.println("Oui c'est ça continue...");
                repeat = scanner.nextLine();


                if (repeat.equalsIgnoreCase(this.spellOption)) {
                    System.out.println("Oui...! Encore une fois...");
                    repeat = scanner.nextLine();

                    if (repeat.equalsIgnoreCase(this.spellOption)) {
                        System.out.println("C'est exactement ça ! \"" + this.spellOption + "\" n'a plus aucun secret pour vous !");
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
        Thread.sleep(2000);
        System.out.println("\nBien, ce cours touche à sa fin ! Je vous souhaite une bonne journée et d'ici le prochain cours prenez le temps de réviser votre nouveau sort. »\n");
        Thread.sleep(3000);
    }

    public void UseSpell(){
        Wizard wizard = MakeCharacter.getWizard();

        System.out.println("Sorts appris : ");
        for (int i = 0; i < wizard.getLearntSpell().size(); i++) {
            System.out.println((i + 1) + ". " + wizard.getLearntSpell().get(i));
        }

        if (scanner.hasNextInt()) {

            int SpellUseChoice = scanner.nextInt();

            if (1 <= SpellUseChoice && SpellUseChoice <= wizard.getLearntSpell().size()) {
                String SpellUse = wizard.getLearntSpell().get(SpellUseChoice - 1);
                System.out.println(SpellUse + " !!\n");

                setSpellUsed(SpellUse);

            } else {
                System.out.print("Ca n'est pas le moment de jouer.");
            }
        }else {
            setSpellUsed("");
        }
    }
}
