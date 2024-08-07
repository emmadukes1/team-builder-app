package com.teambuilder.teambuilderapp.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teambuilder.teambuilderapp.converter.PlayerConverter;
import com.teambuilder.teambuilderapp.dto.PlayerDTO;
import com.teambuilder.teambuilderapp.dto.TeamDTO;
import com.teambuilder.teambuilderapp.entity.PlayerEntity;
import com.teambuilder.teambuilderapp.entity.TeamEntity;
import com.teambuilder.teambuilderapp.repository.PlayerRepository;
import com.teambuilder.teambuilderapp.repository.TeamRepository;
import com.teambuilder.teambuilderapp.service.PlayerService;

@Service
public class PlayerServiceImpl implements PlayerService {

  @Autowired
  private PlayerRepository playerRepository;

  @Autowired
  private PlayerConverter playerConverter;

  @Autowired
  private TeamRepository teamRepository;

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


  @Override
  public List<PlayerDTO> getTeamSelection(Long teamId) {

    List<PlayerDTO> playerList = null;
    System.out.println("getting team selection");
    boolean teamExists = false;

    List<TeamEntity> listOfTeams = (List<TeamEntity>) teamRepository.findAll();
    for (TeamEntity teamEntity : listOfTeams) {
      if (teamEntity.getTeamId() == teamId) {

        // need to map here for team id in player list
        List<PlayerEntity> listOfPlayers = (List<PlayerEntity>) playerRepository.findAll();
        playerList = new ArrayList<>();

        for (PlayerEntity playerEntity : listOfPlayers) {
          if (playerEntity.getTeamId() == teamId) {
            PlayerDTO dto = playerConverter.convertEntityToDto(playerEntity);
            playerList.add(dto);
            System.out.println("making player list");
          }
          else {
            System.out.println("no player list. Team ID " + teamId);
          }
          // if team doesnt exists give message

          // if team does exist get list of all players
          // then update to get team number of players and subs
          // then update to get best
        }
      }
    }
    return playerList;
  }
}
