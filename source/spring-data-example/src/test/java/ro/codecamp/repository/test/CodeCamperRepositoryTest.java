package ro.codecamp.repository.test;


import static ro.codecamp.util.DateUtil.createDate;
import static ro.codecamp.util.DateUtil.now;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ro.codecamp.entity.CodeCamper;
import ro.codecamp.predicate.CodeCamperPredicate;
import ro.codecamp.repository.CodeCamperRepository;

/**
 * Unit tests class for {@link CodeCamperRepository}.
 * 
 * @author Cosmin Spinu (cosmin.spinu@tss-yonder.com)
 * @since 10 apr. 2016
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/spring-config/spring-root.xml")
public class CodeCamperRepositoryTest {
    
    @Autowired
    private CodeCamperRepository codeCamperRepository;

    CodeCamper codeCamper1 = null;
    CodeCamper codeCamper2 = null;

    /**
     * @throws java.lang.Exception
     * @author Cosmin Spinu (cosmin.spinu@tss-yonder.com)
     * @since 10 apr. 2016
     */
    @Before
    public void setUp() throws Exception {
        codeCamper1 = new CodeCamper("Cosmin", "Spinu", "cosmin.spinu@tss-yonder.com", createDate(1989, 7, 9), now(), true, "Java");
        codeCamper2 = new CodeCamper("Cosmin1", "Spinu2", "cosmin1.spinu1@tss-yonder.com", createDate(1990, 8, 10), now(), false, "C#");

    }

    @Test
    public void create() {
        CodeCamper created1 = codeCamperRepository.save(codeCamper1);
        Assert.assertNotNull(created1.getId());
        
        CodeCamper found = codeCamperRepository.findById(created1.getId());
        Assert.assertNotNull(found);
        
        CodeCamper created2 = codeCamperRepository.save(codeCamper2);
        Assert.assertNotNull(created2.getId());
        
        List<CodeCamper> allCodeCampers = codeCamperRepository.findAll();
        Assert.assertTrue(allCodeCampers.size() == 2);
        
        String email = "cosmin2.spinu2@tss-yonder.com";
        created2.setEmail(email);
        created2 = codeCamperRepository.save(created2);
        
        CodeCamper found2 = codeCamperRepository.findByEmail(email);
        Assert.assertNotNull(found2);
        
        List<CodeCamper> confirmed = codeCamperRepository.getByIsConfirmedTrue();
        Assert.assertTrue(confirmed.size() == 1);
        System.out.println("Confirmed codecampers:" + confirmed.toString());
        
        Iterable<CodeCamper> byFirstName = codeCamperRepository.findAll(CodeCamperPredicate.hasFirstName("Cosmin"));
        
        codeCamperRepository.delete(created1.getId());
        Assert.assertNull(codeCamperRepository.findById(created1.getId()));
        
        codeCamperRepository.delete(created2.getId());
        Assert.assertNull(codeCamperRepository.findById(created2.getId()));
    }
}