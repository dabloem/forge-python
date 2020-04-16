package com.abnamro.coesd.forge.projects;

import java.util.Collections;

import org.jboss.forge.addon.projects.AbstractProjectProvider;
import org.jboss.forge.addon.projects.Project;
import org.jboss.forge.addon.projects.ProjectProvider;
import org.jboss.forge.addon.projects.ProvidedProjectFacet;
import org.jboss.forge.addon.resource.Resource;

public class PythonProjectProvider extends AbstractProjectProvider implements ProjectProvider {

    @Override
    public String getType() {
        return "python";
    }

    @Override
    public Iterable<Class<? extends ProvidedProjectFacet>> getProvidedFacetTypes() {
        return Collections.EMPTY_LIST;
    }

    @Override
    public Project createProject(Resource<?> target) {
        return new PythonProject(target);
    }

    @Override
    public boolean containsProject(Resource<?> resource) {
        Resource setup = resource.getChild("setup.py");
        return (setup != null && setup.exists());
    }

    @Override
    public int priority() {
        return 100;
    }

}