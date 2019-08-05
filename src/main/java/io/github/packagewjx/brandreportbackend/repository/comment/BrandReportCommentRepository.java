package io.github.packagewjx.brandreportbackend.repository.comment;

import io.github.packagewjx.brandreportbackend.domain.comment.BrandReportComment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BrandReportCommentRepository extends MongoRepository<BrandReportComment, String> {
    List<BrandReportComment> findByBrandReportId(String brandReportId);

    List<BrandReportComment> findByUserId(String userid);

    @Query(value = "{'reportId':?0, 'userId':?1}")
    List<BrandReportComment> findByBrandReportIdAndUserId(String brandReportId, String userid);

    void deleteByBrandReportId(String brandReportId);

    void deleteByUserId(String userid);
}
