package com.teambuilder.teambuilderapp.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TeamDTO {
  private Long teamId;
  private String teamName;
  private String headCoach;
  private Integer numberOfPlayers;
  private Integer numberOfSubstitutes;
  private Boolean offsideRulesApply;
  private String league;
  private String gender;

}
