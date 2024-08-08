package softgrid.bms.entity;

import java.util.Date;

import jakarta.persistence.*;

@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private long custId ;
	private String cusName;
	
	@Column(unique=true)
	private String email;
	private String adharNo;
	private Date birthDate;
	private long balance;
	private String accOpenDate;
	private String address;
	/**
	 * @return the custId
	 */
	public long getCustId() {
		return custId;
	}
	/**
	 * @param custId the custId to set
	 */
	public void setCustId(long custId) {
		this.custId = custId;
	}
	/**
	 * @return the cusName
	 */
	public String getCusName() {
		return cusName;
	}
	/**
	 * @param cusName the cusName to set
	 */
	public void setCusName(String cusName) {
		this.cusName = cusName;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the adharNo
	 */
	public String getAdharNo() {
		return adharNo;
	}
	/**
	 * @param adharNo the adharNo to set
	 */
	public void setAdharNo(String adharNo) {
		this.adharNo = adharNo;
	}
	/**
	 * @return the birthDate
	 */
	public Date getBirthDate() {
		return birthDate;
	}
	/**
	 * @param birthDate the birthDate to set
	 */
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	/**
	 * @return the balance
	 */
	public long getBalance() {
		return balance;
	}
	/**
	 * @param balance the balance to set
	 */
	public void setBalance(long balance) {
		this.balance = balance;
	}
	/**
	 * @return the accOpenDate
	 */
	public String getAccOpenDate() {
		return accOpenDate;
	}
	/**
	 * @param accOpenDate the accOpenDate to set
	 */
	public void setAccOpenDate(String accOpenDate) {
		this.accOpenDate = accOpenDate;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Customer(long custId, String cusName, String email, String adharNo, Date birthDate, long balance,
			String accOpenDate, String address) {
		super();
		this.custId = custId;
		this.cusName = cusName;
		this.email = email;
		this.adharNo = adharNo;
		this.birthDate = birthDate;
		this.balance = balance;
		this.accOpenDate = accOpenDate;
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", cusName=" + cusName + ", email=" + email + ", adharNo=" + adharNo
				+ ", birthDate=" + birthDate + ", balance=" + balance + ", accOpenDate=" + accOpenDate + ", address="
				+ address + "]";
	}
	
	

}
