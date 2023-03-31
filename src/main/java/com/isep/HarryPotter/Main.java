package com.isep.HarryPotter;


import com.isep.HarryPotter.BattleAndDeath.Death;
import com.isep.HarryPotter.BattleAndDeath.Fight;
import com.isep.HarryPotter.CharacterAndEnemy.Enemy;
import com.isep.HarryPotter.CharacterAndEnemy.Wizard;
import com.isep.HarryPotter.Initialisation.Color;
import com.isep.HarryPotter.Initialisation.House.SortingHat;
import com.isep.HarryPotter.Initialisation.MakeCharacter;
import com.isep.HarryPotter.Initialisation.Wand.Core;
import com.isep.HarryPotter.Initialisation.Wand.Wood;
import com.isep.HarryPotter.Inventory.Potions.ListPotions;
import com.isep.HarryPotter.Inventory.Potions.SomethingWithPotions;
import com.isep.HarryPotter.Inventory.Spells.LearntSpell;
import com.isep.HarryPotter.Inventory.Spells.LearningSpell;
import com.isep.HarryPotter.Initialisation.Pet;

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
        thirdLevel.ThirdLevel();
        fourthLevel.FourthLevel();
        fifthLevel.FifthLevel();
        sixthLevel.SixthLevel();
        seventhLevel.SeventhLevel();

    }
}
class Introduction {
    public void Introduction() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        SortingHat sortingHat = new SortingHat();
        Wood wood = new Wood();
        Core core = new Core();
        LearntSpell learntSpells = new LearntSpell();
        ListPotions potions = new ListPotions();
        String myPet;
        boolean ok = false;

        Thread.sleep(1000);
        System.out.println("Proviseur :\n");

        System.out.println("« Eh... ");
        Thread.sleep(2000);
        System.out.println("Eh oh...");
        Thread.sleep(2000);
        System.out.println("Eh oh jeune Sorcier.");
        Thread.sleep(2000);
        System.out.println("Vous allez bien ? Vous semblez un peu perdu... Quel est votre nom ?");

        String wizardname = scanner.nextLine();

        System.out.println(wizardname + " vous dites ? C'est étrange ça ne me dit rien.");
        Thread.sleep(2000);
        System.out.println("Une seconde...");
        Thread.sleep(1200);
        System.out.println("Où sont votre bandeau de maison d’appartenance ?");
        Thread.sleep(1200);
        System.out.println("Vous n’avez même pas de baguette et d’animal de compagnie !?");
        Thread.sleep(2500);
        System.out.println("Mmmh...  déjà, venez, il vous faut une maison. ");
        Thread.sleep(3000);
        System.out.println("Voilà, n’ayez pas peur, asseyez-vous et laissez le Choipeaux lire au travers de votre âme et voir la maison qui \n" +
                "vous correspond le plus parmi Gryffondor, Poufsouffle, Serdaigle et Serpentard. »\n");

