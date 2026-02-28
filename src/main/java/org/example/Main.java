package org.example;

import org.example.dao.PlayerDao;
import org.example.dao.PlayerDaoImpl;
import org.example.entity.players;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws SQLException {

        // Create player list
        List<players> playerList = new ArrayList<>();

        playerList.add(new players(16, "Virat2", "RCB", 7500));
        playerList.add(new players(25, "Rohit3", "MI", 6800));
        playerList.add(new players(36, "Dhoni4", "CSK", 5000));

        // Create DAO object
        PlayerDao playerDao = new PlayerDaoImpl();
        playerDao.insertPlayer(playerList);


    }
}