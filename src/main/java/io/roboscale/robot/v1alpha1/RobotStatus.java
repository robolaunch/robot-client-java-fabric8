package io.roboscale.robot.v1alpha1;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"attachedBuildObject","attachedDevObjects","attachedLaunchObjects","discoveryServerStatus","hostDirs","image","loaderJobStatus","nodeName","persistentDirs","phase","robotDevSuiteStatus","rosBridgeStatus","uid","workspaceManagerStatus"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class RobotStatus implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Attached build object information.
     * A BuildManager can be attached with a label on it with key `robolaunch.io/target-robot`
     * and value of the target robot's name.
     * Robot sorts the BuildManagers targeted itself, and picks the last created object to process.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("attachedBuildObject")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Attached build object information.\nA BuildManager can be attached with a label on it with key `robolaunch.io/target-robot`\nand value of the target robot's name.\nRobot sorts the BuildManagers targeted itself, and picks the last created object to process.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha1.robotstatus.AttachedBuildObject attachedBuildObject;

    public io.roboscale.robot.v1alpha1.robotstatus.AttachedBuildObject getAttachedBuildObject() {
        return attachedBuildObject;
    }

    public void setAttachedBuildObject(io.roboscale.robot.v1alpha1.robotstatus.AttachedBuildObject attachedBuildObject) {
        this.attachedBuildObject = attachedBuildObject;
    }

    /**
     * [*alpha*] Attached dev object information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("attachedDevObjects")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("[*alpha*] Attached dev object information.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.roboscale.robot.v1alpha1.robotstatus.AttachedDevObjects> attachedDevObjects;

    public java.util.List<io.roboscale.robot.v1alpha1.robotstatus.AttachedDevObjects> getAttachedDevObjects() {
        return attachedDevObjects;
    }

    public void setAttachedDevObjects(java.util.List<io.roboscale.robot.v1alpha1.robotstatus.AttachedDevObjects> attachedDevObjects) {
        this.attachedDevObjects = attachedDevObjects;
    }

    /**
     * Attached launch object information.
     * A LaunchManager can be attached with a label on it with key `robolaunch.io/target-robot`
     * and value of the target robot's name.
     * Multiple LaunchManager could work together if they targeted the same Robot.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("attachedLaunchObjects")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Attached launch object information.\nA LaunchManager can be attached with a label on it with key `robolaunch.io/target-robot`\nand value of the target robot's name.\nMultiple LaunchManager could work together if they targeted the same Robot.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.roboscale.robot.v1alpha1.robotstatus.AttachedLaunchObjects> attachedLaunchObjects;

    public java.util.List<io.roboscale.robot.v1alpha1.robotstatus.AttachedLaunchObjects> getAttachedLaunchObjects() {
        return attachedLaunchObjects;
    }

    public void setAttachedLaunchObjects(java.util.List<io.roboscale.robot.v1alpha1.robotstatus.AttachedLaunchObjects> attachedLaunchObjects) {
        this.attachedLaunchObjects = attachedLaunchObjects;
    }

    /**
     * Discovery server instance status.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("discoveryServerStatus")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Discovery server instance status.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha1.robotstatus.DiscoveryServerStatus discoveryServerStatus;

    public io.roboscale.robot.v1alpha1.robotstatus.DiscoveryServerStatus getDiscoveryServerStatus() {
        return discoveryServerStatus;
    }

    public void setDiscoveryServerStatus(io.roboscale.robot.v1alpha1.robotstatus.DiscoveryServerStatus discoveryServerStatus) {
        this.discoveryServerStatus = discoveryServerStatus;
    }

    /**
     * [*alpha*] List of directories mounted from host.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("hostDirs")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("[*alpha*] List of directories mounted from host.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.roboscale.robot.v1alpha1.robotstatus.HostDirs> hostDirs;

    public java.util.List<io.roboscale.robot.v1alpha1.robotstatus.HostDirs> getHostDirs() {
        return hostDirs;
    }

    public void setHostDirs(java.util.List<io.roboscale.robot.v1alpha1.robotstatus.HostDirs> hostDirs) {
        this.hostDirs = hostDirs;
    }

    /**
     * Main image of Robot. It is derived either from the specifications or determined directly over labels.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("image")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Main image of Robot. It is derived either from the specifications or determined directly over labels.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String image;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    /**
     * Status of loader job that configures environment.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("loaderJobStatus")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Status of loader job that configures environment.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha1.robotstatus.LoaderJobStatus loaderJobStatus;

    public io.roboscale.robot.v1alpha1.robotstatus.LoaderJobStatus getLoaderJobStatus() {
        return loaderJobStatus;
    }

    public void setLoaderJobStatus(io.roboscale.robot.v1alpha1.robotstatus.LoaderJobStatus loaderJobStatus) {
        this.loaderJobStatus = loaderJobStatus;
    }

    /**
     * Node that Robot uses. It is selected via tenancy labels.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nodeName")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Node that Robot uses. It is selected via tenancy labels.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String nodeName;

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    /**
     * [*alpha*] Status of PVCs of persistent directories.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("persistentDirs")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("[*alpha*] Status of PVCs of persistent directories.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.roboscale.robot.v1alpha1.robotstatus.PersistentDirs> persistentDirs;

    public java.util.List<io.roboscale.robot.v1alpha1.robotstatus.PersistentDirs> getPersistentDirs() {
        return persistentDirs;
    }

    public void setPersistentDirs(java.util.List<io.roboscale.robot.v1alpha1.robotstatus.PersistentDirs> persistentDirs) {
        this.persistentDirs = persistentDirs;
    }

    /**
     * Phase of Robot. It sums the general status of Robot.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("phase")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Phase of Robot. It sums the general status of Robot.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String phase;

    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    /**
     * Robot development suite instance status.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("robotDevSuiteStatus")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Robot development suite instance status.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha1.robotstatus.RobotDevSuiteStatus robotDevSuiteStatus;

    public io.roboscale.robot.v1alpha1.robotstatus.RobotDevSuiteStatus getRobotDevSuiteStatus() {
        return robotDevSuiteStatus;
    }

    public void setRobotDevSuiteStatus(io.roboscale.robot.v1alpha1.robotstatus.RobotDevSuiteStatus robotDevSuiteStatus) {
        this.robotDevSuiteStatus = robotDevSuiteStatus;
    }

    /**
     * ROS bridge instance status.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("rosBridgeStatus")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("ROS bridge instance status.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha1.robotstatus.RosBridgeStatus rosBridgeStatus;

    public io.roboscale.robot.v1alpha1.robotstatus.RosBridgeStatus getRosBridgeStatus() {
        return rosBridgeStatus;
    }

    public void setRosBridgeStatus(io.roboscale.robot.v1alpha1.robotstatus.RosBridgeStatus rosBridgeStatus) {
        this.rosBridgeStatus = rosBridgeStatus;
    }

    /**
     * User ID of robolaunch user in image.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("uid")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("User ID of robolaunch user in image.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long uid;

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    /**
     * Workspace manager instance status if exists.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("workspaceManagerStatus")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Workspace manager instance status if exists.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha1.robotstatus.WorkspaceManagerStatus workspaceManagerStatus;

    public io.roboscale.robot.v1alpha1.robotstatus.WorkspaceManagerStatus getWorkspaceManagerStatus() {
        return workspaceManagerStatus;
    }

    public void setWorkspaceManagerStatus(io.roboscale.robot.v1alpha1.robotstatus.WorkspaceManagerStatus workspaceManagerStatus) {
        this.workspaceManagerStatus = workspaceManagerStatus;
    }
}

