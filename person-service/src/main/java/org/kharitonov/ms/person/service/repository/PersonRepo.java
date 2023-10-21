package org.kharitonov.ms.person.service.repository;

import org.kharitonov.ms.person.service.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepo extends JpaRepository<Person, Long>, PagingAndSortingRepository<Person , Long>{

}
