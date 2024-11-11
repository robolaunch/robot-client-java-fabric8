package io.roboscale.robot.v1alpha1.robotstatus.attachedbuildobject;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"active","phase","scriptConfigMapStatus","steps"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Status implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Indicates if the BuildManager is currently executing it's jobs.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("active")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Indicates if the BuildManager is currently executing it's jobs.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean active;

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    /**
     * Phase of BuildManager.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("phase")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Phase of BuildManager.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String phase;

    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    /**
     * Status of the ConfigMap that holds scripts.
     * If a script is specified inside `.spec.steps[k]`, they are mounted to the step jobs via this ConfigMap.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("scriptConfigMapStatus")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Status of the ConfigMap that holds scripts.\nIf a script is specified inside `.spec.steps[k]`, they are mounted to the step jobs via this ConfigMap.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha1.robotstatus.attachedbuildobject.status.ScriptConfigMapStatus scriptConfigMapStatus;

    public io.roboscale.robot.v1alpha1.robotstatus.attachedbuildobject.status.ScriptConfigMapStatus getScriptConfigMapStatus() {
        return scriptConfigMapStatus;
    }

    public void setScriptConfigMapStatus(io.roboscale.robot.v1alpha1.robotstatus.attachedbuildobject.status.ScriptConfigMapStatus scriptConfigMapStatus) {
        this.scriptConfigMapStatus = scriptConfigMapStatus;
    }

    /**
     * Statuses of the build steps.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("steps")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Statuses of the build steps.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.roboscale.robot.v1alpha1.robotstatus.attachedbuildobject.status.Steps> steps;

    public java.util.List<io.roboscale.robot.v1alpha1.robotstatus.attachedbuildobject.status.Steps> getSteps() {
        return steps;
    }

    public void setSteps(java.util.List<io.roboscale.robot.v1alpha1.robotstatus.attachedbuildobject.status.Steps> steps) {
        this.steps = steps;
    }
}

