package com.teambuilder.teambuilderapp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teambuilder.teambuilderapp.converter.TeamConverter;
import com.teambuilder.teambuilderapp.dto.TeamDTO;
import com.teambuilder.teambuilderapp.entity.TeamEntity;
import com.teambuilder.teambuilderapp.repository.TeamRepository;
import com.teambuilder.teambuilderapp.service.TeamService;

@Service
public class TeamServiceImpl implements TeamService {

  @Autowired
  TeamConverter teamConverter;

  @Autowired
  TeamRepository teamRepository;

  @Override
  public TeamDTO registerTeam(TeamDTO teamDTO) {

    teamRepository.save(teamConverter.convertDtoToEntity(teamDTO));
    return null;
  }
}
