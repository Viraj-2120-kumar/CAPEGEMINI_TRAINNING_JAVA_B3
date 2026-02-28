package org.example.dao;

import org.example.entity.players;
import java.sql.SQLException;
import java.util.List;


public interface PlayerDao {
    void insertPlayer(List<players> player) throws SQLException;
//    void updatePlayer(Players player);
//    void deletePlayer(int playerId);
//    List<Players> getAllPlayers();//assisgnment all 3
}
