package Mapping;
// Generated Jun 19, 2015 3:46:43 PM by Hibernate Tools 3.2.1.GA


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Employeeskill generated by hbm2java
 */
public class Employeeskill  implements java.io.Serializable {


     private BigDecimal id;
     private Levellookup levellookupBySkilllevel;
     private Levellookup levellookupByTargetlevel;
     private Employee employee;
     private Skillspecialization skillspecialization;
     private Skillsource skillsource;
     private Date whenshoulddone;
     private Date whenactualdone;
     private BigDecimal numberofyears;
     private Set<Skilltrainingrequired> skilltrainingrequireds = new HashSet<Skilltrainingrequired>(0);

    public Employeeskill() {
    }

	
    public Employeeskill(BigDecimal id, Levellookup levellookupBySkilllevel, Employee employee, Skillspecialization skillspecialization, Skillsource skillsource) {
        this.id = id;
        this.levellookupBySkilllevel = levellookupBySkilllevel;
        this.employee = employee;
        this.skillspecialization = skillspecialization;
        this.skillsource = skillsource;
    }
    public Employeeskill(BigDecimal id, Levellookup levellookupBySkilllevel, Levellookup levellookupByTargetlevel, Employee employee, Skillspecialization skillspecialization, Skillsource skillsource, Date whenshoulddone, Date whenactualdone, BigDecimal numberofyears, Set<Skilltrainingrequired> skilltrainingrequireds) {
       this.id = id;
       this.levellookupBySkilllevel = levellookupBySkilllevel;
       this.levellookupByTargetlevel = levellookupByTargetlevel;
       this.employee = employee;
       this.skillspecialization = skillspecialization;
       this.skillsource = skillsource;
       this.whenshoulddone = whenshoulddone;
       this.whenactualdone = whenactualdone;
       this.numberofyears = numberofyears;
       this.skilltrainingrequireds = skilltrainingrequireds;
    }
   
    public BigDecimal getId() {
        return this.id;
    }
    
    public void setId(BigDecimal id) {
        this.id = id;
    }
    public Levellookup getLevellookupBySkilllevel() {
        return this.levellookupBySkilllevel;
    }
    
    public void setLevellookupBySkilllevel(Levellookup levellookupBySkilllevel) {
        this.levellookupBySkilllevel = levellookupBySkilllevel;
    }
    public Levellookup getLevellookupByTargetlevel() {
        return this.levellookupByTargetlevel;
    }
    
    public void setLevellookupByTargetlevel(Levellookup levellookupByTargetlevel) {
        this.levellookupByTargetlevel = levellookupByTargetlevel;
    }
    public Employee getEmployee() {
        return this.employee;
    }
    
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    public Skillspecialization getSkillspecialization() {
        return this.skillspecialization;
    }
    
    public void setSkillspecialization(Skillspecialization skillspecialization) {
        this.skillspecialization = skillspecialization;
    }
    public Skillsource getSkillsource() {
        return this.skillsource;
    }
    
    public void setSkillsource(Skillsource skillsource) {
        this.skillsource = skillsource;
    }
    public Date getWhenshoulddone() {
        return this.whenshoulddone;
    }
    
    public void setWhenshoulddone(Date whenshoulddone) {
        this.whenshoulddone = whenshoulddone;
    }
    public Date getWhenactualdone() {
        return this.whenactualdone;
    }
    
    public void setWhenactualdone(Date whenactualdone) {
        this.whenactualdone = whenactualdone;
    }
    public BigDecimal getNumberofyears() {
        return this.numberofyears;
    }
    
    public void setNumberofyears(BigDecimal numberofyears) {
        this.numberofyears = numberofyears;
    }
    public Set<Skilltrainingrequired> getSkilltrainingrequireds() {
        return this.skilltrainingrequireds;
    }
    
    public void setSkilltrainingrequireds(Set<Skilltrainingrequired> skilltrainingrequireds) {
        this.skilltrainingrequireds = skilltrainingrequireds;
    }




}


