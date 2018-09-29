package src;

import java.util.Date;

import javax.persistence.Column;
//import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class User {
	
	@Id
    @Column(name="id", nullable=false, unique=true)
    private int id;
     
    @Column(name="userName", nullable=false, unique=true)
    private String userName;
     
    @Column(name="password", nullable=false, unique=false)
    private String password;
    
    @Column(name="group_IDGroup",unique=false,nullable=true)
    private int IDGroup;
    
    @Column(name="lastAccess", unique=true)
    @Temporal(TemporalType.DATE)
    private Date lastAcess;
     
    @Column(name="region_IDRegion",unique=false,nullable=true)
    private int IDRegion;
    
    @Column(name="acess_level_IDLevel",unique=false,nullable=true)
    private int IDLevel;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getIDGroup() {
		return IDGroup;
	}

	public void setIDGroup(int iDGroup) {
		IDGroup = iDGroup;
	}

	public Date getLastAcess() {
		return lastAcess;
	}

	public void setLastAcess(Date lastAcess) {
		this.lastAcess = lastAcess;
	}

	public int getIDRegion() {
		return IDRegion;
	}

	public void setIDRegion(int iDRegion) {
		IDRegion = iDRegion;
	}

	public int getIDLevel() {
		return IDLevel;
	}

	public void setIDLevel(int iDLevel) {
		IDLevel = iDLevel;
	}
    
    
    
}
