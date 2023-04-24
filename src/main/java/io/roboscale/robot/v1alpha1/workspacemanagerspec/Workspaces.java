package io.roboscale.robot.v1alpha1.workspacemanagerspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"distro","name","repositories"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Workspaces implements io.fabric8.kubernetes.api.model.KubernetesResource {

    public enum Distro {

        @com.fasterxml.jackson.annotation.JsonProperty("foxy")
        FOXY("foxy"), @com.fasterxml.jackson.annotation.JsonProperty("galactic")
        GALACTIC("galactic"), @com.fasterxml.jackson.annotation.JsonProperty("humble")
        HUMBLE("humble");

        java.lang.String value;

        Distro(java.lang.String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public java.lang.String getValue() {
            return value;
        }
    }

    /**
     * ROS 2 distribution selection. Currently supported distributions are Humble, Foxy, Galactic.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("distro")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("ROS 2 distribution selection. Currently supported distributions are Humble, Foxy, Galactic.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Distro distro;

    public Distro getDistro() {
        return distro;
    }

    public void setDistro(Distro distro) {
        this.distro = distro;
    }

    /**
     * Name of workspace. If a workspace's name is `my_ws`, it's absolute path is `/home/workspaces/my_ws`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Name of workspace. If a workspace's name is `my_ws`, it's absolute path is `/home/workspaces/my_ws`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Repositories to clone inside workspace's `src` directory.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("repositories")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Repositories to clone inside workspace's `src` directory.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.Map<java.lang.String, io.roboscale.robot.v1alpha1.workspacemanagerspec.workspaces.Repositories> repositories;

    public java.util.Map<java.lang.String, io.roboscale.robot.v1alpha1.workspacemanagerspec.workspaces.Repositories> getRepositories() {
        return repositories;
    }

    public void setRepositories(java.util.Map<java.lang.String, io.roboscale.robot.v1alpha1.workspacemanagerspec.workspaces.Repositories> repositories) {
        this.repositories = repositories;
    }
}

