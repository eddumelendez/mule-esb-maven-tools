package org.mule.mmc.api.client;

import java.util.Arrays;

/**
 * @author Eddú Meléndez
 */
public class Cluster {

	private String name;

	private String version;

	private String[] nodes;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String[] getNodes() {
		return this.nodes;
	}

	public void setNodes(String[] nodes) {
		this.nodes = nodes;
	}

	@Override
	public String toString() {
		return "Cluster{" +
				"name='" + name + '\'' +
				", version='" + version + '\'' +
				", nodes=" + Arrays.toString(nodes) +
				'}';
	}
}
