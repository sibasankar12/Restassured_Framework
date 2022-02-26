package com.rmgyantra.pojolib;

public class PojoLib {
	
	public String createdBy;
	public String projectName;
	public String status;
	public long teamsize;
	
	public  PojoLib(String createdBy,String projectName,String status,long teamsize )
	{
		this.createdBy=createdBy;
		this.projectName=projectName;
		this.status=status;
		this.teamsize=teamsize;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public long getTeamsize() {
		return teamsize;
	}

	public void setTeamsize(long teamsize) {
		this.teamsize = teamsize;
	}
	
	

}
