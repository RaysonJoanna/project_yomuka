package yomuka.cornel.hospital;

import java.util.ArrayList;

public class Hospital {	
	private int hospitalId;         //병원아이디
	private String hospitalName;	//병원이름
	private String clinicTime;		//진료시간 정보
	private String address;			//주소
	
	private ArrayList<ClinicKind> clinicKindList = new ArrayList<ClinicKind>();
	private ArrayList<Reserved> reservedList = new ArrayList<Reserved>();
	
	public Hospital(int hospitalId, String hospitalName, String clinicTime, String address) {
		this.hospitalId = hospitalId;
		this.hospitalName = hospitalName;
		this.clinicTime = clinicTime;	
		this.address = address;
	}

	public int getHospitalId() {
		return hospitalId;
	}

	public void setHospitalId(int hospitalId) {
		this.hospitalId = hospitalId;
	}

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public String getClinicTime() {
		return clinicTime;
	}

	public void setClinicTime(String clinicTime) {
		this.clinicTime = clinicTime;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public ArrayList<ClinicKind> getClinicKindList() {
		return clinicKindList;
	}

	public void addClinicKind(ClinicKind clinicKind) {
		clinicKindList.add(clinicKind);
	}
	
	public ArrayList<Reserved> getReservedList() {
		return reservedList;
	}

	public void addReserved(Reserved reserved) {
		reservedList.add(reserved);
	}
			
}
