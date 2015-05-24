/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Savio
 */
@Entity
@Table(name = "tbl_courses", catalog = "university", schema = "university")
@NamedQueries({
    @NamedQuery(name = "tblCoursesList.findAll", query = "SELECT u FROM tblCoursesList u"),
    @NamedQuery(name = "tblCoursesList.findByCode", query = "SELECT u FROM tblCoursesList u WHERE u.code = :code"),
    @NamedQuery(name = "tblCoursesList.findByName", query = "SELECT u FROM tblCoursesList u WHERE u.name = :name"),
    @NamedQuery(name = "tblCoursesList.findByDescription", query = "SELECT u FROM tblCoursesList u WHERE u.description = :description"),
    @NamedQuery(name = "tblCoursesList.findByType", query = "SELECT u FROM tblCoursesList u WHERE u.type = :type"),
    @NamedQuery(name = "tblCoursesList.findByNumberofcredit", query = "SELECT u FROM tblCoursesList u WHERE u.numberofcredit = :numberofcredit"),
    @NamedQuery(name = "tblCoursesList.findByLab", query = "SELECT u FROM tblCoursesList u WHERE u.lab = :lab")})
public class TblCourses implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "code")
    private String code;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @Basic(optional = false)
    @Column(name = "type")
    private String type;
    @Basic(optional = false)
    @Column(name = "numberofcredit")
    private String numberofcredit;
    @Basic(optional = false)
    @Column(name = "lab")
    private String lab;

    public TblCourses() {
    }

    public TblCourses(String code) {
        this.code = code;
    }

    public TblCourses(String code, String name, String type, String numberofcredit, String lab) {
        this.code = code;
        this.name = name;
        this.type = type;
        this.numberofcredit = numberofcredit;
        this.lab = lab;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        String oldCode = this.code;
        this.code = code;
        changeSupport.firePropertyChange("code", oldCode, code);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        changeSupport.firePropertyChange("name", oldName, name);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        String oldDescription = this.description;
        this.description = description;
        changeSupport.firePropertyChange("description", oldDescription, description);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        String oldType = this.type;
        this.type = type;
        changeSupport.firePropertyChange("type", oldType, type);
    }

    public String getNumberofcredit() {
        return numberofcredit;
    }

    public void setNumberofcredit(String numberofcredit) {
        String oldNumberofcredit = this.numberofcredit;
        this.numberofcredit = numberofcredit;
        changeSupport.firePropertyChange("numberofcredit", oldNumberofcredit, numberofcredit);
    }

    public String getLab() {
        return lab;
    }

    public void setLab(String lab) {
        String oldLab = this.lab;
        this.lab = lab;
        changeSupport.firePropertyChange("lab", oldLab, lab);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (code != null ? code.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblCourses)) {
            return false;
        }
        TblCourses other = (TblCourses) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "university.University_1[ code=" + code + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
