package vn.sesgroup.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import vn.sesgroup.model.FooterVNPTInfo;

@Repository
public interface FooterVNPTInfoRepository extends MongoRepository<FooterVNPTInfo, String> {
}
