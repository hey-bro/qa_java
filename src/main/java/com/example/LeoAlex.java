package com.example;

import java.util.List;

public class LeoAlex extends Lion {


    public LeoAlex(Feline feline) throws Exception {
        super("Самец", feline);
    }


    public List<String> getFriends() {
        return List.of("Мартин", "Глория", "Мелман");
    }

    public String getPlaceOfLiving() {
        return "Нью-Йоркский зоопарк";
    }

    @Override
    public int getKittens() {
        return 0;
    }

}