        Thread.sleep(3000);
        System.out.println("Choixpeau :\n");
        Thread.sleep(2000);
        System.out.println("« Bonjour, bonjour !");
        Thread.sleep(2000);
        System.out.println("Comme le proviseur l’a précisé je vais lire dans ton âme pour y trouver une maison correspondante.");
        Thread.sleep(2000);
        System.out.println("Alors détends-toi et laisse tes pensées fluctuer.");
        Thread.sleep(3000);
        System.out.println("Mmhhh... ");
        Thread.sleep(2000);
        System.out.println("Je sens.. une très grande perturbation en toi... ");
        Thread.sleep(2000);
        System.out.println("Tu n’as pas l’air d’avoir d’objectif construit, mais plutôt d’osciller entre plusieurs vies\n" +
                "dans le but de trouver des réponses... ou plutôt des solutions.");
        Thread.sleep(3000);
        System.out.println("Mmmh... ");
        Thread.sleep(2000);
        System.out.println("Le médaillon que tu portes... où l’as-tu trouvé ? Tu n’as pas l’air de connaître sa provenance...");
        Thread.sleep(2000);
        System.out.println("Tu as encore du chemin à faire pour trouver les solutions que tu recherches.");
        Thread.sleep(2000);
        System.out.println("Mais je pense qu’elles sont liées à ce médaillon.");
        Thread.sleep(2000);
        System.out.println("Enfin !");
        Thread.sleep(2000);
        System.out.println("Avec toute cette discussion, j'ai trouvé la maison parfaite pour toi qui est...");
        Thread.sleep(3000);
        System.out.println(sortingHat.getRandomHouse());
        String attributHouse = sortingHat.getRandomHouse();
        Thread.sleep(2000);
        System.out.print("Je n'espère pas que cela te sera utile, mais en étant dans cette maison ");
        if (attributHouse.equals("Poufsouffle")) {
            System.out.println("tes potions seront plus efficaces.");

        } else if (attributHouse.equals("Serpentard")) {
            System.out.println("tes sorts feront plus de dégâts.");

        } else if (attributHouse.equals("Gryffondor")) {
            System.out.println("tu seras plus résistant aux dégâts.");

        } else if (attributHouse.equals("Serdaigle")) {
            System.out.println("Tu auras plus de précision.");
        }
        Thread.sleep(2000);
        System.out.println("Voilà ce sera tout.");
        Thread.sleep(2000);
        System.out.print("Bon courage, ");
        Thread.sleep(2500);
        System.out.println( wizardname +".»");
        Thread.sleep(2000);

        System.out.println("Proviseur :\n");

        System.out.println("« Bien " + wizardname +" ! Maintenant, il est temps que tu choisisses ton animal de compagnie !");
        Thread.sleep(2000);
        System.out.println("La magie a permis la naissance de multiples espèces extraordinaires.");
        Thread.sleep(2000);
        System.out.println("\nMalheureusement, les seuls animaux acceptés dans l'école sont le :");

        do {
            for (Pet pet : Pet.values()) {
                System.out.println(pet.getMyPet());
            }
            myPet = scanner.nextLine();

            for (Pet pet : Pet.values()) {
                if (myPet.equalsIgnoreCase(pet.getMyPet())) {
                    myPet = pet.getMyPet();
                    System.out.println("Un " + pet.getMyPet() + " ? C'est un choix intéressant.\n");
                    ok = true;
                    break;
                }
            }
            if (!ok) {
                System.out.println(wizardname + "... Cela ne fait pas parti des animaux proposés.");
                Thread.sleep(2000);
                System.out.println("Choisis parmi :");
            }
        } while (!ok);

        Thread.sleep(2000);
        System.out.println("Bien, maintenant, il est temps que tu choisisses l'équipement le plus important chez un sorcier, sa baguette !");
        Thread.sleep(2000);
        System.out.println("Enfin, choisir... c'est plutôt elle qui te choisira.");
        Thread.sleep(2000);
        System.out.print("Fermes les yeux et laisse toi envahir par tes sentiments");
        Thread.sleep(2000);
        System.out.print(", tes pensées...");
        Thread.sleep(2000);
        System.out.println("\nOh ! J'en vois une qui bouge ! Reste concentré.");
        Thread.sleep(2000);
        System.out.print("Elle arrive !");
        Thread.sleep(2000);
        System.out.print(" Attrape là !!");
        Thread.sleep(2000);
        System.out.println("\nRegarde ça ! Une baguette fait" + wood.getPreposition() + wood.getRandomWood() + " et possédant un coeur de " + core.getRandomCore() + ".");
        Thread.sleep(2000);

        if (core.getRandomCore().equals("Plume de phénix")){
            System.out.println("Ow... cela faisait longtemps que je n'avais pas vu une baguette faite d'un coeur fait de Plume de phénix choisir un sorcier.");
            Thread.sleep(2000);
            System.out.println("Le dernier sorcier... n'a pas très bien tourné.");
            Thread.sleep(2000);
            System.out.println("Mais sois rassuré il y a peu de chance que vos chemins se croisent.");
        }
        else {
            System.out.println("Ca n'est pas une baguette ordinaire. Mais elle a l'air d'être faite pour toi !");
        }

        Thread.sleep(2000);
        System.out.println("Bien " + wizardname + ", il semblerait que tu sois fin prêt à mener des belles années dans notre école de magie !»");


