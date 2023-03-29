package org.example;


import org.example.BattleAndDeath.Death;
import org.example.BattleAndDeath.Fight;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Introduction Introduction = new Introduction();
        FirstLevel firstLevel = new FirstLevel();
        SecondLevel secondLevel = new SecondLevel();
        ThirdLevel thirdLevel = new ThirdLevel();
        FourthLevel fourthLevel = new FourthLevel();
        FifthLevel fifthLevel = new FifthLevel();
        SixthLevel sixthLevel = new SixthLevel();
        SeventhLevel seventhLevel = new SeventhLevel();

        Introduction.Introduction();


        firstLevel.FirstLevel();
        secondLevel.SecondLevel();




    }
}
class Introduction {
    public void Introduction() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        LearnSpell learnSpells = new LearnSpell();
        SortingHat sortingHat = new SortingHat();
        ListPotions potions = new ListPotions();
        String myPet;
        boolean ok = false;

        /*Thread.sleep(1000);
        System.out.println("Proviseur :\n");

        System.out.println("« Eh… ");
        Thread.sleep(2000);
        System.out.println("Eh oh…");
        Thread.sleep(2000);
        System.out.println("Eh oh jeune Sorcier.");
        Thread.sleep(2000);
        System.out.println("Vous allez bien ? Vous semblez un peu perdu… Quel est votre nom ?");
        */String wizardname = scanner.nextLine();/*
        System.out.println(wizardname + " vous dites ? C'est étrange ça ne me dit rien.");
        Thread.sleep(2000);
        System.out.println("Une seconde…");
        Thread.sleep(1200);
        System.out.println("Où sont votre bandeau de maison d’appartenance ?");
        Thread.sleep(1200);
        System.out.println("Vous n’avez même pas de baguette et d’animal de compagnie !?");
        Thread.sleep(2500);
        System.out.println("Mmmh…  déjà, venez, il vous faut une maison. ");
        Thread.sleep(3000);
        System.out.println("Voilà, n’ayez pas peur asseyez-vous et laissez le Choipeaux lire au travers de votre âme et voir la maison qui \n" +
                "vous correspond le plus parmi Gryffondor, Poufsouffle, Serdaigle et Serpentard. »\n");

        Thread.sleep(3000);
        System.out.println("Choixpeau :\n");

        Thread.sleep(2000);
        System.out.println("« Bonjour, bonjour !");
        Thread.sleep(2000);
        System.out.println("Comme le proviseur l’a précisé je vais lire dans ton âme pour y trouver une maison correspondante.");
        Thread.sleep(2000);
        System.out.println("Alors détend-toi et laisse tes pensées fluctuer.");
        Thread.sleep(3000);
        System.out.println("Mmhhh… ");
        Thread.sleep(2000);
        System.out.println("Je sens.. une très grande perturbation en toi… ");
        Thread.sleep(2000);
        System.out.println("Tu n’as pas l’air d’avoir d’objectif construit, mais plutôt d’osciller entre plusieurs vies\n" +
                "dans le but de trouver des réponses… ou plutôt des solutions.");
        Thread.sleep(3000);
        System.out.println("Mmmh… ");
        Thread.sleep(2000);
        System.out.println("Le médaillon que tu portes… où l’as-tu trouvé ? Tu n’as pas l’air de connaître sa provenance…");
        Thread.sleep(2000);
        System.out.println("Tu as encore du chemin à faire pour trouver les solutions que tu recherches.");
        Thread.sleep(2000);
        System.out.println("Mais je pense qu’elles sont liées à ce médaillon.");
        Thread.sleep(2000);
        System.out.println("Enfin !");
        Thread.sleep(2000);
        System.out.println("Avec toute cette discussion j’ai trouvé la maison parfaite pour toi qui est…");
        Thread.sleep(3000);
        System.out.println(sortingHat.getRandomHouse());
        String attributHouse = sortingHat.getRandomHouse();
        Thread.sleep(2000);
        System.out.print("Je n'espère pas que cela te sera utile, mais en étant dans cette maison ");
        if (attributHouse == "Poufsouffle") {
            System.out.println("tes potions seront plus efficaces.");

        } else if (attributHouse == "Serpentard") {
            System.out.println("tes sorts feront plus de dégâts.");

        } else if (attributHouse == "Gryffondor") {
            System.out.println("tu seras plus résistant aux dégâts.");

        } else if (attributHouse == "Serdaigle") {
            System.out.println("Tu auras plus de précision.");
        }
        Thread.sleep(2000);
        System.out.println("Voilà ce sera tout.");
        Thread.sleep(2000);
        System.out.print("Bon courage, ");
        Thread.sleep(2500);
        System.out.println( wizardname +".");
        Thread.sleep(2000);

        */do {
            System.out.println("Choisissez votre animal parmi ceux-là :");

            for (Pet pet : Pet.values()) {
                System.out.println(pet.getMyPet());
            }
            myPet = scanner.nextLine();

            for (Pet pet : Pet.values()){
                if (myPet.equalsIgnoreCase(pet.getMyPet())) {
                    myPet = pet.getMyPet();
                    System.out.println("Vous avez choisi l'animal : " + pet.getMyPet());
                    ok = true;
                    break;
                }
            }
            if (!ok){
                System.out.println("La magie a permis la naissance de multiples espèces extraordinaire, mais je ne reconnais pas la votre...");
            }
        } while (!ok);


