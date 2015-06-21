package Mapping;
// Generated Jun 19, 2015 3:46:43 PM by Hibernate Tools 3.2.1.GA


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Team generated by hbm2java
 */
public class Team  implements java.io.Serializable {


     private BigDecimal id;
     private String name;
     private Set<Employee> employees = new HashSet<Employee>(0);

    public Team() {
    }

	
    public Team(BigDecimal id, String name) {
        this.id = id;
        this.name = name;
    }
    public Team(BigDecimal id, String name, Set<Employee> employees) {
       this.id = id;
       this.name = name;
       this.employees = employees;
    }
   
    public BigDecimal getId() {
        return this.id;
    }
    
    public void setId(BigDecimal id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public Set<Employee> getEmployees() {
        return this.employees;
    }
    
    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }


     @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Team)) {
            return false;
        }
        Team other = (Team) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return name;
    }


}


