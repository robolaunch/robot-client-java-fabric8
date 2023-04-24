package io.roboscale.robot.v1alpha1.robotspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"updateNeeded","workspaces","workspacesPath"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class WorkspaceManagerTemplate implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * WorkspaceManager is triggered if this field is set to `true`. Then the workspaces are being configured again while backing up the old configurations. This field is often used by operator.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("updateNeeded")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("WorkspaceManager is triggered if this field is set to `true`. Then the workspaces are being configured again while backing up the old configurations. This field is often used by operator.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean updateNeeded;

    public Boolean getUpdateNeeded() {
        return updateNeeded;
    }

    public void setUpdateNeeded(Boolean updateNeeded) {
        this.updateNeeded = updateNeeded;
    }

    /**
     * Workspace definitions of robot. Multiple ROS 2 workspaces can be configured over this field.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("workspaces")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Workspace definitions of robot. Multiple ROS 2 workspaces can be configured over this field.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.roboscale.robot.v1alpha1.robotspec.workspacemanagertemplate.Workspaces> workspaces;

    public java.util.List<io.roboscale.robot.v1alpha1.robotspec.workspacemanagertemplate.Workspaces> getWorkspaces() {
        return workspaces;
    }

    public void setWorkspaces(java.util.List<io.roboscale.robot.v1alpha1.robotspec.workspacemanagertemplate.Workspaces> workspaces) {
        this.workspaces = workspaces;
    }

    /**
     * Global path of workspaces. It's fixed to `/root/workspaces` path.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("workspacesPath")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Global path of workspaces. It's fixed to `/root/workspaces` path.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String workspacesPath;

    public String getWorkspacesPath() {
        return workspacesPath;
    }

    public void setWorkspacesPath(String workspacesPath) {
        this.workspacesPath = workspacesPath;
    }
}

