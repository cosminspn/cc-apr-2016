/**
 * 
 */
package ro.codecamp.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ro.codecamp.entity.CodeCamper;

/**
 * DAO Impl (wih Hibernate) for {@link CodeCamper}.
 * 
 * @author Cosmin Spinu (cosmin.spinu@tss-yonder.com)
 * @since 10 apr. 2016
 */
@Repository
@Transactional
public class CodeCamperDAOImpl implements CodeCamperDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

    /*
     * (non-Javadoc)
     * @see ro.codecamp.dao.CodeCamperDAO#create(ro.codecamp.entity.CodeCamper)
     */
    @Override
    public CodeCamper create(CodeCamper codeCamper) {
        return (CodeCamper) getCurrentSession().save(codeCamper);
    }

    /*
     * (non-Javadoc)
     * @see ro.codecamp.dao.CodeCamperDAO#findAll()
     */
    @Override
    public List<CodeCamper> findAll() {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     * @see ro.codecamp.dao.CodeCamperDAO#findById(long)
     */
    @Override
    public CodeCamper findById(long id) {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     * @see ro.codecamp.dao.CodeCamperDAO#update(ro.codecamp.entity.CodeCamper)
     */
    @Override
    public CodeCamper update(CodeCamper codeCamper) {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     * @see ro.codecamp.dao.CodeCamperDAO#delete(long)
     */
    @Override
    public CodeCamper delete(long id) {
        // TODO Auto-generated method stub
        return null;
    }
}