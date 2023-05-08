package io.roboscale.robot.v1alpha1.launchmanagerspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"container","entrypoint","instances","namespacing","workspace"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Launches implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * General container configuration parameters.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("container")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("General container configuration parameters.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha1.launchmanagerspec.launches.Container container;

    public io.roboscale.robot.v1alpha1.launchmanagerspec.launches.Container getContainer() {
        return container;
    }

    public void setContainer(io.roboscale.robot.v1alpha1.launchmanagerspec.launches.Container container) {
        this.container = container;
    }

    /**
     * Entrypoint configuration of launch.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("entrypoint")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Entrypoint configuration of launch.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha1.launchmanagerspec.launches.Entrypoint entrypoint;

    public io.roboscale.robot.v1alpha1.launchmanagerspec.launches.Entrypoint getEntrypoint() {
        return entrypoint;
    }

    public void setEntrypoint(io.roboscale.robot.v1alpha1.launchmanagerspec.launches.Entrypoint entrypoint) {
        this.entrypoint = entrypoint;
    }

    /**
     * Cluster selector. If the current instance name is on the list, LaunchManager creates launch pods.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("instances")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Cluster selector. If the current instance name is on the list, LaunchManager creates launch pods.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> instances;

    public java.util.List<String> getInstances() {
        return instances;
    }

    public void setInstances(java.util.List<String> instances) {
        this.instances = instances;
    }

    /**
     * ROS 2 namespacing. May not be suitable for all launchfiles. If used, all the node names and topic names should be defined relative, not absolute. (eg. `cmd_vel` instead of /cmd_vel``)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("namespacing")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("ROS 2 namespacing. May not be suitable for all launchfiles. If used, all the node names and topic names should be defined relative, not absolute. (eg. `cmd_vel` instead of /cmd_vel``)")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean namespacing;

    public Boolean getNamespacing() {
        return namespacing;
    }

    public void setNamespacing(Boolean namespacing) {
        this.namespacing = namespacing;
    }

    /**
     * Name of the workspace. Should be selected among the existing workspaces in WorkspaceManager's manifests.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("workspace")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Name of the workspace. Should be selected among the existing workspaces in WorkspaceManager's manifests.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String workspace;

    public String getWorkspace() {
        return workspace;
    }

    public void setWorkspace(String workspace) {
        this.workspace = workspace;
    }
}