        Wizard wizard = new Wizard(wizardname, sortingHat.getRandomHouse(), learntSpells.getLearntSpells(), potions.getPotions(), myPet, core.getRandomCore());

        /*ajouter dans les composants la baguette*/
        MakeCharacter MakeCharacter = new MakeCharacter();
        MakeCharacter.makeCharacter(wizard);

    }
}


class FirstLevel {
    public void FirstLevel() throws InterruptedException {
        Wizard wizard = MakeCharacter.getWizard();

        Thread.sleep(3000);
        System.out.println("\nVotre première année se passe sans problème.");
        Thread.sleep(2000);
        System.out.println("Vous vous rendez ainsi à votre premier cours de potions.");

        SomethingWithPotions SomethingWithPotions = new SomethingWithPotions();
        SomethingWithPotions.MakePotion();

        System.out.println("Oh ! Il est l'heure d'aller vous rendre à votre cours de magie !");

        LearningSpell learningSpell = new LearningSpell("Wingardium Leviosa");
        learningSpell.learnSpell();

        System.out.println("Mmmmh...");
        Thread.sleep(2000);
        System.out.println("En sortant de votre cours vous sentez une envie pressante émerger...");
        Thread.sleep(2000);
        System.out.println("Rendez-vous vite aux toilettes avant d'inonder l'école !!");
        Thread.sleep(3000);
        System.out.println("Vous accourez dans les toilettes les plus proches, celles du donjon.");
        Thread.sleep(2000);
        System.out.println("Mais, votre moment de soulagement se fait interrompre par l'arrivé soudaine d'un Troll !!");
        Thread.sleep(2000);
        System.out.println("Il a l'air d'être très hostile et vous n'avez rien d'autre que votre baguette pour vous défendre.");
        Thread.sleep(2000);
        System.out.println("Néanmoins, vous remarquez un tas de caisses dans la pièce, peut-être qu'elles pourront être utile.");

        Enemy enemy = new Enemy("Troll", 5, 5, 100, 5, "Wingardium Leviosa");
        Fight fight = new Fight(wizard, enemy);
        fight.BattleBegin();

        Thread.sleep(2000);
        System.out.println("\nFélicitations ! Vous avez mis le Troll hors d'état de nuire !");

        wizard.UpdateStatut();

        System.out.println("Après toutes ces péripéties il est préférable de vous reposer, vous avez encore beaucoup de choses à découvrir durant votre année.");

    }
}
class SecondLevel {
    public void SecondLevel() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        Wizard wizard = MakeCharacter.getWizard();

        Thread.sleep(3000);
        System.out.println("\nVotre seconde année se passe sans problème.");
        Thread.sleep(2000);
        System.out.println("Vous vous rendez ainsi à votre cours de potions.");

        SomethingWithPotions SomethingWithPotions = new SomethingWithPotions();
        SomethingWithPotions.MakePotion();

        System.out.println("Oh ! Il est l'heure d'aller vous rendre à votre cours de magie !");

        LearningSpell learningSpell = new LearningSpell("Accio");
        learningSpell.learnSpell();

        System.out.println("En sortant de votre cours vous vous sentez assoiffé.");
        Thread.sleep(2000);
        System.out.print("Vous vous rendez donc dans les toilettes les plus proches.");
        Thread.sleep(2000);
        System.out.println("Mais pas celles du donjon !");
        Thread.sleep(3000);
        System.out.println("Vous accourez dans les toilettes les plus proches pour y étancher votre soif.");
        Thread.sleep(2000);
        System.out.println("Vous vous retrouvez face à un lavabo orné d'une étrange gravure en forme de serpent.");
        Thread.sleep(2000);
        System.out.println("Sans comprendre pourquoi vous vous mettez à parler le Fourchelang devant ce cette gravure.");
        Thread.sleep(2000);
        System.out.println("Quoi ?!");
        Thread.sleep(2000);
        System.out.println("Le lavabo se déplace créant une ouverture.");
        Thread.sleep(2000);
        System.out.println("Curieux, vous emprunter cette ouverture vous menant tout droit dans la chambre des secrets, et vers une forme gigantesque semblant bouger...");
        Thread.sleep(2000);
        System.out.println("Ho ho...");
        Thread.sleep(2000);
        System.out.println("On dirait le Basilic...");
        Thread.sleep(2000);
        System.out.println("Et il semblerait qu'il se réveille !");

