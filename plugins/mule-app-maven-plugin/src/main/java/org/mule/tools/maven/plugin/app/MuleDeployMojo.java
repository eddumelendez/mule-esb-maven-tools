package org.mule.tools.maven.plugin.app;

import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;

/**
 * @goal deploy
 * @requiresDependencyResolution runtime
 */
public class MuleDeployMojo extends AbstractMuleMojo {

	/**
	 * If set to <code>true</code> attempt to copy the domain of this Mule application to mule.home/domains or $MULE_HOME/domains
	 *
	 * @parameter alias="mmcUrl" expression="${mmcUrl}" default-value="http://localhost:8080/mmc"
	 * @required
	 */
	protected String mmcUrl = "http://localhost:8080/mmc";

	/**
	 * If set to <code>true</code> attempt to copy the domain of this Mule application to mule.home/domains or $MULE_HOME/domains
	 *
	 * @parameter alias="mmcUsername" expression="${mmcUsername}"
	 * @required
	 */
	protected boolean mmcUsername;

	/**
	 * If set to <code>true</code> attempt to copy the domain of this Mule application to mule.home/domains or $MULE_HOME/domains
	 *
	 * @parameter alias="mmcPassword" expression="${mmcPassword}"
	 * @required
	 */
	protected boolean mmcPassword;

	@Override
	public void execute() throws MojoExecutionException, MojoFailureException {
		// validate Cluster or Server
		// search artifact
		// upload to repository
		// undeploy
		// remove
		// deploy Cluster or Server

	}

}
