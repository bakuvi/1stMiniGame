package com.itProger;

import java.util.Random;

public class Player {
    String name;
    VARIANTS variants;
    VARIANTS[] varArray = VARIANTS.values();
    Random random = new Random();

    public Player(){
        this.name="BOT";
        this.variants=varArray[random.nextInt(varArray.length)];
    }
    public Player(VARIANTS variants, String name) {
        this.name = name;
        this.variants = variants;
    }


    public String whoWins(Player bot, Player player) {
        if (bot.variants.equals(player.variants)){
            return  "Ничья";
        }
        else if(bot.variants.equals(VARIANTS.STONE)&&player.variants.equals(VARIANTS.SCISSORS)){
            return  "Bot победил!";
        }
        else if(bot.variants.equals(VARIANTS.SCISSORS)&&player.variants.equals(VARIANTS.PAPER)){
            return "Bot победил!";
        }
        else if(bot.variants.equals(VARIANTS.PAPER)&&player.variants.equals(VARIANTS.STONE)){
            return "Bot победил!";
        }
        else {return ("победил "+player.name);}
    }
}


enum VARIANTS {
    SCISSORS,
    STONE,
    PAPER;
}
