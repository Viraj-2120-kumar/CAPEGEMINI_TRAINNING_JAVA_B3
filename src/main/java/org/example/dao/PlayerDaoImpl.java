package org.example.dao;

import org.example.entity.players;
import org.example.repository.player_repo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class PlayerDaoImpl implements PlayerDao{

    @Override
    public void insertPlayer(List<players> player) throws SQLException {
        Connection connection = player_repo.getConnection();
        String insertquery = "INSERT INTO Players Values(?,?,?,?)";
        PreparedStatement stmt = connection.prepareStatement(insertquery);

        for(players P : player){
            stmt.setInt(1, P.getPlayer_id());
            stmt.setString(2, P.getPlayer_name());   // ✅ FIXED
            stmt.setString(3, P.getTeam_name());     // ✅ FIXED
            stmt.setInt(4, P.getRuns());
            stmt.addBatch();
        }

        int[] result = stmt.executeBatch();
        System.out.println("Inserted rows"+result.length);
        connection.close();
    }
}
