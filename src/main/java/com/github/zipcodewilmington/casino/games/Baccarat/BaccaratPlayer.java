package com.github.zipcodewilmington.casino.games.Baccarat;

import com.github.zipcodewilmington.casino.GamblerInterface;
import com.github.zipcodewilmington.casino.Player;
import com.github.zipcodewilmington.casino.casinoaccount.CasinoAccount;

public class BaccaratPlayer extends Player implements GamblerInterface {
    @Override
    public double placeBet() {
        return 0;
    }

    @Override
    public double increaseBet() {

        return 0;
    }

    @Override
    public CasinoAccount getCasinoAccount() {
        return null;
    }

    @Override
    public <SomeReturnType> SomeReturnType play() {
        return null;
    }
}
