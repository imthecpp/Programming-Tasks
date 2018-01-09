package com.company;

import java.util.ArrayList;

/**
 * Created by Dawid Kowalski on 09.11.2017.
 */
public class Player {

   private ArrayList<String> optionList = new ArrayList<String>();
   private String userChoice;

    public void movesList(int userChoice){
        optionList.add("rock");
        optionList.add("paper");
        optionList.add("scissors");

        this.userChoice = optionList.get(userChoice);
    }

    public String getChoice() {
        return userChoice;
    }
}
