/**
 * 
 */
package ro.codecamp.dao.test;


import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import ro.codecamp.dao.CodeCamperDAO;

/**
 * Unit tests class for {@link CodeCamperDAO}.
 * 
 * @author Cosmin Spinu (cosmin.spinu@tss-yonder.com)
 * @since 10 apr. 2016
 */
public class CodeCamperDAOTest {
    
    @Autowired
    private CodeCamperDAO codeCamperDAO;

    /**
     * @throws java.lang.Exception
     * @author Cosmin Spinu (cosmin.spinu@tss-yonder.com)
     * @since 10 apr. 2016
     */
    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void test() {
        fail("Not yet implemented");
    }
}