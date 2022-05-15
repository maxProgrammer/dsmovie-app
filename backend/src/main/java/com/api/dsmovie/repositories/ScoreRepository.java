package com.api.dsmovie.repositories;

import com.api.dsmovie.models.Score;
import com.api.dsmovie.models.ScorePK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {
}