        if (wizard.getHouse().equals("Griffondor")) {
            Thread.sleep(2000);
            System.out.println("Vous n'avez aucune chance avec votre misérable baguette.");
            Thread.sleep(2000);
            System.out.println("Cependant, vous remarquez uen étrange épée s'avérant plus utile pour votre combat.");
            Enemy enemy = new Enemy("Basilic ", 7, 7, 120, 5, "");
            Fight fight = new Fight(wizard, enemy);
            fight.BattleBegin();

            Thread.sleep(2000);
            System.out.println("\nFélicitations ! Vous avez mis le Basilic hors d'état de nuire !");

            wizard.UpdateStatut();
        } else {
            Thread.sleep(2000);
            System.out.println("Vite ! Il faut détruire le journal de Tom Jedusor en utilisant un des crocs du Basilic.");
            Thread.sleep(2000);
            System.out.println("Comment faire ?!");
            Thread.sleep(2000);
            System.out.println("Il y a peut-être un sort qui peut vous permettre d'arracher et d'attirer un crocs à vous :\n");

            for (int i = 0; i < wizard.getLearntSpell().size(); i++) {
                System.out.println((i + 1) + ". " + wizard.getLearntSpell().get(i));
            }

            if (scanner.hasNextInt()) {

                int SpellUseNumber = scanner.nextInt();

                if (1 <= SpellUseNumber && SpellUseNumber <= wizard.getLearntSpell().size()) {
                    String SpellUse = wizard.getLearntSpell().get(SpellUseNumber - 1);
                    System.out.println(SpellUse + " !!\n");
                    if (!SpellUse.equals("Accio")) {
                        Death death = new Death("WrongSpell");
                        death.WizardDeath();
                    }
                } else {
                    Death death = new Death("WrongSpell");
                    death.WizardDeath();

                }
            } else {
                Death death = new Death("WrongSpell");
                death.WizardDeath();
            }

            Thread.sleep(2000);
            System.out.println("Vous arrachez le crocs du Basilic et vous en servez pour enfourchez le journal de Tom Jedusor !");
            Thread.sleep(2000);
            System.out.println("Voilà une bonne chose de faite !");
            Thread.sleep(2000);

        }
        System.out.println("Après toutes ces péripéties il est préférable de vous reposer, vous avez encore beaucoup de choses à découvrir durant votre année.");

    }
}

class ThirdLevel {
    public void ThirdLevel() throws InterruptedException {
        Wizard wizard = MakeCharacter.getWizard();

        Thread.sleep(3000);
        System.out.println("\nVotre troisième année se passe sans problème.");
        Thread.sleep(2000);
        System.out.println("Vous vous rendez ainsi à votre cours de potions.");

        SomethingWithPotions SomethingWithPotions = new SomethingWithPotions();
        SomethingWithPotions.MakePotion();

        System.out.println("Oh ! Il est l'heure d'aller vous rendre à votre cours de magie !");

        LearningSpell learningSpell = new LearningSpell("Expecto Patronum");
        learningSpell.learnSpell();

        System.out.println("En sortant de votre cours vous vous sentez assoiffé.");
        Thread.sleep(2000);
        System.out.print(" Mais pas question de retourner dans aucunes toilettes du château !.");
        Thread.sleep(2000);
        System.out.println("Mmmmh...");
        Thread.sleep(1500);
        System.out.println("Et pourquoi ne pas aller boire l'eau du Lac dans la Forêt Interdite ? Le lac est peut-être seulement interdit que par son nom.");
        Thread.sleep(3000);
        System.out.println("Vous rejoignez le Lac dans la Forêt Interdite pour y étancher votre soif.");
        Thread.sleep(2000);
        System.out.println("Mmmh ! L'eau y est délicieuse ! Vous vous sentez revigoré et en pleine forme !");
        Thread.sleep(2000);
        System.out.println("Aussi bien que vous prenez le temps de vous admirer au travers de l'eau du lac.");
        Thread.sleep(2000);
        System.out.print("Oh !");
        Thread.sleep(2000);
        System.out.print("Vous avez pris du muscle !");
        Thread.sleep(2000);
        System.out.print("Et votre visage a un teint bien meilleur !");
        Thread.sleep(2000);
        System.out.println("Et vous...volez ?!");
        Thread.sleep(2000);
        System.out.println("Mais ca n'est pas vous que vous admiriez, c'est un détraqueur !");
        Thread.sleep(2000);
        System.out.println("Et il n'a pas l'air chaleureux...");

        Enemy enemy = new Enemy("Détraqueurs", 9, 9, 140, 5, "Expecto Patronum");
        Fight fight = new Fight(wizard, enemy);
        fight.BattleBegin();

        Thread.sleep(2000);
        System.out.println("\nFélicitations ! Vous avez mis le détraqueur hors d'état de nuire !");

        wizard.UpdateStatut();

        System.out.println("Vous feriez mieux de fuir avant que d'autres détraqueurs n'arrivent !\n");
        Thread.sleep(2000);
        System.out.println("Après toutes ces péripéties il est préférable de vous reposer, vous avez encore beaucoup de choses à découvrir durant votre année.");

    }
}
class FourthLevel {
    public void FourthLevel() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        Wizard wizard = MakeCharacter.getWizard();

