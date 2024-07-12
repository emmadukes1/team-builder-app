package com.teambuilder.teambuilderapp.repository;

import org.springframework.data.repository.CrudRepository;
import com.teambuilder.teambuilderapp.entity.PlayerEntity;

public interface PlayerRepository extends CrudRepository<PlayerEntity, Long> {
}
