package com.ust.project;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicationDataRepository extends JpaRepository<Application,Long> {
}
