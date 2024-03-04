package io.roboscale.robot.v1alpha2;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"containers","discoveryServerTemplate","ros2BridgeTemplate","volumeClaimTemplates"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class ROS2WorkloadSpec implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Configurational parameters for containers that will be encapsulated within the ROS 2 workload StatefulSet.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("containers")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Configurational parameters for containers that will be encapsulated within the ROS 2 workload StatefulSet.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.roboscale.robot.v1alpha2.ros2workloadspec.Containers> containers;

    public java.util.List<io.roboscale.robot.v1alpha2.ros2workloadspec.Containers> getContainers() {
        return containers;
    }

    public void setContainers(java.util.List<io.roboscale.robot.v1alpha2.ros2workloadspec.Containers> containers) {
        this.containers = containers;
    }

    /**
     * Discovery server configurational parameters.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("discoveryServerTemplate")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Discovery server configurational parameters.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha2.ros2workloadspec.DiscoveryServerTemplate discoveryServerTemplate;

    public io.roboscale.robot.v1alpha2.ros2workloadspec.DiscoveryServerTemplate getDiscoveryServerTemplate() {
        return discoveryServerTemplate;
    }

    public void setDiscoveryServerTemplate(io.roboscale.robot.v1alpha2.ros2workloadspec.DiscoveryServerTemplate discoveryServerTemplate) {
        this.discoveryServerTemplate = discoveryServerTemplate;
    }

    /**
     * ROS 2 Bridge configurational parameters.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ros2BridgeTemplate")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("ROS 2 Bridge configurational parameters.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha2.ros2workloadspec.Ros2BridgeTemplate ros2BridgeTemplate;

    public io.roboscale.robot.v1alpha2.ros2workloadspec.Ros2BridgeTemplate getRos2BridgeTemplate() {
        return ros2BridgeTemplate;
    }

    public void setRos2BridgeTemplate(io.roboscale.robot.v1alpha2.ros2workloadspec.Ros2BridgeTemplate ros2BridgeTemplate) {
        this.ros2BridgeTemplate = ros2BridgeTemplate;
    }

    /**
     * Volume templates for ROS 2 workload. For each volume template, operator will create a PersistentVolumeClaim that can be mounted to the ROS 2 workload.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("volumeClaimTemplates")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Volume templates for ROS 2 workload. For each volume template, operator will create a PersistentVolumeClaim that can be mounted to the ROS 2 workload.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.roboscale.robot.v1alpha2.ros2workloadspec.VolumeClaimTemplates> volumeClaimTemplates;

    public java.util.List<io.roboscale.robot.v1alpha2.ros2workloadspec.VolumeClaimTemplates> getVolumeClaimTemplates() {
        return volumeClaimTemplates;
    }

    public void setVolumeClaimTemplates(java.util.List<io.roboscale.robot.v1alpha2.ros2workloadspec.VolumeClaimTemplates> volumeClaimTemplates) {
        this.volumeClaimTemplates = volumeClaimTemplates;
    }
}

