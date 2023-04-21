package com.isep.HarryPotter.CharacterAndEnemy;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

public abstract class Character {
    @Getter@Setter protected String wizardName;
    @Getter protected String house;
    @Getter protected List<String> learntSpell;
    @Getter protected List<String> potions;
    @Getter @Setter protected int potionEfficacy = 1;
    @Getter protected String pet;
    @Getter protected String woodCore;

    @Getter@Setter protected int wizardDamage;
    @Getter@Setter protected int wizardAdditionalDamage;
    @Getter@Setter protected int wizardHealth;
    @Getter@Setter protected int wizardAccuracy;

    @Getter private final int basicWizardDamage = 14;
    @Getter private final int basicWizardAdditionalDamage = 21;
    @Getter private final int basicWizardHealth = 50;
    @Getter private final int basicWizardAccuracy = 7;

    @Getter private final int basicSerpentardAdditionalDamage = 31;
    @Getter private final int basicGryffondorHealth = 80;
    @Getter private final int basicSerdaigleAccuracy = 12;

    @Getter@Setter protected int bonusDamage = 0;
    @Getter@Setter protected int bonusBonusDamage = 0;
    @Getter@Setter protected int bonusHealth = 0;
    @Getter@Setter protected int bonusAccuracy = 0;

}
