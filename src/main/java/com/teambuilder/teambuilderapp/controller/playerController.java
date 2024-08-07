package com.teambuilder.teambuilderapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.teambuilder.teambuilderapp.dto.PlayerDTO;
import com.teambuilder.teambuilderapp.service.PlayerService;

@RestController
@RequestMapping("/api/v1/player")
public class playerController {

  @Autowired
  private PlayerService playerService;

  @PostMapping("/register-player")
  public ResponseEntity<PlayerDTO> registerPlayer(@RequestBody PlayerDTO playerDTO) {

    return new ResponseEntity<>(playerService.registerPlayer(playerDTO), HttpStatus.CREATED);
  }

  @GetMapping("/get-all-players")
  public ResponseEntity<List<PlayerDTO>> getPlayerList() {

    return new ResponseEntity<>(playerService.getAllPlayersList(), HttpStatus.OK);
  }

  @GetMapping("/team-selection/{teamId}/")
  public ResponseEntity<List<PlayerDTO>> getTeamSelection(@PathVariable("teamId") Long teamId) {
    return new ResponseEntity<>(playerService.getTeamSelection(teamId), HttpStatus.OK);
  }



}
