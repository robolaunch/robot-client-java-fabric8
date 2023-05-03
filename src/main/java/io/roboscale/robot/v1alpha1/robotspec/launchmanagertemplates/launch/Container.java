package io.roboscale.robot.v1alpha1.robotspec.launchmanagertemplates.launch;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"env","privileged","resources"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Container implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Additional environment variables to set when launching ROS nodes.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("env")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Additional environment variables to set when launching ROS nodes.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.roboscale.robot.v1alpha1.robotspec.launchmanagertemplates.launch.container.Env> env;

    public java.util.List<io.roboscale.robot.v1alpha1.robotspec.launchmanagertemplates.launch.container.Env> getEnv() {
        return env;
    }

    public void setEnv(java.util.List<io.roboscale.robot.v1alpha1.robotspec.launchmanagertemplates.launch.container.Env> env) {
        this.env = env;
    }

    /**
     * Launch container privilege.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("privileged")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Launch container privilege.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean privileged;

    public Boolean getPrivileged() {
        return privileged;
    }

    public void setPrivileged(Boolean privileged) {
        this.privileged = privileged;
    }

    /**
     * Launch container resource limits.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resources")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Launch container resource limits.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha1.robotspec.launchmanagertemplates.launch.container.Resources resources;

    public io.roboscale.robot.v1alpha1.robotspec.launchmanagertemplates.launch.container.Resources getResources() {
        return resources;
    }

    public void setResources(io.roboscale.robot.v1alpha1.robotspec.launchmanagertemplates.launch.container.Resources resources) {
        this.resources = resources;
    }
}

