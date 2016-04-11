package ro.codecamp.dao;

import java.util.List;

import ro.codecamp.core.AbstractDAO;
import ro.codecamp.entity.CodeCamper;

/**
 * DAO interface for {@link CodeCamper}.
 * 
 * @author Cosmin Spinu (cosmin.spinu@tss-yonder.com)
 * @since 10 apr. 2016
 */
public interface CodeCamperDAO extends AbstractDAO {

    /**
     * Creates a {@link CodeCamper}.
     * 
     * @author Cosmin Spinu (cosmin.spinu@tss-yonder.com)
     * @since 10 apr. 2016
     */
    public CodeCamper create(CodeCamper codeCamper);

    /**
     * Find all code campers.
     * 
     * @author Cosmin Spinu (cosmin.spinu@tss-yonder.com)
     * @since 10 apr. 2016
     */
    public List<CodeCamper> findAll();

    /**
     * Find {@link CodeCamper} by id (PK).
     * 
     * @author Cosmin Spinu (cosmin.spinu@tss-yonder.com)
     * @since 10 apr. 2016
     */
    public CodeCamper findById(long id);

    /**
     * Update a {@link CodeCamper}.
     * 
     * @author Cosmin Spinu (cosmin.spinu@tss-yonder.com)
     * @since 10 apr. 2016
     */
    public CodeCamper update(CodeCamper codeCamper);

    /**
     * Delete a {@link CodeCamper} by id.
     * 
     * @author Cosmin Spinu (cosmin.spinu@tss-yonder.com)
     * @since 10 apr. 2016
     */
    public CodeCamper delete(long id);

    /**
     * Find a {@link CodeCamper} by email.
     * 
     * @author Cosmin Spinu (cosmin.spinu@tss-yonder.com)
     * @since 11 apr. 2016
     */
    public CodeCamper findByEmail(String email);

    /**
     * Find all confirmed code campers.
     * 
     * @since 11 apr. 2016
     */
    public List<CodeCamper> getByIsConfirmedTrue();
}