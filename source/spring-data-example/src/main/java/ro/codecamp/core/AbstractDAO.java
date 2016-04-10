package ro.codecamp.core;

import org.hibernate.Session;

/**
 * Abstract DAO.
 * 
 * @author CosminS
 *
 */
public interface AbstractDAO {

	/**
	 * Returns the current session.
	 * 
	 * @return the current session.
	 */
	public Session getCurrentSession();
}