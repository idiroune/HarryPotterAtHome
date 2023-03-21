package org.example;


import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Introduction Introduction = new Introduction();
        Introduction.Introduction();

    }
}
class Introduction {
    public void Introduction() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        LearnSpell learnSpells = new LearnSpell();
        SortingHat sortingHat = new SortingHat();
        ListPotions potions = new ListPotions();
        Random random = new Random();
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
        System.out.println(wizard.getPet());
        /*ajouter dans les composants la baguette*/
        MakeCharacter MakeCharacter = new MakeCharacter();
        MakeCharacter.MakeCharacter(wizard);
    }
}


class MakeCharacter {
    private static Wizard wizard;

    public void MakeCharacter(Wizard wizard) throws InterruptedException {
        Random random = new Random();

        MakeCharacter.wizard = wizard;

        System.out.println(wizard.getHouse());

        System.out.println(wizard.getWizardDamage() + random.nextInt(wizard.getWizardBonusDamage()));
        System.out.println(wizard.getWizardDamage() + random.nextInt(wizard.getWizardBonusDamage()));
        System.out.println(wizard.getWizardDamage() + random.nextInt(wizard.getWizardBonusDamage()));
        System.out.println(wizard.getWizardDamage() + random.nextInt(wizard.getWizardBonusDamage()));
        System.out.println(wizard.getWizardDamage() + random.nextInt(wizard.getWizardBonusDamage()));



        System.out.println(random.nextInt(wizard.getWizardAccuracy()));
        System.out.println(random.nextInt(wizard.getWizardAccuracy()));
        System.out.println(random.nextInt(wizard.getWizardAccuracy()));
        System.out.println(random.nextInt(wizard.getWizardAccuracy()));
        System.out.println(random.nextInt(wizard.getWizardAccuracy()));


        LearningSpell learningSpell = new LearningSpell("Sort de soin", "Sort de protection");
        learningSpell.learnSpell();
        learningSpell.learntSpell();

        SomethingWithPotions SomethingWithPotions = new SomethingWithPotions();
        SomethingWithPotions.MakePotion();
        SomethingWithPotions.UsePotion();


        System.out.println(wizard.getHouse());

        System.out.println(wizard.getWizardHealth());
        System.out.println(wizard.getWizardDamage());
        System.out.println(wizard.getWizardAccuracy());

        wizard.ResetWizardStatut();

        System.out.println(wizard.getWizardHealth());
        System.out.println(wizard.getWizardDamage());
        System.out.println(wizard.getWizardAccuracy());


        System.out.println(wizard.getWizardName());



        Thread.sleep(1500);
        System.out.println("Je suis le Choipeaux, en lisant au travers de ton âme je peux voir la maison qui" +
                "\nte correspond le plus parmi Gryffondor, Poufsouffle, Serdaigle et Serpentard...");


        wizard.setWizardName("Joooooooooooooe");
        System.out.println(wizard.getWizardName());

        FirstLevel FirstLevel = new FirstLevel();
        FirstLevel.Battle1();

    }
    public static Wizard getWizard() {
        return wizard;
    }
}

class FirstLevel{
    public void Battle1() throws InterruptedException{
        Wizard wizard = MakeCharacter.getWizard();
        wizard.setWizardName("Joe");
        System.out.println(wizard.getWizardName());
        LearningSpell learningSpell2 = new LearningSpell("Sort de soin", "Sort de protection");
        learningSpell2.learnSpell();
        learningSpell2.learntSpell();


    }
}
class SecondLevel{
    public void Battle2()throws InterruptedException{
        Wizard wizard = MakeCharacter.getWizard();
        System.out.println(wizard.getWizardName());
        wizard.setWizardName("Jc");
        System.out.println(wizard.getWizardName());

    }
}
