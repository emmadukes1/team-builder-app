package com.teambuilder.teambuilderapp.service;

import java.util.List;

import com.teambuilder.teambuilderapp.dto.PlayerDTO;
import com.teambuilder.teambuilderapp.dto.TeamDTO;

public interface PlayerService {

  PlayerDTO registerPlayer(PlayerDTO playerDTO);
  List<PlayerDTO> getAllPlayersList();
  List<PlayerDTO> getTeamSelection(Long teamId);

}
