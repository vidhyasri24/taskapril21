package encapsulation;

public class Student {
	private int admissionId, phoneNumber;
	private String name;
	private String eMail;
	

	public int getAdmissionId() {
		return admissionId;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public String getName() {
		return name;
	}

	public String geteMail() {
		return eMail;
	}

	public void setAdmissionId(int admissionId) {
		this.admissionId = admissionId;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

}
