package io.roboscale.robot.v1alpha1.launchmanagerstatus;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"launchStatus","status"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class LaunchPodStatus implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("launchStatus")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.Map<java.lang.String, io.roboscale.robot.v1alpha1.launchmanagerstatus.launchpodstatus.LaunchStatus> launchStatus;

    public java.util.Map<java.lang.String, io.roboscale.robot.v1alpha1.launchmanagerstatus.launchpodstatus.LaunchStatus> getLaunchStatus() {
        return launchStatus;
    }

    public void setLaunchStatus(java.util.Map<java.lang.String, io.roboscale.robot.v1alpha1.launchmanagerstatus.launchpodstatus.LaunchStatus> launchStatus) {
        this.launchStatus = launchStatus;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("status")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha1.launchmanagerstatus.launchpodstatus.Status status;

    public io.roboscale.robot.v1alpha1.launchmanagerstatus.launchpodstatus.Status getStatus() {
        return status;
    }

    public void setStatus(io.roboscale.robot.v1alpha1.launchmanagerstatus.launchpodstatus.Status status) {
        this.status = status;
    }
}

