package org.example;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class AbstractSpell {

    protected String spellOption1;
    protected String spellOption2;
}

class LearnSpell extends AbstractSpell {

    @Getter private final List<String> learntSpells = new ArrayList<>();
}

class LearningSpell extends AbstractSpell  {

    public LearningSpell(String spellOption1, String spellOption2) {
        this.spellOption1 = spellOption1;
        this.spellOption2 = spellOption2;
    }

    public void learnSpell() {
        Wizard wizard = MakeCharacter.getWizard();
        Scanner scanner = new Scanner(System.in);
        boolean ok = false;

        System.out.println("Choisissez un sort à apprendre :");

        do{
            System.out.println("1. " + this.spellOption1);
            System.out.println("2. " + this.spellOption2);

            if (scanner.hasNextInt()) {

                int choice = scanner.nextInt();

                switch (choice) {

                    case 1 -> {
                        scanner.nextLine();
                        String repeat;
                        System.out.println("Répétez 3 fois le sort " + this.spellOption1 + " pour l'apprendre !");
                        repeat = scanner.nextLine();

                        do {
                            if (repeat.equalsIgnoreCase(this.spellOption1)) {
                                System.out.println("Oui c'est ça continue...");
                                repeat = scanner.nextLine();


                                if (repeat.equalsIgnoreCase(this.spellOption1)) {
                                    System.out.println("Oui...! Encore une fois...");
                                    repeat = scanner.nextLine();

                                    if (repeat.equalsIgnoreCase(this.spellOption1)) {
                                        System.out.println("Vous avez appris le sort " + this.spellOption1);
                                        wizard.getLearntSpell().add(this.spellOption1);
                                        ok = true;
                                    }
                                }
                            }
                            if (!ok) {
                                System.out.println("Non non non... ce n'est pas " + "\"" + repeat + "\"" + ", c'est " + "\"" + this.spellOption1 + "\"" + " recommencez !");
                                repeat = scanner.nextLine();
                            }
                        } while (!ok);
                    }
                    case 2 -> {
                        scanner.nextLine();
                        String repeat;
                        System.out.println("Répétez 3 fois le sort " + this.spellOption2 + " pour l'apprendre !");
                        repeat = scanner.nextLine();

                        do {
                            if (repeat.equalsIgnoreCase(this.spellOption2)) {
                                System.out.println("Oui c'est ça continue...");
                                repeat = scanner.nextLine();


                                if (repeat.equalsIgnoreCase(this.spellOption2)) {
                                    System.out.println("Oui...! Encore une fois...");
                                    repeat = scanner.nextLine();

                                    if (repeat.equalsIgnoreCase(this.spellOption2)) {
                                        System.out.println("Vous avez appris le sort " + "\"" + this.spellOption2 + "\"");
                                        wizard.getLearntSpell().add(this.spellOption2);
                                        ok = true;
                                    }
                                }
                            }
                            if (!ok) {
                                System.out.println("Non non non... ce n'est pas " + "\"" + repeat + "\"" + ", c'est " + "\"" + this.spellOption2 + "\"" + " recommencez !");
                                repeat = scanner.nextLine();
                            }
                        } while (!ok);
                    }
                }
                if(!ok){
                    System.out.println(wizard.getWizardName() + "... un peu de sérieux, je te demande de choisir parmi :");
                }
            } else {
                System.out.println(wizard.getWizardName() + "... un peu de sérieux, je te demande de choisir parmi :");
                scanner.nextLine();
            }
        }while (!ok);

    }

    public void learntSpell(){

        Wizard wizard = MakeCharacter.getWizard();

        System.out.println("\n" + "Sorts appris : ");
        for (int i = 0; i < wizard.getLearntSpell().size(); i++) {
            System.out.println("- " + wizard.getLearntSpell().get(i));
            System.out.println("");

        }
    }
}