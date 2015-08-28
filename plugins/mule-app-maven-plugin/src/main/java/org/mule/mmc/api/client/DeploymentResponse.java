package org.mule.mmc.api.client;

/**
 * @author Eddú Meléndez
 */
public class DeploymentResponse {

	private String[] application;

	private String[] clusterIds;

	private String[] clusterNames;

	private String href;

	private String id;

	private String lastModified;

	private String name;

	private Boolean reconciled;

	private String[] servers;

	private Status status;

	private enum Status {

		DEPLOYED,
		UNDEPLOYED

	}
}
