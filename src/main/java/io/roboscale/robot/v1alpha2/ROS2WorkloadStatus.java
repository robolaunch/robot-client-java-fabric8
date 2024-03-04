package io.roboscale.robot.v1alpha2;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"discoveryServerStatus","phase","pvcStatuses","ros2BridgeStatus","statefulSetStatuses"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class ROS2WorkloadStatus implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Discovery server instance status.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("discoveryServerStatus")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Discovery server instance status.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha2.ros2workloadstatus.DiscoveryServerStatus discoveryServerStatus;

    public io.roboscale.robot.v1alpha2.ros2workloadstatus.DiscoveryServerStatus getDiscoveryServerStatus() {
        return discoveryServerStatus;
    }

    public void setDiscoveryServerStatus(io.roboscale.robot.v1alpha2.ros2workloadstatus.DiscoveryServerStatus discoveryServerStatus) {
        this.discoveryServerStatus = discoveryServerStatus;
    }

    /**
     * Phase of ROS2Workload. It sums the general status of ROS 2 workload(s).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("phase")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Phase of ROS2Workload. It sums the general status of ROS 2 workload(s).")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String phase;

    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    /**
     * Statuses of owned PersistentVolumeClaims.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("pvcStatuses")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Statuses of owned PersistentVolumeClaims.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.roboscale.robot.v1alpha2.ros2workloadstatus.PvcStatuses> pvcStatuses;

    public java.util.List<io.roboscale.robot.v1alpha2.ros2workloadstatus.PvcStatuses> getPvcStatuses() {
        return pvcStatuses;
    }

    public void setPvcStatuses(java.util.List<io.roboscale.robot.v1alpha2.ros2workloadstatus.PvcStatuses> pvcStatuses) {
        this.pvcStatuses = pvcStatuses;
    }

    /**
     * ROS 2 Bridge instance status.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ros2BridgeStatus")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("ROS 2 Bridge instance status.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha2.ros2workloadstatus.Ros2BridgeStatus ros2BridgeStatus;

    public io.roboscale.robot.v1alpha2.ros2workloadstatus.Ros2BridgeStatus getRos2BridgeStatus() {
        return ros2BridgeStatus;
    }

    public void setRos2BridgeStatus(io.roboscale.robot.v1alpha2.ros2workloadstatus.Ros2BridgeStatus ros2BridgeStatus) {
        this.ros2BridgeStatus = ros2BridgeStatus;
    }

    /**
     * Status of owned StatefulSet and containers.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("statefulSetStatuses")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Status of owned StatefulSet and containers.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.roboscale.robot.v1alpha2.ros2workloadstatus.StatefulSetStatuses> statefulSetStatuses;

    public java.util.List<io.roboscale.robot.v1alpha2.ros2workloadstatus.StatefulSetStatuses> getStatefulSetStatuses() {
        return statefulSetStatuses;
    }

    public void setStatefulSetStatuses(java.util.List<io.roboscale.robot.v1alpha2.ros2workloadstatus.StatefulSetStatuses> statefulSetStatuses) {
        this.statefulSetStatuses = statefulSetStatuses;
    }
}

