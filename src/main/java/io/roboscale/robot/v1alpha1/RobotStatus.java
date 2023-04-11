package io.roboscale.robot.v1alpha1;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"attachedBuildObject","attachedDevObjects","attachedLaunchObjects","discoveryServerStatus","image","initialBuildManagerStatus","initialLaunchManagerStatuses","loaderJobStatus","nodeName","phase","robotDevSuiteStatus","rosBridgeStatus","volumeStatuses","workspaceManagerStatus"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class RobotStatus implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Attached build object information
     */
    @com.fasterxml.jackson.annotation.JsonProperty("attachedBuildObject")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Attached build object information")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha1.robotstatus.AttachedBuildObject attachedBuildObject;

    public io.roboscale.robot.v1alpha1.robotstatus.AttachedBuildObject getAttachedBuildObject() {
        return attachedBuildObject;
    }

    public void setAttachedBuildObject(io.roboscale.robot.v1alpha1.robotstatus.AttachedBuildObject attachedBuildObject) {
        this.attachedBuildObject = attachedBuildObject;
    }

    /**
     * Attached dev object information
     */
    @com.fasterxml.jackson.annotation.JsonProperty("attachedDevObjects")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Attached dev object information")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.roboscale.robot.v1alpha1.robotstatus.AttachedDevObjects> attachedDevObjects;

    public java.util.List<io.roboscale.robot.v1alpha1.robotstatus.AttachedDevObjects> getAttachedDevObjects() {
        return attachedDevObjects;
    }

    public void setAttachedDevObjects(java.util.List<io.roboscale.robot.v1alpha1.robotstatus.AttachedDevObjects> attachedDevObjects) {
        this.attachedDevObjects = attachedDevObjects;
    }

    /**
     * Attached launch object information
     */
    @com.fasterxml.jackson.annotation.JsonProperty("attachedLaunchObjects")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Attached launch object information")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.roboscale.robot.v1alpha1.robotstatus.AttachedLaunchObjects> attachedLaunchObjects;

    public java.util.List<io.roboscale.robot.v1alpha1.robotstatus.AttachedLaunchObjects> getAttachedLaunchObjects() {
        return attachedLaunchObjects;
    }

    public void setAttachedLaunchObjects(java.util.List<io.roboscale.robot.v1alpha1.robotstatus.AttachedLaunchObjects> attachedLaunchObjects) {
        this.attachedLaunchObjects = attachedLaunchObjects;
    }

    /**
     * Discovery server instance status
     */
    @com.fasterxml.jackson.annotation.JsonProperty("discoveryServerStatus")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Discovery server instance status")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha1.robotstatus.DiscoveryServerStatus discoveryServerStatus;

    public io.roboscale.robot.v1alpha1.robotstatus.DiscoveryServerStatus getDiscoveryServerStatus() {
        return discoveryServerStatus;
    }

    public void setDiscoveryServerStatus(io.roboscale.robot.v1alpha1.robotstatus.DiscoveryServerStatus discoveryServerStatus) {
        this.discoveryServerStatus = discoveryServerStatus;
    }

    /**
     * Image of robot
     */
    @com.fasterxml.jackson.annotation.JsonProperty("image")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Image of robot")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String image;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    /**
     * Initial build manager creation status
     */
    @com.fasterxml.jackson.annotation.JsonProperty("initialBuildManagerStatus")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Initial build manager creation status")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha1.robotstatus.InitialBuildManagerStatus initialBuildManagerStatus;

    public io.roboscale.robot.v1alpha1.robotstatus.InitialBuildManagerStatus getInitialBuildManagerStatus() {
        return initialBuildManagerStatus;
    }

    public void setInitialBuildManagerStatus(io.roboscale.robot.v1alpha1.robotstatus.InitialBuildManagerStatus initialBuildManagerStatus) {
        this.initialBuildManagerStatus = initialBuildManagerStatus;
    }

    /**
     * Initial launch manager creation status
     */
    @com.fasterxml.jackson.annotation.JsonProperty("initialLaunchManagerStatuses")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Initial launch manager creation status")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.roboscale.robot.v1alpha1.robotstatus.InitialLaunchManagerStatuses> initialLaunchManagerStatuses;

    public java.util.List<io.roboscale.robot.v1alpha1.robotstatus.InitialLaunchManagerStatuses> getInitialLaunchManagerStatuses() {
        return initialLaunchManagerStatuses;
    }

    public void setInitialLaunchManagerStatuses(java.util.List<io.roboscale.robot.v1alpha1.robotstatus.InitialLaunchManagerStatuses> initialLaunchManagerStatuses) {
        this.initialLaunchManagerStatuses = initialLaunchManagerStatuses;
    }

    /**
     * Loader job status that configures environment
     */
    @com.fasterxml.jackson.annotation.JsonProperty("loaderJobStatus")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Loader job status that configures environment")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha1.robotstatus.LoaderJobStatus loaderJobStatus;

    public io.roboscale.robot.v1alpha1.robotstatus.LoaderJobStatus getLoaderJobStatus() {
        return loaderJobStatus;
    }

    public void setLoaderJobStatus(io.roboscale.robot.v1alpha1.robotstatus.LoaderJobStatus loaderJobStatus) {
        this.loaderJobStatus = loaderJobStatus;
    }

    /**
     * Node name
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nodeName")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Node name")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String nodeName;

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    /**
     * Phase of robot
     */
    @com.fasterxml.jackson.annotation.JsonProperty("phase")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Phase of robot")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String phase;

    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    /**
     * Robot development suite instance status
     */
    @com.fasterxml.jackson.annotation.JsonProperty("robotDevSuiteStatus")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Robot development suite instance status")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha1.robotstatus.RobotDevSuiteStatus robotDevSuiteStatus;

    public io.roboscale.robot.v1alpha1.robotstatus.RobotDevSuiteStatus getRobotDevSuiteStatus() {
        return robotDevSuiteStatus;
    }

    public void setRobotDevSuiteStatus(io.roboscale.robot.v1alpha1.robotstatus.RobotDevSuiteStatus robotDevSuiteStatus) {
        this.robotDevSuiteStatus = robotDevSuiteStatus;
    }

    /**
     * ROS bridge instance status
     */
    @com.fasterxml.jackson.annotation.JsonProperty("rosBridgeStatus")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("ROS bridge instance status")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha1.robotstatus.RosBridgeStatus rosBridgeStatus;

    public io.roboscale.robot.v1alpha1.robotstatus.RosBridgeStatus getRosBridgeStatus() {
        return rosBridgeStatus;
    }

    public void setRosBridgeStatus(io.roboscale.robot.v1alpha1.robotstatus.RosBridgeStatus rosBridgeStatus) {
        this.rosBridgeStatus = rosBridgeStatus;
    }

    /**
     * Volume status
     */
    @com.fasterxml.jackson.annotation.JsonProperty("volumeStatuses")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Volume status")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha1.robotstatus.VolumeStatuses volumeStatuses;

    public io.roboscale.robot.v1alpha1.robotstatus.VolumeStatuses getVolumeStatuses() {
        return volumeStatuses;
    }

    public void setVolumeStatuses(io.roboscale.robot.v1alpha1.robotstatus.VolumeStatuses volumeStatuses) {
        this.volumeStatuses = volumeStatuses;
    }

    /**
     * Workspace manager status
     */
    @com.fasterxml.jackson.annotation.JsonProperty("workspaceManagerStatus")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Workspace manager status")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha1.robotstatus.WorkspaceManagerStatus workspaceManagerStatus;

    public io.roboscale.robot.v1alpha1.robotstatus.WorkspaceManagerStatus getWorkspaceManagerStatus() {
        return workspaceManagerStatus;
    }

    public void setWorkspaceManagerStatus(io.roboscale.robot.v1alpha1.robotstatus.WorkspaceManagerStatus workspaceManagerStatus) {
        this.workspaceManagerStatus = workspaceManagerStatus;
    }
}

