package io.roboscale.robot.v1alpha2;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"connectionInfo","ingressStatus","phase","podStatus","serviceStatus"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class ROS2BridgeStatus implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Connection info obtained from DiscoveryServer.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("connectionInfo")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Connection info obtained from DiscoveryServer.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha2.ros2bridgestatus.ConnectionInfo connectionInfo;

    public io.roboscale.robot.v1alpha2.ros2bridgestatus.ConnectionInfo getConnectionInfo() {
        return connectionInfo;
    }

    public void setConnectionInfo(io.roboscale.robot.v1alpha2.ros2bridgestatus.ConnectionInfo connectionInfo) {
        this.connectionInfo = connectionInfo;
    }

    /**
     * Status of ROS2Bridge Ingress.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ingressStatus")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Status of ROS2Bridge Ingress.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha2.ros2bridgestatus.IngressStatus ingressStatus;

    public io.roboscale.robot.v1alpha2.ros2bridgestatus.IngressStatus getIngressStatus() {
        return ingressStatus;
    }

    public void setIngressStatus(io.roboscale.robot.v1alpha2.ros2bridgestatus.IngressStatus ingressStatus) {
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
    private io.roboscale.robot.v1alpha2.ros2bridgestatus.PodStatus podStatus;

    public io.roboscale.robot.v1alpha2.ros2bridgestatus.PodStatus getPodStatus() {
        return podStatus;
    }

    public void setPodStatus(io.roboscale.robot.v1alpha2.ros2bridgestatus.PodStatus podStatus) {
        this.podStatus = podStatus;
    }

    /**
     * Status of ROS2Bridge service.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("serviceStatus")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Status of ROS2Bridge service.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha2.ros2bridgestatus.ServiceStatus serviceStatus;

    public io.roboscale.robot.v1alpha2.ros2bridgestatus.ServiceStatus getServiceStatus() {
        return serviceStatus;
    }

    public void setServiceStatus(io.roboscale.robot.v1alpha2.ros2bridgestatus.ServiceStatus serviceStatus) {
        this.serviceStatus = serviceStatus;
    }
}

