package com.cooksys.groupfinal.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cooksys.groupfinal.dtos.TeamDto;
import com.cooksys.groupfinal.dtos.TeamRequestDto;
import com.cooksys.groupfinal.services.TeamService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/team")
@RequiredArgsConstructor
public class TeamController {

  private final TeamService teamService;

  @PostMapping("/{companyId}")
  public TeamDto createTeam(@RequestBody TeamRequestDto teamRequestDto, @PathVariable long companyId) {
    return teamService.createTeam(teamRequestDto, companyId);
  }
}
