package io.roboscale.robot.v1alpha1;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"updateNeeded","workspaces","workspacesPath"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class WorkspaceManagerSpec implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Need update
     */
    @com.fasterxml.jackson.annotation.JsonProperty("updateNeeded")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Need update")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean updateNeeded;

    public Boolean getUpdateNeeded() {
        return updateNeeded;
    }

    public void setUpdateNeeded(Boolean updateNeeded) {
        this.updateNeeded = updateNeeded;
    }

    /**
     * Workspace definitions of robot.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("workspaces")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Workspace definitions of robot.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.roboscale.robot.v1alpha1.workspacemanagerspec.Workspaces> workspaces;

    public java.util.List<io.roboscale.robot.v1alpha1.workspacemanagerspec.Workspaces> getWorkspaces() {
        return workspaces;
    }

    public void setWorkspaces(java.util.List<io.roboscale.robot.v1alpha1.workspacemanagerspec.Workspaces> workspaces) {
        this.workspaces = workspaces;
    }

    /**
     * Global path of workspaces. It's fixed to `/home/workspaces` path.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("workspacesPath")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Global path of workspaces. It's fixed to `/home/workspaces` path.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String workspacesPath;

    public String getWorkspacesPath() {
        return workspacesPath;
    }

    public void setWorkspacesPath(String workspacesPath) {
        this.workspacesPath = workspacesPath;
    }
}

