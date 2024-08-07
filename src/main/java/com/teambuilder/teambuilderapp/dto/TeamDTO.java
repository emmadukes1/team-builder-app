package com.teambuilder.teambuilderapp.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TeamDTO {
  //  - teamid - join column with player
  private Long teamId;
  //  - team name - concatenate - team age and gender and A,B,C (u18FemaleA) - make this like a primary key
  private String teamName;
  private String headCoach;
  // eg U18
  private String ageGroup;
  private Integer numberOnPitchPlayers;
  // default to 20 if no number
  private Integer numberOfSubstitutes;
  //   - group (A,B,C etc)
  private Character teamGroup;
  private Boolean offsideRulesApply;
  private String league;
  private String gender;

}
