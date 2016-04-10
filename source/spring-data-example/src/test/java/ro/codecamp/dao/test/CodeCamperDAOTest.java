/**
 * 
 */
package ro.codecamp.dao.test;


import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ro.codecamp.dao.CodeCamperDAO;

/**
 * Unit tests class for {@link CodeCamperDAO}.
 * 
 * @author Cosmin Spinu (cosmin.spinu@tss-yonder.com)
 * @since 10 apr. 2016
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/spring-config/spring-root.xml")
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
        assertNotNull("Not yet implemented");
    }
}