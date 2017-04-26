package com.yikatong.repository;

import com.yikatong.domain.SBNumber;
import com.yikatong.domain.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.ZonedDateTime;
import java.util.List;
import java.util.Optional;

/**
 * Spring Data JPA repository for the User entity.
 */
public interface SBNumberRepository extends JpaRepository<SBNumber, Long> {

}
