package yomuka.cornel.hospital;

public class ClinicKind {
	int  	clinicKindId;			//진료과목아이디
	String 	clinicKindName;			//진료과목
	String 	clinicKindContents;		//진료내용
	
	public ClinicKind(int clinicKindId, String clinicKindName, String clinicKindContents) {
		this.clinicKindId = clinicKindId;
		this.clinicKindName = clinicKindName;
		this.clinicKindContents = clinicKindContents;
	}

	public int getClinicKindId() {
		return clinicKindId;
	}

	public void setClinicKindId(int clinicKindId) {
		this.clinicKindId = clinicKindId;
	}

	public String getClinicKindName() {
		return clinicKindName;
	}

	public void setClinicKindName(String clinicKindName) {
		this.clinicKindName = clinicKindName;
	}

	public String getClinicKindContents() {
		return clinicKindContents;
	}

	public void setClinicKindContents(String clinicKindContents) {
		this.clinicKindContents = clinicKindContents;
	}

	public String toString() {
		return "진료과목아이디 : " + clinicKindId + " , 진료과목 : " + clinicKindName + " 진료내용 : " + clinicKindContents ; 
	}
	
}
