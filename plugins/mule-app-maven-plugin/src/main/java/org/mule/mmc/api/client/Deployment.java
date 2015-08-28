package org.mule.mmc.api.client;

import java.util.Arrays;

/**
 * @author Eddú Meléndez
 */
public class Deployment {

	private String name;

	private String[] servers;

	private String[] applications;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String[] getServers() {
		return this.servers;
	}

	public void setServers(String[] servers) {
		this.servers = servers;
	}

	public String[] getApplications() {
		return this.applications;
	}

	public void setApplications(String[] applications) {
		this.applications = applications;
	}

	@Override
	public String toString() {
		return "Deployment{" +
				"name='" + name + '\'' +
				", servers=" + Arrays.toString(servers) +
				", applications=" + Arrays.toString(applications) +
				'}';
	}
}
