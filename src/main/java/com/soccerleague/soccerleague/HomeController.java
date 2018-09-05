package com.soccerleague.soccerleague;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.soccerleague.soccerleague.entity.Members;
import com.soccerleague.soccerleague.entity.Teams;
import com.soccerleague.soccerleague.jpa.MemberRepository;
import com.soccerleague.soccerleague.jpa.TeamRepository;

@Controller
public class HomeController {

	@Autowired
	TeamRepository tr;
	@Autowired
	MemberRepository mr;

// index, displaying teams button
	@GetMapping("/")
	public ModelAndView home() {
		return new ModelAndView("index");
	}

// to view all members, no edit
	@GetMapping("/members")
	public ModelAndView listMembers() {
		return new ModelAndView("allmems", "members", mr.findAll());
	}

// To view teams
	@GetMapping("/teams")
	public ModelAndView listTeams() {
		return new ModelAndView("teams", "team", tr.findAll());
	}

//to list team members in a specific team
	@GetMapping("/{id}/teammems")
	public ModelAndView listTeamMembers(@PathVariable("id") Long id,
			Optional<Teams> teamList) {
		teamList = tr.findById(id);
		Teams team = teamList.get();

		return new ModelAndView("members", "members", team.getMembersList());// teams.getMembersList()
	}

//to go to edit team page
	@RequestMapping("/{id}/edit")
	public ModelAndView toEditTeams(@PathVariable("id") Teams teams) {
		return new ModelAndView("edit", "id", teams);
	}

// to submit an edit for team
	@PostMapping("/{id}/edit")
	public ModelAndView submitEditTeam(@PathVariable("id") Long id, Teams teams) {
		teams.setTeamId(id);
		tr.save(teams);
		return new ModelAndView("redirect:/teams");
	}

// to delete a team
	@RequestMapping("/{id}/delete")
	public ModelAndView deleteTeam(@PathVariable("id") Long id) {
		tr.deleteById(id);
		return new ModelAndView("redirect:/teams");
	}

	// to members edit page
	@RequestMapping("/{memberId}/{teamId}/editm")
	public ModelAndView toEditMem(@PathVariable("memberId") Long id) {
		return new ModelAndView("editmem", "id", mr.findById(id).orElse(null));
	}

// to submit members edit form
	@PostMapping("/{teamId}/{memberId}/editm")
	public ModelAndView submitEditMem(@PathVariable("memberId") Long id, @PathVariable("teamId") Long tid, Members mems,
			Teams teams) {
		mems.setTeams(tr.getOne(tid));
		mr.save(mems);
		return new ModelAndView("redirect:/teams");
	}


// to delete a member
	@RequestMapping("/{id}/deletem")
	public ModelAndView deleteMem(@PathVariable("id") Long id) {
		mr.deleteById(id);
		return new ModelAndView("redirect:/members");
	}

}
