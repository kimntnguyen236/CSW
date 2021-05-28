/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author lenovo
 */
@Entity
@Table(name = "tbEmployee")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbEmployee.checklogin", query = "SELECT t FROM TbEmployee t WHERE t.employeecode = :employeecode AND t.password = :password"),
    @NamedQuery(name = "TbEmployee.findAll", query = "SELECT t FROM TbEmployee t"),
    @NamedQuery(name = "TbEmployee.findByEmployeecode", query = "SELECT t FROM TbEmployee t WHERE t.employeecode = :employeecode"),
    @NamedQuery(name = "TbEmployee.findByEmployeename", query = "SELECT t FROM TbEmployee t WHERE t.employeename = :employeename"),
    @NamedQuery(name = "TbEmployee.findByPassword", query = "SELECT t FROM TbEmployee t WHERE t.password = :password"),
    @NamedQuery(name = "TbEmployee.findByPhone", query = "SELECT t FROM TbEmployee t WHERE t.phone = :phone"),
    @NamedQuery(name = "TbEmployee.findBySalary", query = "SELECT t FROM TbEmployee t WHERE t.salary = :salary")})
public class TbEmployee implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "employeecode")
    private String employeecode;
    @Size(max = 50)
    @Column(name = "employeename")
    private String employeename;
    @Size(max = 20)
    @Column(name = "password")
    private String password;
    // @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", message="Invalid phone/fax format, should be as xxx-xxx-xxxx")//if the field contains phone or fax number consider using this annotation to enforce field validation
    @Size(max = 20)
    @Column(name = "phone")
    private String phone;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "salary")
    private BigDecimal salary;

    public TbEmployee() {
    }

    public TbEmployee(String employeecode) {
        this.employeecode = employeecode;
    }

    public String getEmployeecode() {
        return employeecode;
    }

    public void setEmployeecode(String employeecode) {
        this.employeecode = employeecode;
    }

    public String getEmployeename() {
        return employeename;
    }

    public void setEmployeename(String employeename) {
        this.employeename = employeename;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (employeecode != null ? employeecode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbEmployee)) {
            return false;
        }
        TbEmployee other = (TbEmployee) object;
        if ((this.employeecode == null && other.employeecode != null) || (this.employeecode != null && !this.employeecode.equals(other.employeecode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.TbEmployee[ employeecode=" + employeecode + " ]";
    }
    
}
