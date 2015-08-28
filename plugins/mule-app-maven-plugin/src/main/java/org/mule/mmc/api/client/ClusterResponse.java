package org.mule.mmc.api.client;

import java.util.Arrays;

/**
 * @author Eddú Meléndez
 */
public class ClusterResponse {

	private String name;

	private String location;

	private String id;

	private String version;

	private String status;

	private String pausedServices;

	private String stoppedServices;

	private String[] nodeServerIds;

	private String[] deployments;

	private Status clusterStatus;

	private String nodesUpCount;

	private String lastRestarted;

	private String runningServices;

	private String totalServices;

	private String[] groupIds;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
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

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
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

	public String[] getNodeServerIds() {
		return this.nodeServerIds;
	}

	public void setNodeServerIds(String[] nodeServerIds) {
		this.nodeServerIds = nodeServerIds;
	}

	public String[] getDeployments() {
		return this.deployments;
	}

	public void setDeployments(String[] deployments) {
		this.deployments = deployments;
	}

	public Status getClusterStatus() {
		return this.clusterStatus;
	}

	public void setClusterStatus(Status clusterStatus) {
		this.clusterStatus = clusterStatus;
	}

	public String getNodesUpCount() {
		return this.nodesUpCount;
	}

	public void setNodesUpCount(String nodesUpCount) {
		this.nodesUpCount = nodesUpCount;
	}

	public String getLastRestarted() {
		return this.lastRestarted;
	}

	public void setLastRestarted(String lastRestarted) {
		this.lastRestarted = lastRestarted;
	}

	public String getRunningServices() {
		return this.runningServices;
	}

	public void setRunningServices(String runningServices) {
		this.runningServices = runningServices;
	}

	public String getTotalServices() {
		return this.totalServices;
	}

	public void setTotalServices(String totalServices) {
		this.totalServices = totalServices;
	}

	public String[] getGroupIds() {
		return this.groupIds;
	}

	public void setGroupIds(String[] groupIds) {
		this.groupIds = groupIds;
	}

	@Override
	public String toString() {
		return "ClusterResponse{" +
				"name='" + name + '\'' +
				", location='" + location + '\'' +
				", id='" + id + '\'' +
				", version='" + version + '\'' +
				", status='" + status + '\'' +
				", pausedServices='" + pausedServices + '\'' +
				", stoppedServices='" + stoppedServices + '\'' +
				", nodeServerIds=" + Arrays.toString(nodeServerIds) +
				", deployments=" + Arrays.toString(deployments) +
				", clusterStatus=" + clusterStatus +
				", nodesUpCount='" + nodesUpCount + '\'' +
				", lastRestarted='" + lastRestarted + '\'' +
				", runningServices='" + runningServices + '\'' +
				", totalServices='" + totalServices + '\'' +
				", groupIds=" + Arrays.toString(groupIds) +
				'}';
	}

	private enum Status {

		STOPPED, WAITING_FOR_RESTART, OK

	}
}