        Wizard wizard = new Wizard(wizardname, sortingHat.getRandomHouse(), learnSpells.getLearntSpells(), potions.getPotions(), myPet);

        /*ajouter dans les composants la baguette*/
        MakeCharacter MakeCharacter = new MakeCharacter();
        MakeCharacter.makeCharacter(wizard);
    }
}


class FirstLevel{
    public void FirstLevel() throws InterruptedException{
        Wizard wizard = MakeCharacter.getWizard();

        SomethingWithPotions SomethingWithPotions = new SomethingWithPotions();
        SomethingWithPotions.MakePotion();

        LearningSpell learningSpell2 = new LearningSpell("Wingardium Leviosa");
        learningSpell2.learnSpell();

        Enemy enemy = new Enemy("Troll ", 5, 5, 100, 5, "Wingardium Leviosa");
        Fight fight = new Fight(wizard, enemy);
        fight.BattleBegin();

        wizard.UpdateStatut();
    }
}
class SecondLevel{
    public void SecondLevel()throws InterruptedException{
        Wizard wizard = MakeCharacter.getWizard();

        SomethingWithPotions SomethingWithPotions = new SomethingWithPotions();
        SomethingWithPotions.MakePotion();

        LearningSpell learningSpell2 = new LearningSpell("Accio");
        learningSpell2.learnSpell();

        if(wizard.getHouse().equals("Griffondor")) {
            Enemy enemy = new Enemy("Basilic ", 7, 7, 120, 5, "");
            Fight fight = new Fight(wizard, enemy);
            fight.BattleBegin();

            wizard.UpdateStatut();
        }
    }
}

class ThirdLevel{
    public void ThirdLevel()throws InterruptedException{
        Wizard wizard = MakeCharacter.getWizard();

        SomethingWithPotions SomethingWithPotions = new SomethingWithPotions();
        SomethingWithPotions.MakePotion();

        LearningSpell learningSpell2 = new LearningSpell("Expecto Patronum");
        learningSpell2.learnSpell();

        Enemy enemy = new Enemy("Détraqueurs", 9, 9, 140, 5, "Expecto Patronum");
        Fight fight = new Fight(wizard, enemy);
        fight.BattleBegin();

        wizard.UpdateStatut();
    }
}

class FourthLevel{
    public void FourthLevel()throws InterruptedException{
        Scanner scanner = new Scanner(System.in);

        Wizard wizard = MakeCharacter.getWizard();

        SomethingWithPotions SomethingWithPotions = new SomethingWithPotions();
        SomethingWithPotions.MakePotion();

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
                Death death = new Death("WrongSpell");
                death.WizardDeath();
            }
        }
    }
}

class FifthLevel{
    public void FifthLevel()throws InterruptedException{
        Scanner scanner = new Scanner(System.in);

        Wizard wizard = MakeCharacter.getWizard();

        SomethingWithPotions SomethingWithPotions = new SomethingWithPotions();
        SomethingWithPotions.MakePotion();

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
                Death death = new Death("WrongSpell");
                death.WizardDeath();
            }
        }

        wizard.UpdateStatut();
    }
}

class SixthLevel{
    public void SixthLevel()throws InterruptedException{
        Scanner scanner = new Scanner(System.in);

        Wizard wizard = MakeCharacter.getWizard();

        SomethingWithPotions SomethingWithPotions = new SomethingWithPotions();
        SomethingWithPotions.MakePotion();

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
                Death death = new Death("WrongSpell");
                death.WizardDeath();
            }
        }

        wizard.UpdateStatut();
    }
}

class SeventhLevel{
    public void SeventhLevel()throws InterruptedException{
        Scanner scanner = new Scanner(System.in);

        Wizard wizard = MakeCharacter.getWizard();

        SomethingWithPotions SomethingWithPotions = new SomethingWithPotions();
        SomethingWithPotions.MakePotion();

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
                Death death = new Death("WrongSpell");
                death.WizardDeath();
            }
        }

        wizard.UpdateStatut();
    }
}