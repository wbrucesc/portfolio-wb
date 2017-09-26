package com.will.portfoliowb.repositories;

import com.will.portfoliowb.Models.Project;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepo extends CrudRepository<Project, Long> {

}
