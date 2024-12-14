package andre.dev.content_calendar.repository;

import andre.dev.content_calendar.model.Content;
import andre.dev.content_calendar.model.Status;
import jakarta.validation.constraints.NotBlank;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ContentRepository extends ListCrudRepository<Content, Integer> {

    List<Content> findContentByTitleContains(String keyword);

    @Query("""
        SELECT * FROM Content
        WHERE status = :status
    """)
    List<Content> listByStatus(@Param("status") Status status);
}