        Thread.sleep(3000);
        System.out.println("\nVotre quatrième année se passe sans problème.");
        Thread.sleep(2000);
        System.out.println("Vous vous rendez ainsi à votre cours de potions.");

        SomethingWithPotions SomethingWithPotions = new SomethingWithPotions();
        SomethingWithPotions.MakePotion();

        System.out.println("A la sortie du cours de potions vous vous faîtes interpeller par un élève.");
        Thread.sleep(2000);
        System.out.println("Élève :\n");
        System.out.println("« " + wizard.getWizardName() + " ! Excuses-moi mais tu es appelé pour le Tournoi des Trois Sorciers !");
        Thread.sleep(2000);
        System.out.println("\n Le quoi ?\n");
        Thread.sleep(2000);
        System.out.println("Élève :\n");
        System.out.println("«Le Tournoi des Trois Sorciers !");
        Thread.sleep(2000);
        System.out.println("C'est un tournoi ayant pour but de tester les capacités magiques, l'audace, le pouvoir de déduction et l'aptitude à réagir face au danger des sorciers sélectionnés !»");
        Thread.sleep(2000);
        System.out.println("\n Mmhhh... est-ce qu'il est possible de ne faire que la dernière partie du test ?\n");
        Thread.sleep(2000);
        System.out.println("Élève :\n");
        System.out.print("« Euh.. je ne sais pas... peut-être ?");
        Thread.sleep(2000);
        System.out.print("Aucune règle n'est écrite sur ça...»");
        Thread.sleep(2000);
        System.out.println("\n\nParfait dans ce cas j'y vais !\n");

        Thread.sleep(3000);
        System.out.println("Vous vous rendez au Cimetière de Little Hangleton à la recherche du Portoloin afin de remporter le tournoi.");
        Thread.sleep(2000);
        System.out.println("Vous marchez quand soudain");
        Thread.sleep(2000);
        System.out.println("vous l'apercevez !");
        Thread.sleep(2000);
        System.out.println("Vous apercevez également 2 personnages étranges rodant à la recherche de quelque chose...");
        Thread.sleep(2000);
        System.out.println("Ils vous ont vu ! Mais n'ont pas l'air amicale.");
        Thread.sleep(2000);
        System.out.println("C'était de vous dont ils étaient à la recherche !");

