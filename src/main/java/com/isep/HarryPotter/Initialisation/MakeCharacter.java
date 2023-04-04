package com.isep.HarryPotter.Initialisation;

import com.isep.HarryPotter.CharacterAndEnemy.Wizard;

public class MakeCharacter {
    private static Wizard wizard;
    public static void makeCharacter(Wizard wizard){

        MakeCharacter.wizard = wizard;
    }
    public static Wizard getWizard() {
        return wizard;
    }
}
