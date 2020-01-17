package com.booking.commons;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;


public class AgentDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private int idAgent;
	private String agentDetails;
	private String agentName;
	private Set<OfferDTO> offersDTOList ;
	
	public int getIdAgent() {
		return idAgent;
	}
	public void setIdAgent(int idAgent) {
		this.idAgent = idAgent;
	}
	public String getAgentDetails() {
		return agentDetails;
	}
	public void setAgentDetails(String agentDetails) {
		this.agentDetails = agentDetails;
	}
	
	public String getAgentName() {
		return agentName;
	}
	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}
	
	public Set<OfferDTO> getOffersDTOList() {
		return offersDTOList;
	}
	public void setOffersDTOList(Set<OfferDTO> offersDTOList) {
		this.offersDTOList = offersDTOList;
	}
	public AgentDTO(int idAgent, String agentDetails, String agentName) {
		super();
		this.idAgent = idAgent;
		this.agentDetails = agentDetails;
		this.agentName = agentName;
		
	}
	@Override
	public String toString() {
		return "AgentDTO [idAgent=" + idAgent + ", agentDetails=" + agentDetails + ", agentName=" + agentName
				+ ", offersDTOList=" + offersDTOList + "]";
	}
	public AgentDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
