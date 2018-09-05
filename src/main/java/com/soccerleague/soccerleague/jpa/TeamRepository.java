package com.soccerleague.soccerleague.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.soccerleague.soccerleague.entity.Teams;

public interface TeamRepository extends JpaRepository<Teams, Long> {

	List<Teams> findByTeamId(String name);

	// List<Members> findMembersListByTeamId();

}
