package com.isep.HarryPotter.Initialisation.Wand;

import lombok.Getter;

public class Wood {
    private final String[] wood = {"Acacia ", "Acajou", "Amourette", "Aubépine", "Aubépine des marais", "Aulne", "Bouleau", "Cèdre", "Cerisier", "Charme", "Châtaignier ", "Chêne", "Chêne blanc", "Chêne rouge", "Cornouiller", "Cyprès", "Ébène", "Épicéa", "Érable", "Érable à sucre", "Frêne", "Frêne épineux", "Hêtre", "Houx", "If", "Laurier", "Lierre", "Mélèze", "Mélèze laricin", "Noisetier", "Noyer", "Noyer noir", "Orme", "Peuplier", "Pin", "Poirier", "Pommier", "Prunellier", "Rose", "Roseau", "Sapin", "Saule", "Séquoia", "Sorbier", "Sureau", "Sycomore", "Tilleul argenté", "Tremble", "Vigne"};
    private final int randomNumber = (int) (Math.random() * wood.length);
    @Getter private final String randomWood = wood[randomNumber];
    char firstLetter = randomWood.charAt(0);

    @Getter String preposition = switch (firstLetter) {
        case 'A', 'É', 'I', 'O' -> " d'";
        default -> " de ";
    };
}
