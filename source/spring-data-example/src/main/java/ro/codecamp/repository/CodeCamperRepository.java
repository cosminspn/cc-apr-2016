package ro.codecamp.repository;

import java.util.List;

import ro.codecamp.core.EntityRepository;
import ro.codecamp.entity.CodeCamper;

/**
 * Repository (with Spring Data JPA) for {@link CodeCamper}.
 * 
 * @author Cosmin Spinu (cosmin.spinu@tss-yonder.com)
 * @since 10 apr. 2016
 */
public interface CodeCamperRepository extends EntityRepository<CodeCamper> {

    /**
     * Find by e-mail.
     *
     * @author Cosmin Spinu (cosmin.spinu@tss-yonder.com)
     * @since 11 apr. 2016
     */
    public CodeCamper findByEmail(String email);

    /**
     * Find the confirmed code campers.
     * 
     * @author Cosmin Spinu (cosmin.spinu@tss-yonder.com)
     * @since 11 apr. 2016
     */
    public List<CodeCamper> getByIsConfirmedTrue();
}