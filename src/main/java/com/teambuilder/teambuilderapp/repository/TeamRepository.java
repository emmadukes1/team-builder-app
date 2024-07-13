package com.teambuilder.teambuilderapp.repository;

import org.springframework.data.repository.CrudRepository;
import com.teambuilder.teambuilderapp.entity.TeamEntity;

public interface TeamRepository extends CrudRepository<TeamEntity, Long> {
}
