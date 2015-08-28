package org.mule.mmc.api.client;

/**
 * @author Eddú Meléndez
 */
public class RepositoryResponse {

	private String versionId;

	private String applicationId;

	public String getVersionId() {
		return this.versionId;
	}

	public void setVersionId(String versionId) {
		this.versionId = versionId;
	}

	public String getApplicationId() {
		return this.applicationId;
	}

	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}

	@Override
	public String toString() {
		return "RepositoryResponse{" +
				"versionId='" + versionId + '\'' +
				", applicationId='" + applicationId + '\'' +
				'}';
	}
}
