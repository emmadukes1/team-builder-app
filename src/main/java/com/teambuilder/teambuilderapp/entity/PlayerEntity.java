package com.teambuilder.teambuilderapp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "PLAYER_TABLE")
@Getter
@Setter
@NoArgsConstructor
public class PlayerEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long playerId;
  @Column(name = "PLAYER_NAME", nullable = false)
  private String playerName;
  @Column(name = "GUARDIAN_NAME", nullable = false)
  private String guardianName;
  @Column(name = "PHONE_NUMBER", nullable = false)
  private String phoneNumber;
  @Column(name = "POSITION_ID")
  private String positionId;
  @Column(name = "TEAM_ID")
  private Long teamId;
}
