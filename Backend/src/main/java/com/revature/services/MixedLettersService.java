package com.revature.services;

import java.util.ArrayList;
import java.util.List;

import com.revature.daos.MixedLettersDAO;
import com.revature.models.MixedLetters;

public class MixedLettersService {

    MixedLettersDAO mlDAO = new MixedLettersDAO();

    public void addMixedLetters(MixedLetters ml) {

        mlDAO.insertMixedLetters(ml);
    }

    public MixedLetters getMixedLetters(int id) {

        MixedLetters ml = mlDAO.getMixedLettersByID(id);

        return ml;
    }
}