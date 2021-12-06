package vn.sesgroup.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import vn.sesgroup.model.NavbarSolutions;


@Repository
public interface NavbarSolutionsRepository extends MongoRepository<NavbarSolutions, String> {
}
