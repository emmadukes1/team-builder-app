package com.teambuilder.teambuilderapp.service;

import java.util.List;

import com.teambuilder.teambuilderapp.dto.PlayerDTO;


public interface PlayerService {

  PlayerDTO registerPlayer(PlayerDTO playerDTO);
  List<PlayerDTO> getTeamList();

}
