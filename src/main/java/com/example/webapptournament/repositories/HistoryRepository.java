package com.example.webapptournament.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.webapptournament.models.History;

@Repository
public interface HistoryRepository extends JpaRepository<History, Long> {

}
