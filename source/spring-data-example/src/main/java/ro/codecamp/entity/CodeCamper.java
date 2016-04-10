/**
 * 
 */
package ro.codecamp.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import ro.codecamp.core.BaseEntity;

/**
 * Entity for code campers.
 * 
 * @author Cosmin Spinu (cosmin.spinu@tss-yonder.com)
 * @since 10 apr. 2016
 */
@Entity
@Table(name = "code_campers", schema = "codecamp")
public class CodeCamper extends BaseEntity {

}