package io.roboscale.robot.v1alpha1.robotstatus.attachedlaunchobjects;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"active","launchPodStatus","phase"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Status implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("active")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean active;

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("launchPodStatus")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha1.robotstatus.attachedlaunchobjects.status.LaunchPodStatus launchPodStatus;

    public io.roboscale.robot.v1alpha1.robotstatus.attachedlaunchobjects.status.LaunchPodStatus getLaunchPodStatus() {
        return launchPodStatus;
    }

    public void setLaunchPodStatus(io.roboscale.robot.v1alpha1.robotstatus.attachedlaunchobjects.status.LaunchPodStatus launchPodStatus) {
        this.launchPodStatus = launchPodStatus;
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
}

