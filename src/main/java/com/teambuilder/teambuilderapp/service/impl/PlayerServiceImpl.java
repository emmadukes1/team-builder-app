package com.teambuilder.teambuilderapp.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teambuilder.teambuilderapp.converter.PlayerConverter;
import com.teambuilder.teambuilderapp.dto.PlayerDTO;
import com.teambuilder.teambuilderapp.entity.PlayerEntity;
import com.teambuilder.teambuilderapp.repository.PlayerRepository;
import com.teambuilder.teambuilderapp.service.PlayerService;

@Service
public class PlayerServiceImpl implements PlayerService {

  @Autowired
  private PlayerRepository playerRepository;

  @Autowired
  private PlayerConverter playerConverter;

  @Override
  public PlayerDTO registerPlayer(PlayerDTO playerDTO) {

    PlayerEntity playerEntity = playerConverter.convertDtoToEntity(playerDTO);
    playerRepository.save(playerEntity);

    playerDTO = playerConverter.convertEntityToDto(playerEntity);
    return playerDTO;
  }

  @Override
  public List<PlayerDTO> getAllPlayersList() {

    List<PlayerEntity> listOfPlayers = (List<PlayerEntity>)playerRepository.findAll();
    List<PlayerDTO> playerList = new ArrayList<>();

    for(PlayerEntity playerEntity : listOfPlayers){
      PlayerDTO dto = playerConverter.convertEntityToDto(playerEntity);
      playerList.add(dto);
    }

    return playerList;
  }
}
