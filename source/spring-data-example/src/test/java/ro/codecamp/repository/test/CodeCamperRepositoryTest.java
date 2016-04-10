package ro.codecamp.repository.test;


import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import ro.codecamp.repository.CodeCamperRepository;

/**
 * Unit tests class for {@link CodeCamperRepository}.
 * 
 * @author Cosmin Spinu (cosmin.spinu@tss-yonder.com)
 * @since 10 apr. 2016
 */
public class CodeCamperRepositoryTest {
    
    @Autowired
    private CodeCamperRepository codeCamperRepository;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void test() {
        fail("Not yet implemented");
    }

}