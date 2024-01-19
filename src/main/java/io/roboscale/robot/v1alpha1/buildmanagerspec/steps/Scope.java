package io.roboscale.robot.v1alpha1.buildmanagerspec.steps;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"path","scopeType","workspace"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Scope implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Absolute path of the directory. It's being applied if the scope type is `Path`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("path")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Absolute path of the directory. It's being applied if the scope type is `Path`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String path;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * Type of the BuildManager scope. Allowed scopes are `Workspace` and `Path`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("scopeType")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Type of the BuildManager scope. Allowed scopes are `Workspace` and `Path`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String scopeType;

    public String getScopeType() {
        return scopeType;
    }

    public void setScopeType(String scopeType) {
        this.scopeType = scopeType;
    }

    /**
     * Name of the workspace. Should be selected among the existing workspaces in WorkspaceManager's manifests. It's being applied if the scope type is `Workspace`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("workspace")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Name of the workspace. Should be selected among the existing workspaces in WorkspaceManager's manifests. It's being applied if the scope type is `Workspace`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String workspace;

    public String getWorkspace() {
        return workspace;
    }

    public void setWorkspace(String workspace) {
        this.workspace = workspace;
    }
}

