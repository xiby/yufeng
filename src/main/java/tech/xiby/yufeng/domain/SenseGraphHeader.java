package tech.xiby.yufeng.domain;

import java.io.Serializable;

/**
 * The scene graph header contains information about the completeness of the scene graph and the version number
 *
 * @author xiby
 */
public class SenseGraphHeader implements Serializable {
    /**
     * Can take two values
     * 1. RSG Stands for Ruby Scene Graph, and indicates that the scene graph is a full description of the environment
     * 2. RDS Stands for Ruby Diff Scene, and indicates that the scene graph is a partial description of the environment, i.e. it contains a bunch of empty nodes representing the structure of the scene graph, and some updated information about the nodes who have changed lately
     */
    private String name;

    /**
     * The main version number of the scene graph
     */
    private int version;

    /**
     * The subversion number
     */
    private int subversion;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public int getSubversion() {
        return subversion;
    }

    public void setSubversion(int subversion) {
        this.subversion = subversion;
    }
}
