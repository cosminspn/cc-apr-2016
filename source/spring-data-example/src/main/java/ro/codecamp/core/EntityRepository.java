/**
 * 
 */
package ro.codecamp.core;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * @author Cosmin Spinu (cosmin.spinu@tss-yonder.com)
 * @since 10 apr. 2016
 */
@NoRepositoryBean
public interface EntityRepository<T extends BaseEntity> extends JpaRepository<T, Long> {

    /**
     * Search record by id.
     * 
     * @param id The id of the requested record
     * @return The record with the specified id.
     * 
     * @author Cosmin Spinu (cosmin.spinu@tss-yonder.com)
     * @since 10 apr. 2016
     */
    public T findById(long id);
}