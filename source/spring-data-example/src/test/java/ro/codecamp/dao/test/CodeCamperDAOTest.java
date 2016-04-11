/**
 * 
 */
package ro.codecamp.dao.test;

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

import ro.codecamp.dao.CodeCamperDAO;
import ro.codecamp.entity.CodeCamper;

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
        
        CodeCamper created1 = codeCamperDAO.create(codeCamper1);
        Assert.assertNotNull(created1.getId());
        System.out.println("Created:" + created1.toString());
        
        CodeCamper found = codeCamperDAO.findById(created1.getId());
        Assert.assertNotNull(found);
        System.out.println("Found:" + created1.toString());
       
        
        CodeCamper created2 = codeCamperDAO.create(codeCamper2);
        Assert.assertNotNull(created2.getId());
        System.out.println("Created:" + created2.toString());
        
        List<CodeCamper> allCodeCampers = codeCamperDAO.findAll();
        Assert.assertTrue(allCodeCampers.size() == 2);
        System.out.println("Found list:" + allCodeCampers.toString());
        
        created2.setEmail("cosmin2.spinu2@tss-yonder.com");
        created2 = codeCamperDAO.update(created2);
        System.out.println("Updated:" + created2.toString());
        
        CodeCamper found2 = codeCamperDAO.findByEmail("cosmin2.spinu2@tss-yonder.com");
        Assert.assertNotNull(found2);
        System.out.println("Found by email:" + found2.toString());
        
        List<CodeCamper> confirmed = codeCamperDAO.getByIsConfirmedTrue();
        Assert.assertTrue(confirmed.size() == 1);
        System.out.println("Confirmed codecampers:" + confirmed.toString());
        
        codeCamperDAO.delete(created1.getId());
        Assert.assertNull(codeCamperDAO.findById(created1.getId()));
        System.out.println("Deleted:" + created1.toString());
        
        codeCamperDAO.delete(created2.getId());
        Assert.assertNull(codeCamperDAO.findById(created2.getId()));
        System.out.println("Deleted:" + created2.toString());
    }
}