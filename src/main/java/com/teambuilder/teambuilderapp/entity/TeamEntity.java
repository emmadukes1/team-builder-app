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
@Table(name = "TEAM_TABLE")
@Getter
@Setter
@NoArgsConstructor
public class TeamEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "TEAM_ID", nullable = false)
  private Long teamId;
  @Column(name = "TEAM_NAME", nullable = false)
  private String teamName;
  @Column(name = "HEAD_COACH")
  private String headCoach;
  @Column(name = "NUMBER_OF_PLAYERS")
  private Integer numberOfPlayers;
  @Column(name = "NUMBER_OF_SUBSTITUTES")
  private Integer numberOfSubstitutes;
  @Column(name = "OFFSIDE_RULES_APPLY")
  private Boolean offsideRulesApply;
  @Column(name = "LEAGUE")
  private String league;
  @Column(name = "GENDER")
  private String gender;
}
