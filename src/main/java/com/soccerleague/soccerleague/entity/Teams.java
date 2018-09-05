package com.soccerleague.soccerleague.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "teams")
public class Teams {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "teamid")
	private Long teamId;
	@Column(name = "teamname")
	private String teamName;
// Annotate that this is a one to many relationship with members class, mapped by refers to POJO
	@OneToMany(mappedBy = "teams", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Members> membersList = new ArrayList<>();

	public Teams() {

	}

	public Teams(String teamName, List<Members> membersList) {
		super();
		this.teamName = teamName;
		this.membersList = membersList;
	}

	public Teams(Long teamId, String teamName, List<Members> membersList) {
		super();
		this.teamId = teamId;
		this.teamName = teamName;
		this.membersList = membersList;
	}

	public Long getTeamId() {
		return teamId;
	}

	public void setTeamId(Long teamId) {
		this.teamId = teamId;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}


	public List<Members> getMembersList() {
		return membersList;
	}

	public void setMembersList(List<Members> membersList) {
		this.membersList = membersList;
	}

	@Override
	public String toString() {
		return "Teams: teamId=" + teamId + ", teamName=" + teamName;
	}

}
