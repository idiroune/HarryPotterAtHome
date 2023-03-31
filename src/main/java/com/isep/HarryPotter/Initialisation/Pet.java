package com.isep.HarryPotter.Initialisation;

import lombok.Getter;

public enum Pet {

    CAT("Chat"),
    RAT("Rat"),
    OWL("Hibou"),
    TOAD("Crapaud");
    @Getter private final String myPet;

    Pet(String myPet){
        this.myPet = myPet;
    }
}
