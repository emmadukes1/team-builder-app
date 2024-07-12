package com.teambuilder.teambuilderapp.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class PlayerDTO {
  private Long playerId;
  private String playerName;
  private String guardianName;
  private String phoneNumber;
  private String positionId;
  private Long teamId;
}
