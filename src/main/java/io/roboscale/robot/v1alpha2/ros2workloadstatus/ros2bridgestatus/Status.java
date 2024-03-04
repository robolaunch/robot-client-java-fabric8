package io.roboscale.robot.v1alpha2.ros2workloadstatus.ros2bridgestatus;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"connectionInfo","ingressStatus","phase","podStatus","serviceStatus"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Status implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Connection info obtained from DiscoveryServer.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("connectionInfo")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Connection info obtained from DiscoveryServer.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha2.ros2workloadstatus.ros2bridgestatus.status.ConnectionInfo connectionInfo;

    public io.roboscale.robot.v1alpha2.ros2workloadstatus.ros2bridgestatus.status.ConnectionInfo getConnectionInfo() {
        return connectionInfo;
    }

    public void setConnectionInfo(io.roboscale.robot.v1alpha2.ros2workloadstatus.ros2bridgestatus.status.ConnectionInfo connectionInfo) {
        this.connectionInfo = connectionInfo;
    }

    /**
     * Status of ROS2Bridge Ingress.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ingressStatus")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Status of ROS2Bridge Ingress.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha2.ros2workloadstatus.ros2bridgestatus.status.IngressStatus ingressStatus;

    public io.roboscale.robot.v1alpha2.ros2workloadstatus.ros2bridgestatus.status.IngressStatus getIngressStatus() {
        return ingressStatus;
    }

    public void setIngressStatus(io.roboscale.robot.v1alpha2.ros2workloadstatus.ros2bridgestatus.status.IngressStatus ingressStatus) {
        this.ingressStatus = ingressStatus;
    }

    /**
     * Phase of ROS2Bridge.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("phase")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Phase of ROS2Bridge.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String phase;

    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    /**
     * Status of ROS2Bridge pod.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("podStatus")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Status of ROS2Bridge pod.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha2.ros2workloadstatus.ros2bridgestatus.status.PodStatus podStatus;

    public io.roboscale.robot.v1alpha2.ros2workloadstatus.ros2bridgestatus.status.PodStatus getPodStatus() {
        return podStatus;
    }

    public void setPodStatus(io.roboscale.robot.v1alpha2.ros2workloadstatus.ros2bridgestatus.status.PodStatus podStatus) {
        this.podStatus = podStatus;
    }

    /**
     * Status of ROS2Bridge service.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("serviceStatus")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Status of ROS2Bridge service.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha2.ros2workloadstatus.ros2bridgestatus.status.ServiceStatus serviceStatus;

    public io.roboscale.robot.v1alpha2.ros2workloadstatus.ros2bridgestatus.status.ServiceStatus getServiceStatus() {
        return serviceStatus;
    }

    public void setServiceStatus(io.roboscale.robot.v1alpha2.ros2workloadstatus.ros2bridgestatus.status.ServiceStatus serviceStatus) {
        this.serviceStatus = serviceStatus;
    }
}

