/**
 * 
 */
package ro.codecamp.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

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

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "birth_date", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date birthDate;

    @Column(name = "registration_date", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date registrationDate;

    @Column(name = "is_confirmed", nullable = true)
    private Boolean isConfirmed;

    @Column(name = "main_technology")
    private String mainTechnology;

    public CodeCamper() {
        super();
    }

    public CodeCamper(String firstName, String lastName, String email, Date birthDate, Date registrationDate, Boolean isConfirmed, String mainTechnology) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.birthDate = birthDate;
        this.registrationDate = registrationDate;
        this.isConfirmed = isConfirmed;
        this.mainTechnology = mainTechnology;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public Boolean getIsConfirmed() {
        return isConfirmed;
    }

    public void setIsConfirmed(Boolean isConfirmed) {
        this.isConfirmed = isConfirmed;
    }

    public String getMainTechnology() {
        return mainTechnology;
    }

    public void setMainTechnology(String mainTechnology) {
        this.mainTechnology = mainTechnology;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((birthDate == null) ? 0 : birthDate.hashCode());
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
        result = prime * result + ((isConfirmed == null) ? 0 : isConfirmed.hashCode());
        result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
        result = prime * result + ((mainTechnology == null) ? 0 : mainTechnology.hashCode());
        result = prime * result + ((registrationDate == null) ? 0 : registrationDate.hashCode());
        return result;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj)) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        CodeCamper other = (CodeCamper) obj;
        if (birthDate == null) {
            if (other.birthDate != null) {
                return false;
            }
        } else if (!birthDate.equals(other.birthDate)) {
            return false;
        }
        if (email == null) {
            if (other.email != null) {
                return false;
            }
        } else if (!email.equals(other.email)) {
            return false;
        }
        if (firstName == null) {
            if (other.firstName != null) {
                return false;
            }
        } else if (!firstName.equals(other.firstName)) {
            return false;
        }
        if (isConfirmed == null) {
            if (other.isConfirmed != null) {
                return false;
            }
        } else if (!isConfirmed.equals(other.isConfirmed)) {
            return false;
        }
        if (lastName == null) {
            if (other.lastName != null) {
                return false;
            }
        } else if (!lastName.equals(other.lastName)) {
            return false;
        }
        if (mainTechnology == null) {
            if (other.mainTechnology != null) {
                return false;
            }
        } else if (!mainTechnology.equals(other.mainTechnology)) {
            return false;
        }
        if (registrationDate == null) {
            if (other.registrationDate != null) {
                return false;
            }
        } else if (!registrationDate.equals(other.registrationDate)) {
            return false;
        }
        return true;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("CodeCamper [firstName=").append(firstName).append(", lastName=").append(lastName).append(", email=").append(email).append(", birthDate=").append(birthDate)
                .append(", registrationDate=").append(registrationDate).append(", isConfirmed=").append(isConfirmed).append(", mainTechnology=").append(mainTechnology)
                .append(", id=").append(getId()).append("]");
        return builder.toString();
    }
}