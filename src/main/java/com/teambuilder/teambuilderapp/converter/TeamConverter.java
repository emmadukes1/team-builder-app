package com.teambuilder.teambuilderapp.converter;

import org.springframework.stereotype.Component;

import com.teambuilder.teambuilderapp.dto.TeamDTO;
import com.teambuilder.teambuilderapp.entity.TeamEntity;

@Component
public class TeamConverter {

  public TeamEntity convertDtoToEntity(TeamDTO teamDTO){

    TeamEntity teamEntity= new TeamEntity();
    teamEntity.setTeamName(teamDTO.getTeamName());
    teamEntity.setHeadCoach(teamDTO.getHeadCoach());
    teamEntity.setNumberOnPitchPlayers(teamDTO.getNumberOnPitchPlayers());
    teamEntity.setNumberOfSubstitutes(teamDTO.getNumberOfSubstitutes());
    teamEntity.setOffsideRulesApply(teamDTO.getOffsideRulesApply());
    teamEntity.setLeague(teamDTO.getLeague());
    teamEntity.setGender(teamDTO.getGender());

    return teamEntity;
  }
}
