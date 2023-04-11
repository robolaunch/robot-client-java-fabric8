package io.roboscale.robot.v1alpha1;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"active","phase","scriptConfigMapStatus","steps"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class BuildManagerStatus implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("active")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean active;

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
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

    @com.fasterxml.jackson.annotation.JsonProperty("scriptConfigMapStatus")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha1.buildmanagerstatus.ScriptConfigMapStatus scriptConfigMapStatus;

    public io.roboscale.robot.v1alpha1.buildmanagerstatus.ScriptConfigMapStatus getScriptConfigMapStatus() {
        return scriptConfigMapStatus;
    }

    public void setScriptConfigMapStatus(io.roboscale.robot.v1alpha1.buildmanagerstatus.ScriptConfigMapStatus scriptConfigMapStatus) {
        this.scriptConfigMapStatus = scriptConfigMapStatus;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("steps")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.roboscale.robot.v1alpha1.buildmanagerstatus.Steps> steps;

    public java.util.List<io.roboscale.robot.v1alpha1.buildmanagerstatus.Steps> getSteps() {
        return steps;
    }

    public void setSteps(java.util.List<io.roboscale.robot.v1alpha1.buildmanagerstatus.Steps> steps) {
        this.steps = steps;
    }
}

