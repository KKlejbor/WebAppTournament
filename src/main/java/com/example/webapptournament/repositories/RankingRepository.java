package com.example.webapptournament.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.webapptournament.models.Ranking;

@Repository
public interface RankingRepository extends JpaRepository<Ranking, Long> {

}
