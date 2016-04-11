/**
 * 
 */
package ro.codecamp.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
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
        getCurrentSession().save(codeCamper);
        return codeCamper;
    }

    /*
     * (non-Javadoc)
     * @see ro.codecamp.dao.CodeCamperDAO#findAll()
     */
    @SuppressWarnings("unchecked")
    @Override
    public List<CodeCamper> findAll() {
        return getCurrentSession().createCriteria(CodeCamper.class).list();
    }

    /*
     * (non-Javadoc)
     * @see ro.codecamp.dao.CodeCamperDAO#findById(long)
     */
    @Override
    public CodeCamper findById(long id) {
        return getCurrentSession().get(CodeCamper.class, id);
    }

    /*
     * (non-Javadoc)
     * @see ro.codecamp.dao.CodeCamperDAO#update(ro.codecamp.entity.CodeCamper)
     */
    @Override
    public CodeCamper update(CodeCamper codeCamper) {
        getCurrentSession().saveOrUpdate(codeCamper);
        return codeCamper;
    }

    /*
     * (non-Javadoc)
     * @see ro.codecamp.dao.CodeCamperDAO#delete(long)
     */
    @Override
    public CodeCamper delete(long id) {
        CodeCamper toBeDeleted = getCurrentSession().get(CodeCamper.class, id);
        getCurrentSession().delete(toBeDeleted);
        return toBeDeleted;
    }

    /*
     * (non-Javadoc)
     * @see ro.codecamp.dao.CodeCamperDAO#findByEmail(String)
     */
    @Override
    public CodeCamper findByEmail(String email) {
        return (CodeCamper) getCurrentSession().createCriteria(CodeCamper.class).add(Restrictions.eq("email", email)).uniqueResult();
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<CodeCamper> getByIsConfirmedTrue() {
        return getCurrentSession().createCriteria(CodeCamper.class).add(Restrictions.eq("isConfirmed", Boolean.TRUE)).list();
    }
}