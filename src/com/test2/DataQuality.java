package com.test2;

public class DataQuality {
	private int datasourcedId;
	private String DataOwner;
	private String DataSteward;
	private int DataCustodian;

	public DataQuality() {

	}

	public DataQuality(int datasourcedId, String dataOwner, String dataSteward, int dataCustodian) {
		super();
		this.datasourcedId = datasourcedId;
		DataOwner = dataOwner;
		DataSteward = dataSteward;
		DataCustodian = dataCustodian;
	}

	public int getDatasourcedId() {
		return datasourcedId;
	}

	public void setDatasourcedId(int datasourcedId) {
		this.datasourcedId = datasourcedId;
	}

	public String getDataOwner() {
		return DataOwner;
	}

	public void setDataOwner(String dataOwner) {
		DataOwner = dataOwner;
	}

	public String getDataSteward() {
		return DataSteward;
	}

	public void setDataSteward(String dataSteward) {
		DataSteward = dataSteward;
	}

	public int getDataCustodian() {
		return DataCustodian;
	}

	public void setDataCustodian(int dataCustodian) {
		DataCustodian = dataCustodian;
	}

}
