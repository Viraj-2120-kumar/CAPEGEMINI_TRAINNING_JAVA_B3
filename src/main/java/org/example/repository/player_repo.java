package org.example.repository;

import java.sql.Connection;
import java.sql.DriverManager;

public class player_repo {


        public static Connection getConnection() {

            try {
                return DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/cap_player",  // ✅ fixed
                         "root",
                        "admin11"
                );

            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
    }

