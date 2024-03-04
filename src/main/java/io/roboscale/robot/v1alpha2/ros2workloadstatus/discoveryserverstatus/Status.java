package io.roboscale.robot.v1alpha2.ros2workloadstatus.discoveryserverstatus;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"configMapStatus","connectionInfo","phase","podStatus","serviceExportStatus","serviceStatus"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Status implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Status of the DiscoveryServer config map.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("configMapStatus")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Status of the DiscoveryServer config map.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha2.ros2workloadstatus.discoveryserverstatus.status.ConfigMapStatus configMapStatus;

    public io.roboscale.robot.v1alpha2.ros2workloadstatus.discoveryserverstatus.status.ConfigMapStatus getConfigMapStatus() {
        return configMapStatus;
    }

    public void setConfigMapStatus(io.roboscale.robot.v1alpha2.ros2workloadstatus.discoveryserverstatus.status.ConfigMapStatus configMapStatus) {
        this.configMapStatus = configMapStatus;
    }

    /**
     * Connection information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("connectionInfo")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Connection information.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha2.ros2workloadstatus.discoveryserverstatus.status.ConnectionInfo connectionInfo;

    public io.roboscale.robot.v1alpha2.ros2workloadstatus.discoveryserverstatus.status.ConnectionInfo getConnectionInfo() {
        return connectionInfo;
    }

    public void setConnectionInfo(io.roboscale.robot.v1alpha2.ros2workloadstatus.discoveryserverstatus.status.ConnectionInfo connectionInfo) {
        this.connectionInfo = connectionInfo;
    }

    /**
     * Phase of the DiscoveryServer.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("phase")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Phase of the DiscoveryServer.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String phase;

    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    /**
     * Status of the DiscoveryServer pod.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("podStatus")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Status of the DiscoveryServer pod.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha2.ros2workloadstatus.discoveryserverstatus.status.PodStatus podStatus;

    public io.roboscale.robot.v1alpha2.ros2workloadstatus.discoveryserverstatus.status.PodStatus getPodStatus() {
        return podStatus;
    }

    public void setPodStatus(io.roboscale.robot.v1alpha2.ros2workloadstatus.discoveryserverstatus.status.PodStatus podStatus) {
        this.podStatus = podStatus;
    }

    /**
     * Status of the DiscoveryServer ServiceExport.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("serviceExportStatus")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Status of the DiscoveryServer ServiceExport.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha2.ros2workloadstatus.discoveryserverstatus.status.ServiceExportStatus serviceExportStatus;

    public io.roboscale.robot.v1alpha2.ros2workloadstatus.discoveryserverstatus.status.ServiceExportStatus getServiceExportStatus() {
        return serviceExportStatus;
    }

    public void setServiceExportStatus(io.roboscale.robot.v1alpha2.ros2workloadstatus.discoveryserverstatus.status.ServiceExportStatus serviceExportStatus) {
        this.serviceExportStatus = serviceExportStatus;
    }

    /**
     * Status of the DiscoveryServer service.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("serviceStatus")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Status of the DiscoveryServer service.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha2.ros2workloadstatus.discoveryserverstatus.status.ServiceStatus serviceStatus;

    public io.roboscale.robot.v1alpha2.ros2workloadstatus.discoveryserverstatus.status.ServiceStatus getServiceStatus() {
        return serviceStatus;
    }

    public void setServiceStatus(io.roboscale.robot.v1alpha2.ros2workloadstatus.discoveryserverstatus.status.ServiceStatus serviceStatus) {
        this.serviceStatus = serviceStatus;
    }
}

