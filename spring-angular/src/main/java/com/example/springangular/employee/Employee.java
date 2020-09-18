package com.example.springangular.employee;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Employee {
    private int id;
    private final String name;
    private final String department;
    private final String designation;
    private final String location;

    //getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public String getDesignation() {
        return designation;
    }

    public String getLocation() {
        return location;
    }

    //constructor
    public Employee(@JsonProperty("id") int id,@JsonProperty("name") String name,
                    @JsonProperty("department") String department,@JsonProperty("designation") String designation,
                    @JsonProperty("location") String location) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.designation = designation;
        this.location = location;
    }


}
