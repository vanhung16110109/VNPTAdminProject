package vn.sesgroup.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import vn.sesgroup.model.NavbarInternetTV;


@Repository
public interface NavbarInternetTVRepository extends MongoRepository<NavbarInternetTV, String> {
}
