package org.example;

import lombok.Getter;

enum Pet {

    CAT("Chat"),
    DOG("Chien"),
    OWL("Hibou");

    @Getter private String myPet;

    Pet(String myPet){
        this.myPet = myPet;
    }
}
