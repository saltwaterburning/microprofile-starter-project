package org.arj.thornbird.demo.app.jpa;

import java.io.Serializable;
import java.util.Objects;
import lombok.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Example JPA Entity.
 * 
 * @see <a href="https://thoughts-on-java.org/ultimate-guide-to-implementing-equals-and-hashcode-with-hibernate/" target="_blank">Equals and Hashcode with Hibernate</a>
 * @see <a href="https://vladmihalcea.com/hypersistence-optimizer/" target="_blank">Hypersistence Optimizer</a>
 */
@Entity
@Table(name = "REST_DB_ACCESS")
@NamedQueries({
        @NamedQuery(name = "Employee.findAll", query = "SELECT e FROM Employee e")
})
@XmlRootElement
@Builder(toBuilder = true)
@AllArgsConstructor(access = AccessLevel.PACKAGE)
@NoArgsConstructor(access = AccessLevel.PACKAGE)
@Setter(value = AccessLevel.PACKAGE)
@Getter
public class Employee implements Serializable {
  private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 40)
    private String name;

    @Override
    public boolean equals(Object obj) {
        if (null == obj)
            return false;
        else if (!(obj instanceof Employee))
            return false;
        Employee that = (Employee) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name);
    }

    @Override
    public int hashCode() {
    	// Return constant id for each entity.
    	return getClass().getName().hashCode();
    }
}