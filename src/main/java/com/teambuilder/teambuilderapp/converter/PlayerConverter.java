package com.teambuilder.teambuilderapp.converter;

import org.springframework.stereotype.Component;

import com.teambuilder.teambuilderapp.dto.PlayerDTO;
import com.teambuilder.teambuilderapp.entity.PlayerEntity;

@Component
public class PlayerConverter {

  public PlayerEntity convertDtoToEntity(PlayerDTO playerDTO){

    PlayerEntity playerEntity= new PlayerEntity();
    playerEntity.setPlayerName(playerDTO.getPlayerName());
    playerEntity.setPhoneNumber(playerDTO.getPhoneNumber());
    playerEntity.setGuardianName(playerDTO.getGuardianName());
    playerEntity.setTeamId(playerDTO.getTeamId());
    playerEntity.setPositionId(playerDTO.getPositionId());

    return playerEntity;
  }
  public PlayerDTO convertEntityToDto(PlayerEntity playerEntity){
    PlayerDTO playerDTO = new PlayerDTO();
    playerDTO.setPlayerId(playerEntity.getPlayerId());
    playerDTO.setPlayerName(playerEntity.getPlayerName());
    playerDTO.setPhoneNumber(playerEntity.getPhoneNumber());
    playerDTO.setGuardianName(playerEntity.getGuardianName());
    playerDTO.setTeamId(playerEntity.getTeamId());
    playerDTO.setPositionId(playerEntity. getPositionId());

    return playerDTO;
  }
}
