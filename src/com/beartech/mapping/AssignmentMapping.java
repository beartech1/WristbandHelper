package com.beartech.mapping;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(as = OffensiveAssignmentMapping.class)
public interface AssignmentMapping {
}
