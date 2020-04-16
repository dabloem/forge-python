package com.abnamro.coesd.forge.projects;

import org.jboss.forge.addon.projects.AbstractProject;
import org.jboss.forge.addon.projects.ProjectFacet;
import org.jboss.forge.addon.resource.Resource;

public class PythonProject extends AbstractProject {

    private final Resource<?> root;

    public PythonProject(Resource<?> projectRoot) {
        this.root = projectRoot;
    }

    @Override
    public Resource<?> getRoot() {
        return root;
    }

    @Override
    public boolean supports(ProjectFacet facet) {
        return true;
    }

    @Override
    public String toString() {
       return root.toString();
    }
}   