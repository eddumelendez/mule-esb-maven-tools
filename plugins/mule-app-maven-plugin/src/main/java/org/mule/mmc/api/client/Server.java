package org.mule.mmc.api.client;

/**
 * @author Eddú Meléndez
 */
public class Server {

	private String name;

	private String agentUrl;

	private String groupIds;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAgentUrl() {
		return this.agentUrl;
	}

	public void setAgentUrl(String agentUrl) {
		this.agentUrl = agentUrl;
	}

	public String getGroupIds() {
		return this.groupIds;
	}

	public void setGroupIds(String groupIds) {
		this.groupIds = groupIds;
	}

	@Override
	public String toString() {
		return "Server{" +
				"name='" + name + '\'' +
				", agentUrl='" + agentUrl + '\'' +
				", groupIds='" + groupIds + '\'' +
				'}';
	}
}
