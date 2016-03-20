package com.beartech.mapping;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.util.List;

@JsonDeserialize(as = OffensiveAssignmentMapping.class)
public interface AssignmentMapping {
}
