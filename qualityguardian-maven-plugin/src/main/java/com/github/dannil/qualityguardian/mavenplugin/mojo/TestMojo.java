package com.github.dannil.qualityguardian.mavenplugin.mojo;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;

import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.project.MavenProject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Mojo(name = "test", defaultPhase = LifecyclePhase.TEST)
public class TestMojo extends AbstractMojo {

    private static final Logger LOGGER = LoggerFactory.getLogger(TestMojo.class);

    @Parameter(defaultValue = "${project}", readonly = true, required = true)
    private MavenProject project;

    @Override
    public void execute() throws MojoExecutionException {
        LOGGER.info(String.format("Executing tests on artifact %s", project.getArtifactId()));
    }
}
