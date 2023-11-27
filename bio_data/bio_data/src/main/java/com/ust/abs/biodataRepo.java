package com.ust.abs;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface biodataRepo extends JpaRepository<biodata,Long> {
}
