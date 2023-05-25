package io.roboscale.robot.v1alpha1.robotstatus.rosbridgestatus;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"ingressStatus","phase","podStatus","serviceStatus"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Status implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Status of ROSBridge Ingress.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ingressStatus")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Status of ROSBridge Ingress.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha1.robotstatus.rosbridgestatus.status.IngressStatus ingressStatus;

    public io.roboscale.robot.v1alpha1.robotstatus.rosbridgestatus.status.IngressStatus getIngressStatus() {
        return ingressStatus;
    }

    public void setIngressStatus(io.roboscale.robot.v1alpha1.robotstatus.rosbridgestatus.status.IngressStatus ingressStatus) {
        this.ingressStatus = ingressStatus;
    }

    /**
     * Phase of ROSBridge.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("phase")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Phase of ROSBridge.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String phase;

    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    /**
     * Status of ROSBridge pod.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("podStatus")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Status of ROSBridge pod.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha1.robotstatus.rosbridgestatus.status.PodStatus podStatus;

    public io.roboscale.robot.v1alpha1.robotstatus.rosbridgestatus.status.PodStatus getPodStatus() {
        return podStatus;
    }

    public void setPodStatus(io.roboscale.robot.v1alpha1.robotstatus.rosbridgestatus.status.PodStatus podStatus) {
        this.podStatus = podStatus;
    }

    /**
     * Status of ROSBridge service.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("serviceStatus")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Status of ROSBridge service.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha1.robotstatus.rosbridgestatus.status.ServiceStatus serviceStatus;

    public io.roboscale.robot.v1alpha1.robotstatus.rosbridgestatus.status.ServiceStatus getServiceStatus() {
        return serviceStatus;
    }

    public void setServiceStatus(io.roboscale.robot.v1alpha1.robotstatus.rosbridgestatus.status.ServiceStatus serviceStatus) {
        this.serviceStatus = serviceStatus;
    }
}

