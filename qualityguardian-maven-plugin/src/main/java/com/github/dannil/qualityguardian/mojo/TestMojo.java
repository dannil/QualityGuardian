package com.github.dannil.qualityguardian.mojo;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;

import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.project.MavenProject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

@Mojo(name = "test", defaultPhase = LifecyclePhase.PROCESS_SOURCES)
public class TestMojo extends AbstractMojo {

    private static final Logger LOGGER = LoggerFactory.getLogger(TestMojo.class);

    @Parameter(defaultValue = "${project}", readonly = true, required = true)
    private MavenProject project;

    @Override
    public void execute() throws MojoExecutionException {
        
    }

    // @Parameter(defaultValue = "${project.build.directory}", property = "outputDir",
    // required = true)
    // private File outputDirectory;

    // @Override
    // public void execute() throws MojoExecutionException {
    // File f = outputDirectory;
    //
    // if (!f.exists()) {
    // f.mkdirs();
    // }
    //
    // File touch = new File(f, "touch.txt");
    //
    // FileWriter w = null;
    // try {
    // w = new FileWriter(touch);
    //
    // w.write("touch.txt");
    // } catch (IOException e) {
    // throw new MojoExecutionException("Error creating file " + touch, e);
    // } finally {
    // if (w != null) {
    // try {
    // w.close();
    // } catch (IOException e) {
    // // ignore
    // }
    // }
    // }
    // }
}
