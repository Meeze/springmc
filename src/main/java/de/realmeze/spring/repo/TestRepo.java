package de.realmeze.spring.repo;

import de.realmeze.spring.model.Test;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface TestRepo extends CrudRepository<Test, Long> {


}