        Thread.sleep(2000);
        System.out.println("Peter Pettigrow :\n");
        System.out.println("« Il est là " + Color.ROUGE + "Voldemort" + Color.RESET + " ! Attrapons le !»");
        Thread.sleep(2000);
        System.out.print("\n" + Color.ROUGE + "Voldemort" + Color.RESET + " ?");
        Thread.sleep(2000);
        System.out.print(" C'est étrange...");
        Thread.sleep(2000);
        System.out.print("vous n'avez jamais entendu ce nom auparavant mais vous semble familier.");
        Thread.sleep(2000);
        System.out.println("Vite ! Vous êtes éloigné du Portoloin mais il vous faut l'attraper pour partir au plus loin !\n");
        Thread.sleep(2000);
        System.out.print("Vois tenez fermement votre baguette, ");
        Thread.sleep(2000);
        System.out.print("peut-être qu'un sort vous permettra d'attirer le Portoloin à vous :\n\n");

        for (int i = 0; i < wizard.getLearntSpell().size(); i++) {
            System.out.println((i + 1) + ". " + wizard.getLearntSpell().get(i));
        }

        if (scanner.hasNextInt()) {

            int SpellUseNumber = scanner.nextInt();

            if (1 <= SpellUseNumber && SpellUseNumber <= wizard.getLearntSpell().size()) {
                String SpellUse = wizard.getLearntSpell().get(SpellUseNumber - 1);
                System.out.println(SpellUse + " !!\n");
                if (!SpellUse.equals("Accio")) {
                    Death death = new Death("WrongSpell");
                    death.WizardDeath();
                }
            } else {
                Death death = new Death("WrongSpell");
                death.WizardDeath();

            }
        } else {
            Death death = new Death("WrongSpell");
            death.WizardDeath();

        }

        Thread.sleep(2000);
        System.out.println("Vous avez récupéré le Portoloin !");
        Thread.sleep(2000);
        System.out.print("Celui-ci vous téléporte directement...");
        Thread.sleep(2000);
        System.out.print("dans votre lit ?");
        Thread.sleep(2000);
        System.out.println("\nBien, cela doit être une facon de vous dire que vous aez besoin de repos.");
        Thread.sleep(2000);
        System.out.println("Vous essayer d'oublier cette histoire mais le nom de " + Color.ROUGE + "Voldemort" + Color.RESET + " résonne encore dans votre tête...");
        Thread.sleep(2000);
        System.out.println("Il est tout de même préférable de vous reposer, vous avez encore beaucoup de choses à découvrir durant votre année.");
    }
}
class FifthLevel {
    public void FifthLevel() throws InterruptedException {

        Wizard wizard = MakeCharacter.getWizard();

        Thread.sleep(3000);
        System.out.println("\nVotre cinquième année se passe sans problème.");
        Thread.sleep(2000);
        System.out.println("Vous vous rendez ainsi à votre cours de potions.");

        SomethingWithPotions SomethingWithPotions = new SomethingWithPotions();
        SomethingWithPotions.MakePotion();

        System.out.println("Oh ! Il est l'heure d'aller vous rendre à votre cours de magie !\n");

        System.out.println("Dolores Ombrage :\n");
        System.out.println("« Bonjour, je suis votre nouveau professeur Dolores Ombrage et aujourd'hui nous allons apprendre comment mettre fin aux jours de " + wizard.getWizardName() + ".»");
        Thread.sleep(2000);
        System.out.println("\nHein, que quoi ?!\n");
        Thread.sleep(2000);
        System.out.println("Dolores Ombrage se précipite sur vous, assez rapidement pour ne pas vous laisser prendre votre baguette !");
        Thread.sleep(2000);
        System.out.println("Par chance, vous remarquez du coin de l'oeil une boite remplie de feux d'artifices sur le coté de la pièce.");
        Thread.sleep(2000);
        System.out.println("Peut-être arriverez-vous à en prendre un ou deux pendant le combat pour vous en servir contre elle.");

        Enemy enemy = new Enemy("Dolores Ombrage", 9, 9, 400, 5, "");
        Fight fight = new Fight(wizard, enemy);
        fight.BattleBegin();

        System.out.println("Vous avez récolté assez de feux d'artifices et commencez à les démarrer.");
        Thread.sleep(3000);
        System.out.println("Mais dans un élan de courage Dolores Ombrage tente de vous stopper...");
        Thread.sleep(3000);
        System.out.println("BOOM !");
        Thread.sleep(3000);
        System.out.println("\nFélicitations ! Vous avez littéralement explosé Dolores Ombrage !");

        wizard.UpdateStatut();

        System.out.println("Après toutes ces péripéties il est préférable de vous reposer, vous avez encore beaucoup de choses à découvrir durant votre année.");
    }
}
class SixthLevel {
    public void SixthLevel() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        Wizard wizard = MakeCharacter.getWizard();

