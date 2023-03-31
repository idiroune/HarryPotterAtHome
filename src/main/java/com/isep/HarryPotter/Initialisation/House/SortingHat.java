package com.isep.HarryPotter.Initialisation.House;

import lombok.Getter;
public class SortingHat {
        House house = new House();
        private final int RandomNumber = (int) (Math.random() * house.getHouse().length);
        @Getter private final String RandomHouse = house.getHouse()[RandomNumber];
}
