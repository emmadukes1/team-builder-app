package com.teambuilder.teambuilderapp.controller;

import java.util.List;

import io.swagger.v3.oas.annotations.Parameter;
import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
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

  @GetMapping("/get-team")
  public ResponseEntity<List<PlayerDTO>> getTeamList() {

    return new ResponseEntity<>(playerService.getTeamList(), HttpStatus.OK);
  }



}