        Thread.sleep(3000);
        System.out.println("\nVotre sixième année se passe sans problème.");
        Thread.sleep(2000);
        System.out.println("Vous vous rendez ainsi à votre cours de potions.");

        SomethingWithPotions SomethingWithPotions = new SomethingWithPotions();
        SomethingWithPotions.MakePotion();

        System.out.println("Oh ! Il est l'heure d'aller vous rendre à votre cours de magie !");

        LearningSpell learningSpell = new LearningSpell("Sectumsempra");
        learningSpell.learnSpell();

        Thread.sleep(2000);
        System.out.println("A la sortie de votre cours vous entendez des cris résonner dans le bâtiment.");
        Thread.sleep(2000);
        System.out.println("\nÉlève :\n");
        System.out.print("« Au secours !! Des Mangemoblaaarg...");
        Thread.sleep(2000);
        System.out.print("Kof...");
        Thread.sleep(2000);
        System.out.print("zblerg...");
        Thread.sleep(2000);
        System.out.print("proutsh... »");
        Thread.sleep(2000);
        System.out.println("Vous n'avez pas le temps de finir d'écouter les dernières paroles de cette personne que vous vous retrouvez face à un Mangemort.\n");

        int choice = 0;

         if(wizard.getHouse().equals("Serpentard")) {
             System.out.println("Mangemort :\n");
             System.out.println("« " + wizard.getWizardName() + " je sens que tu possèdes l'âme d'un héros... veux-tu rejoindre nos troupes ? »");
             System.out.println("""
                    1. Oui
                    2. Non""");

             if (scanner.hasNextInt()) {

                 choice = scanner.nextInt();

                 if (choice == 1) {
                     System.out.println("Mangemort :\n");
                     System.out.println("«stiti.»");
                     System.out.println("\nCa n'est pas drole.");
                     Thread.sleep(2000);
                     System.out.println("\nMangemort :\n");
                     System.out.println("«Excusez-moi...»");

                     System.out.println("\nVous rejoignez les rangs des Mangemorts !.");
                 }
             }
             } if (choice != 1) {

             Enemy enemy = new Enemy("Mangemort", 7, 7, 150, 6, "Sectumsempra");
             Fight fight = new Fight(wizard, enemy);
             fight.BattleBegin();

            System.out.println("\nFélicitations ! Vous avez mis un Mangemort hors d'état de nuit !");

            wizard.UpdateStatut();

            System.out.println("L'école reste cependant infesté de Mangemort... il est préférable de fuir.");
         }

    }
}
class SeventhLevel {
    public void SeventhLevel() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        Wizard wizard = MakeCharacter.getWizard();

        Thread.sleep(3000);
        System.out.println("\nVotre cinquième année se passe sans problème.");
        Thread.sleep(2000);
        System.out.println("Vous vous rendez ainsi à votre cours de magie.");

        LearningSpell learningSpell = new LearningSpell("Expelliarmus");
        learningSpell.learnSpell();

        System.out.println("En sortant de votre cours vous vous sentez déterminé à prendre les devants.");

        Thread.sleep(2000);
        System.out.println("Vous n'en pouvez plus de cette histoire.");
        Thread.sleep(2000);
        System.out.println("Vous voulez en finir maintenant et tout de suite !");
        Thread.sleep(3000);
        System.out.println("Vous passez un coup de fil à Voldemort.");
        Thread.sleep(2000);
        System.out.println("Rejoins-moi Gare du Nord que l'on règle nos comptes.");
        Thread.sleep(2000);
        System.out.println("\nVoldemort :\n");
        System.out.println("« Oui, il est temps d'en finir avec tout ça.»");
        Thread.sleep(2000);

