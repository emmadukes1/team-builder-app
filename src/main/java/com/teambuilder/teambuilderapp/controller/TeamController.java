package com.teambuilder.teambuilderapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teambuilder.teambuilderapp.dto.PlayerDTO;
import com.teambuilder.teambuilderapp.dto.TeamDTO;
import com.teambuilder.teambuilderapp.service.TeamService;

@RestController
@RequestMapping("/api/v1/team")
public class TeamController {

  @Autowired
  TeamService teamService;

  @PostMapping("/register-team")
  public ResponseEntity<TeamDTO> registerTeam(@RequestBody TeamDTO teamDTO) {

    return new ResponseEntity<>(teamService.registerTeam(teamDTO), HttpStatus.CREATED);
  }
}
