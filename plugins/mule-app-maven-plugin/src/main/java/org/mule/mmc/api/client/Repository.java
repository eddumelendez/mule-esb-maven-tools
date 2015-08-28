package org.mule.mmc.api.client;

import java.io.File;

/**
 * @author Eddú Meléndez
 */
public class Repository {

	private String name;

	private File file;

	private String version;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public File getFile() {
		return this.file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "Repository{" +
				"name='" + name + '\'' +
				", file=" + file +
				", version='" + version + '\'' +
				'}';
	}
}
