package com.soccerleague.soccerleague.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.soccerleague.soccerleague.entity.Members;

public interface MemberRepository extends JpaRepository<Members, Long> {

	// @Query("select memberName and memberRole by teamId")
	// Optional<Members> findMemberNameByTeams();
}
