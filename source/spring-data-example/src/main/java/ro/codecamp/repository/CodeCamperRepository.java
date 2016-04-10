package ro.codecamp.repository;

import ro.codecamp.core.EntityRepository;
import ro.codecamp.entity.CodeCamper;

/**
 * Repository (with Spring Data JPA) for {@link CodeCamper}.
 * 
 * @author Cosmin Spinu (cosmin.spinu@tss-yonder.com)
 * @since 10 apr. 2016
 */
public interface CodeCamperRepository extends EntityRepository<CodeCamper> {

}