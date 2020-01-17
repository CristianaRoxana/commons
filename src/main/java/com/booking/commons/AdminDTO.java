package com.booking.commons;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;




public class AdminDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String email;
	private String password;
	private Set<AgentDTO> agentDTOList ;
	@Override
	public String toString() {
		return "AdminDTO [id=" + id + ", email=" + email + ", password=" + password + ", agentDTOList=" + agentDTOList
				+ "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Set<AgentDTO> getAgentDTOList() {
		return agentDTOList;
	}
	public void setAgentDTOList(Set<AgentDTO> agentDTOList) {
		this.agentDTOList = agentDTOList;
	}
	
	

}
