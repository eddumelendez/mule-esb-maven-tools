package org.mule.mmc.api.client;

import java.util.Arrays;

/**
 * @author Eddú Meléndez
 */
public class ServerResponse {

	private String name;

	private String id;

	private String version;

	private Group[] groups;

	private Status status;

	private String href;

	private String runningServices;

	private String hostIp;

	private String agentUrl;

	private String muleServerId;

	private String started;

	private Agent[] agents;

	private String pausedServices;

	private String stoppedServices;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public Group[] getGroups() {
		return this.groups;
	}

	public void setGroups(Group[] groups) {
		this.groups = groups;
	}

	public Status getStatus() {
		return this.status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public String getHref() {
		return this.href;
	}

	public void setHref(String href) {
		this.href = href;
	}

	public String getRunningServices() {
		return this.runningServices;
	}

	public void setRunningServices(String runningServices) {
		this.runningServices = runningServices;
	}

	public String getHostIp() {
		return this.hostIp;
	}

	public void setHostIp(String hostIp) {
		this.hostIp = hostIp;
	}

	public String getAgentUrl() {
		return this.agentUrl;
	}

	public void setAgentUrl(String agentUrl) {
		this.agentUrl = agentUrl;
	}

	public String getMuleServerId() {
		return this.muleServerId;
	}

	public void setMuleServerId(String muleServerId) {
		this.muleServerId = muleServerId;
	}

	public String getStarted() {
		return this.started;
	}

	public void setStarted(String started) {
		this.started = started;
	}

	public Agent[] getAgents() {
		return this.agents;
	}

	public void setAgents(Agent[] agents) {
		this.agents = agents;
	}

	public String getPausedServices() {
		return this.pausedServices;
	}

	public void setPausedServices(String pausedServices) {
		this.pausedServices = pausedServices;
	}

	public String getStoppedServices() {
		return this.stoppedServices;
	}

	public void setStoppedServices(String stoppedServices) {
		this.stoppedServices = stoppedServices;
	}

	@Override
	public String toString() {
		return "ServerResponse{" +
				"name='" + name + '\'' +
				", id='" + id + '\'' +
				", version='" + version + '\'' +
				", groups=" + Arrays.toString(groups) +
				", status=" + status +
				", href='" + href + '\'' +
				", runningServices='" + runningServices + '\'' +
				", hostIp='" + hostIp + '\'' +
				", agentUrl='" + agentUrl + '\'' +
				", muleServerId='" + muleServerId + '\'' +
				", started='" + started + '\'' +
				", agents=" + Arrays.toString(agents) +
				", pausedServices='" + pausedServices + '\'' +
				", stoppedServices='" + stoppedServices + '\'' +
				'}';
	}

	private enum Status {

		UNKNOWN,
		STOPPED,
		WAITING_FOR_RESTART,
		STARTING,
		OK,
		WARN,
		ERROR

	}

	private class Group {

		private String name;

		private String href;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getHref() {
			return this.href;
		}

		public void setHref(String href) {
			this.href = href;
		}
	}

	private class Agent {

		private String name;

		private String description;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}
	}
}
