package ro.codecamp.predicate;

import com.querydsl.core.types.Predicate;

import ro.codecamp.entity.CodeCamper;
import ro.codecamp.entity.QCodeCamper;

/**
 * Predicates for {@link CodeCamper}.
 * 
 * @author Cosmin Spinu (cosmin.spinu@tss-yonder.com)
 * @since 22 apr. 2016
 */
public final class CodeCamperPredicate {
    
    private CodeCamperPredicate(){
    }
    
    public static Predicate hasFirstName(String firstName) {
        return QCodeCamper.codeCamper.firstName.eq(firstName);
    }

}