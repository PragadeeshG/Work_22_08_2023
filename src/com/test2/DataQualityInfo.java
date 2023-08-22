package com.test2;

public class DataQualityInfo {
	private int ccleld;
	private String dataOwner;
	private String certificateDate;
	private String nextCycleDate;
	private String dataOwnerAction;
	private String remarks;
	private String creationDate;
	private String modifiedDate;
	private String status;

	public DataQualityInfo() {

	}

	public DataQualityInfo(int ccleld, String dataOwner, String certificateDate, String nextCycleDate,
			String dataOwnerAction, String remarks, String creationDate, String modifiedDate, String status) {
		super();
		this.ccleld = ccleld;
		this.dataOwner = dataOwner;
		this.certificateDate = certificateDate;
		this.nextCycleDate = nextCycleDate;
		this.dataOwnerAction = dataOwnerAction;
		this.remarks = remarks;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.status = status;
	}

	public int getCcleld() {
		return ccleld;
	}

	public void setCcleld(int ccleld) {
		this.ccleld = ccleld;
	}

	public String getDataOwner() {
		return dataOwner;
	}

	public void setDataOwner(String dataOwner) {
		this.dataOwner = dataOwner;
	}

	public String getCertificateDate() {
		return certificateDate;
	}

	public void setCertificateDate(String certificateDate) {
		this.certificateDate = certificateDate;
	}

	public String getNextCycleDate() {
		return nextCycleDate;
	}

	public void setNextCycleDate(String nextCycleDate) {
		this.nextCycleDate = nextCycleDate;
	}

	public String getDataOwnerAction() {
		return dataOwnerAction;
	}

	public void setDataOwnerAction(String dataOwnerAction) {
		this.dataOwnerAction = dataOwnerAction;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
