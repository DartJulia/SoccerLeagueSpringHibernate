package com.soccerleague.soccerleague.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "members")
public class Members {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "memberid")
	private Long memberId;
	@Column(name = "membername")
	private String memberName;
	@Column(name = "memberrole")
	private String memberRole;

	@ManyToOne
	@JoinColumn(name = "teamid")
	private Teams teams;

	public Members() {

	}

	public Members(String memberName, String memberRole, Teams teams) {
		super();
		this.memberName = memberName;
		this.memberRole = memberRole;
		this.teams = teams;
	}

	public Members(Long memberId, String memberName, String memberRole, Teams teams) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
		this.memberRole = memberRole;
		this.teams = teams;
	}

	public Long getMemberId() {
		return memberId;
	}

	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMemberRole() {
		return memberRole;
	}

	public void setMemberRole(String memberRole) {
		this.memberRole = memberRole;
	}

	public Teams getTeams() {
		return teams;
	}

	public void setTeams(Teams teams) {
		this.teams = teams;
	}

	@Override
	public String toString() {
		return "Members: memberId=" + memberId + ", memberName=" + memberName + ", memberRole=" + memberRole
				+ ", teams=" + teams;
	}

}
