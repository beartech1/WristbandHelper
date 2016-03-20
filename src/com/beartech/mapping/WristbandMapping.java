package com.beartech.mapping;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.util.List;

@JsonAutoDetect
public class WristbandMapping {
	private String phase;
	private List<String> plays;
	private List<String> positions;
	private List<AssignmentMapping> assignments;

	public String getPhase() {
		return phase;
	}

	public WristbandMapping setPhase(String phase) {
		this.phase = phase;
		return this;
	}

	public List<String> getPlays() {
		return plays;
	}

	public WristbandMapping setPlays(List<String> plays) {
		this.plays = plays;
		return this;
	}

	public List<String> getPositions() {
		return positions;
	}

	public WristbandMapping setPositions(List<String> positions) {
		this.positions = positions;
		return this;
	}

	public List<AssignmentMapping> getAssignments() {
		return assignments;
	}

	public WristbandMapping setAssignments(List<AssignmentMapping> assignments) {
		this.assignments = assignments;
		return this;
	}
}
