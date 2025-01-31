package com.github.zipcodewilmington.casino.games.WordGuess;

import com.github.zipcodewilmington.Casino;
import com.github.zipcodewilmington.casino.GameInterface;
import com.github.zipcodewilmington.casino.PlayerInterface;
import com.github.zipcodewilmington.casino.casinoaccount.CasinoAccount;

import java.io.IOException;

import static com.github.zipcodewilmington.casino.casinoaccount.CasinoAccountManager.database;

public class WordGuessEngine {

    public void run(CasinoAccount activeAccount) throws IOException {

        Casino casino = new Casino();
        WordGuessGame wordGuess = new WordGuessGame();

        while(wordGuess.continuePlaying){
            wordGuess.announceGame();
            wordGuess.initializeGameState();
            while(!wordGuess.checkIfOver()){
                wordGuess.display();
                wordGuess.getNextGuess();
                wordGuess.process();
                if (wordGuess.checkIfOver()){
                    break;
                }
            }
        }
        casino.writeAllAccsToFile(database);
        casino.checkSelectionEnterGame(activeAccount);
    }

}
