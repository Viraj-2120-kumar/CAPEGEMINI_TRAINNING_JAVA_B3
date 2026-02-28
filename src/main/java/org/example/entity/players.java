package org.example.entity;

import  lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class players {
      private int player_id;
      private String player_name;
      private String team_name;
      private int runs;

}
