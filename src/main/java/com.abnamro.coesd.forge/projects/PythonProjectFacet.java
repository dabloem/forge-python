import java.util.Optional;

import org.jboss.forge.addon.facets.AbstractFacet;
import org.jboss.forge.addon.projects.Project;
import org.jboss.forge.addon.projects.ProjectFacet;

/**
 * PythonProjectFacet
 */
public class PythonProjectFacet extends AbstractFacet<Project> implements ProjectFacet {

    @Override
    public boolean install() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean isInstalled() {
        return getFaceted().getRoot().getChild("setup.py").exists();
    }

    
}