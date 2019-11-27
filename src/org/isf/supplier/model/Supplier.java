package org.isf.supplier.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

import org.isf.audit.Auditable;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

/**
 * Supplier generated by hbm2java
 */
@Entity
@Table(name="SUPPLIER")
@EntityListeners(AuditingEntityListener.class) 
public class Supplier extends Auditable<String> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="SUP_ID")
	private Integer supId;
	
	@NotNull
	@Column(name="SUP_NAME")
	private String supName;
	
	@Column(name="SUP_ADDRESS")
	private String supAddress;
	
	@Column(name="SUP_TAXCODE")
	private String supTaxcode;
	
	@Column(name="SUP_PHONE")
	private String supPhone;
	
	@Column(name="SUP_FAX")
	private String supFax;
	
	@Column(name="SUP_EMAIL")
	private String supEmail;
	
	@Column(name="SUP_NOTE")
	private String supNote;
	
	@Column(name="SUP_DELETED")
	private Character supDeleted;
	
	@Transient
	private volatile int hashCode = 0;
	

	/**
	 * 
	 */
	public Supplier() {
		super();
	}

	/**
	 * 
	 * @param supID
	 * @param supName
	 * @param supAddress
	 * @param supTaxcode
	 * @param supPhone
	 * @param supFax
	 * @param supEmail
	 * @param supNote
	 */
	public Supplier(Integer supID, String supName, String supAddress, String supTaxcode, String supPhone, String supFax, String supEmail, String supNote) {
		this.supId = supID;
		this.supName = supName;
		this.supAddress = supAddress;
		this.supTaxcode = supTaxcode;
		this.supPhone = supPhone;
		this.supFax = supFax;
		this.supEmail = supEmail;
		this.supNote = supNote;
		this.supDeleted = 'N';
	}
	
	/**
	 * 
	 * @param supID
	 * @param supName
	 * @param supAddress
	 * @param supTaxcode
	 * @param supPhone
	 * @param supFax
	 * @param supEmail
	 * @param supNote
	 * @param supDeleted
	 */
	public Supplier(Integer supID, String supName, String supAddress, String supTaxcode, String supPhone, String supFax, String supEmail, String supNote, Character supDeleted) {
		this.supId = supID;
		this.supName = supName;
		this.supAddress = supAddress;
		this.supTaxcode = supTaxcode;
		this.supPhone = supPhone;
		this.supFax = supFax;
		this.supEmail = supEmail;
		this.supNote = supNote;
		this.supDeleted = supDeleted;
	}
	
	public Integer getSupId() {
		return this.supId;
	}

	public void setSupId(Integer supId) {
		this.supId = supId;
	}

	public String getSupName() {
		return this.supName;
	}

	public void setSupName(String supName) {
		this.supName = supName;
	}

	public String getSupAddress() {
		return this.supAddress;
	}

	public void setSupAddress(String supAddress) {
		this.supAddress = supAddress;
	}

	public String getSupTaxcode() {
		return this.supTaxcode;
	}

	public void setSupTaxcode(String supTaxcode) {
		this.supTaxcode = supTaxcode;
	}

	public String getSupPhone() {
		return this.supPhone;
	}

	public void setSupPhone(String supPhone) {
		this.supPhone = supPhone;
	}

	public String getSupFax() {
		return this.supFax;
	}

	public void setSupFax(String supFax) {
		this.supFax = supFax;
	}

	public String getSupEmail() {
		return this.supEmail;
	}

	public void setSupEmail(String supEmail) {
		this.supEmail = supEmail;
	}

	public String getSupNote() {
		return this.supNote;
	}

	public void setSupNote(String supNote) {
		this.supNote = supNote;
	}

	public Character getSupDeleted() {
		return this.supDeleted;
	}

	public void setSupDeleted(Character supDeleted) {
		this.supDeleted = supDeleted;
	}

	public String toString() {
		return this.supName;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		
		if (!(obj instanceof Supplier)) {
			return false;
		}
		
		Supplier supplier = (Supplier)obj;
		return (this.getSupId().equals(supplier.getSupId()));
	}

	@Override
	public int hashCode() {
	    if (this.hashCode == 0) {
	        final int m = 23;
	        int c = 133;
	        
	        c = m * c + supId.hashCode();
	        
	        this.hashCode = c;
	    }
	  
	    return this.hashCode;
	}	
}
