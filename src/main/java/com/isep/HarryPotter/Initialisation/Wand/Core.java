package com.isep.HarryPotter.Initialisation.Wand;

import lombok.Getter;

public class Core {
    private final String[] core = {"Cheveu de Vélane", "Corail", "Corne de Basilic", "Corne de Jackalope", "Corne de Serpent cornu", "Crin de Kelpy", "Crin de licorne", "Crin de Sombral", "Épine de monstre du Fleuve Blanc", "Moustache de Fléreur", "Plume d'Oiseau-Tonnerre", "Plume de phénix", "Poil de rougarou", "Moustache de troll", "Poil de womatou", "Tige de dictame", "Ventricule de dragon", "Ventricule de Snallygaster" };
    private final int randomNumber = (int) (Math.random() * core.length);
    @Getter private final String randomCore = core[randomNumber];
}
