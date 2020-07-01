package com.example.petshelter;

public class PetAttributes {
    private String mName;
    private String mBreed;
    private int mGender;
    private int mWeight;

    PetAttributes(String name, String breed, int gender, int weight){
        mName = name;
        mBreed = breed;
        mGender = gender;
        mWeight = weight;
    }

    public int getGender() {
        return mGender;
    }

    public int getWeight() {
        return mWeight;
    }

    public String getBreed() {
        return mBreed;
    }

    public String getName() {
        return mName;
    }
}