        if(wizard.getWoodCore().equals("Plume de phénix")){
            System.out.println("\nVous sortez tous deux vos baguettes dans l'espoir de d'en finir au plus vite l'un l'autre.");
            Thread.sleep(2000);
            System.out.println("Au moment de lancer votre sort vous ressentez une extrême fragilité dans votre baguette.");
            Thread.sleep(2000);
            System.out.print(" Explosant sous vos mains !!");
            Thread.sleep(2000);
            System.out.println("\nC'est également le cas pour Voldemort !");
            Thread.sleep(2000);
            System.out.println("\n Comment ?! Vos deux baguettes devaient tous deux avoir le même coeur et ont explosés !!\n");
            Thread.sleep(2000);
            System.out.println("Déterminé à en finir, Voldemort accourt vers vous ! Pour vous sauter dessus et...");
            Thread.sleep(2000);

            System.out.println("\nVoldemort :\n");
            System.out.println("« Chéri tout vas as bien, il fallait que j'enlève cette malédiction qui pensait sur toi depuis des lustre. »");
            Thread.sleep(2000);
            System.out.print("« Viens");
            Thread.sleep(2000);
            System.out.print(", rentrons .»");
            Thread.sleep(2000);
            System.out.print("\nDit-il en vous tendant la main.");
            Thread.sleep(2000);
            System.out.println("\n\nSans hésitation aucune vos prenez la main de Voldemort, oui, car vous percevez en lui du réconfort et de la paix.");
            Thread.sleep(5000);
            System.out.print("THE END");
            Thread.sleep(2000);
        } else {
            String expelliarmus;

            Thread.sleep(3000);
            System.out.print("\nA");
            expelliarmus = scanner.nextLine();
            if (!expelliarmus.equalsIgnoreCase("Expelliarmus")) {
                System.out.print("vada");
                expelliarmus = scanner.next();
            }
            if (!expelliarmus.equalsIgnoreCase("Expelliarmus")) {
                System.out.print("Keda");
                expelliarmus = scanner.nextLine();
            }
            if (!expelliarmus.equalsIgnoreCase("Expelliarmus")) {
                System.out.print("vra !!");
                expelliarmus = scanner.next();
            }

            if (expelliarmus.equalsIgnoreCase("Expelliarmus")){
                System.out.println("Vous désemparez Voldemort de sa fidèle baguette !");
                Thread.sleep(2000);
                System.out.println("Mouahah c'est finit Voldemort , tu vas croupir en prison pour tes terrible méfaits !");

                Thread.sleep(3000);
                System.out.println("Mmh ?");
                Thread.sleep(2000);
                System.out.println("Vous entendez un étrange bruit venant de votre poitrine.");
                Thread.sleep(2000);
                System.out.println("C'est votre pendentif.");
                Thread.sleep(2000);
                System.out.println("Le temps s'est arrêté ?");
                Thread.sleep(2000);
                System.out.println("Pourquoi ?!");
                System.exit(0);
            }
            else {
                System.out.println("Dit-il tout en sortant sa baguette.");
                Thread.sleep(2000);
                System.out.println("\nAvada Kedavra !!");
                Thread.sleep(2000);
                System.out.println("Voldemort lance sur vous son attaque !!");
                Thread.sleep(2000);
                System.out.println("Impossible d'esquiver ou de fuir, c'est inévitable...");
                Thread.sleep(3000);
                System.out.println("Une seconde... Vous n'êtes pas mort ?");
                Thread.sleep(2000);
                System.out.println("On dirait que Voldemort a visé votre collier.");

                System.out.println("\nVoldemort :\n");
                System.out.println("« Chéri tout vas as bien, il fallait que j'enlève cette malédiction qui pensait sur toi depuis des lustre. »");
                Thread.sleep(2000);
                System.out.print("« Viens");
                Thread.sleep(2000);
                System.out.print(", rentrons .»");
                Thread.sleep(2000);
                System.out.print("\nDit-il en vous tendant la main.");
                Thread.sleep(2000);
                System.out.println("\n\nSans hésitation aucune vos prenez la main de Voldemort, oui, car vous percevez en lui du réconfort et de la paix.");
                Thread.sleep(5000);
                System.out.print("THE END");
                Thread.sleep(2000);
            }

        }
    }
}
