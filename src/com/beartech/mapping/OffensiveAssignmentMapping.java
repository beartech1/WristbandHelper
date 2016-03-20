package com.beartech.mapping;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.google.common.collect.ImmutableList;

import java.util.List;

@JsonAutoDetect
public class OffensiveAssignmentMapping implements AssignmentMapping {
	private Long id;
	private String play;
	private String position;
	private String assignment;

	public Long getId() {
		return id;
	}

	public OffensiveAssignmentMapping setId(Long id) {
		this.id = id;
		return this;
	}

	public String getPlay() {
		return play;
	}

	public OffensiveAssignmentMapping setPlay(String play) {
		this.play = play;
		return this;
	}

	public String getPosition() {
		return position;
	}

	public OffensiveAssignmentMapping setPosition(String position) {
		this.position = position;
		return this;
	}

	public String getAssignment() {
		return assignment;
	}

	public OffensiveAssignmentMapping setAssignment(String assignment) {
		this.assignment = assignment;
		return this;
	}
}
