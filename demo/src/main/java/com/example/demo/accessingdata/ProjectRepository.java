package com.example.demo.accessingdata;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.accessingdata.Project;

public interface ProjectRepository extends CrudRepository<Project, Integer> {

}
