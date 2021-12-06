package vn.sesgroup.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import vn.sesgroup.model.PageInternet;


@Repository
public interface PageInternetRepository extends MongoRepository<PageInternet, String> {
}
