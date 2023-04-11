package io.roboscale.robot.v1alpha1.robotstatus.workspacemanagerstatus;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"cleanupJobStatus","clonerJobStatus","phase","version"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Status implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("cleanupJobStatus")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha1.robotstatus.workspacemanagerstatus.status.CleanupJobStatus cleanupJobStatus;

    public io.roboscale.robot.v1alpha1.robotstatus.workspacemanagerstatus.status.CleanupJobStatus getCleanupJobStatus() {
        return cleanupJobStatus;
    }

    public void setCleanupJobStatus(io.roboscale.robot.v1alpha1.robotstatus.workspacemanagerstatus.status.CleanupJobStatus cleanupJobStatus) {
        this.cleanupJobStatus = cleanupJobStatus;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("clonerJobStatus")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha1.robotstatus.workspacemanagerstatus.status.ClonerJobStatus clonerJobStatus;

    public io.roboscale.robot.v1alpha1.robotstatus.workspacemanagerstatus.status.ClonerJobStatus getClonerJobStatus() {
        return clonerJobStatus;
    }

    public void setClonerJobStatus(io.roboscale.robot.v1alpha1.robotstatus.workspacemanagerstatus.status.ClonerJobStatus clonerJobStatus) {
        this.clonerJobStatus = clonerJobStatus;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("phase")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String phase;

    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("version")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long version;

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }
}

