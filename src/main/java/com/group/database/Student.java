package com.group.database;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Student {
    private String id;
    private String name;
    private String majorId;

    @Override
    public String toString() {
        return String.format("%-10s||%20s||%3s||", id, name, majorId);
    }
}
