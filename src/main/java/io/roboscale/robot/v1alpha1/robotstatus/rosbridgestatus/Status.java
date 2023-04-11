package io.roboscale.robot.v1alpha1.robotstatus.rosbridgestatus;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"phase","podStatus","serviceStatus"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Status implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("phase")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String phase;

    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("podStatus")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha1.robotstatus.rosbridgestatus.status.PodStatus podStatus;

    public io.roboscale.robot.v1alpha1.robotstatus.rosbridgestatus.status.PodStatus getPodStatus() {
        return podStatus;
    }

    public void setPodStatus(io.roboscale.robot.v1alpha1.robotstatus.rosbridgestatus.status.PodStatus podStatus) {
        this.podStatus = podStatus;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("serviceStatus")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha1.robotstatus.rosbridgestatus.status.ServiceStatus serviceStatus;

    public io.roboscale.robot.v1alpha1.robotstatus.rosbridgestatus.status.ServiceStatus getServiceStatus() {
        return serviceStatus;
    }

    public void setServiceStatus(io.roboscale.robot.v1alpha1.robotstatus.rosbridgestatus.status.ServiceStatus serviceStatus) {
        this.serviceStatus = serviceStatus;
    }
}
