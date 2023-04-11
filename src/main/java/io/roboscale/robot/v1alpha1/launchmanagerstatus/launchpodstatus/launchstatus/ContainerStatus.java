package io.roboscale.robot.v1alpha1.launchmanagerstatus.launchpodstatus.launchstatus;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"containerID","image","imageID","lastState","name","ready","restartCount","started","state"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class ContainerStatus implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Container's ID in the format '<type>://<container_id>'.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("containerID")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Container's ID in the format '<type>://<container_id>'.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String containerID;

    public String getContainerID() {
        return containerID;
    }

    public void setContainerID(String containerID) {
        this.containerID = containerID;
    }

    /**
     * The image the container is running. More info: https://kubernetes.io/docs/concepts/containers/images.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("image")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The image the container is running. More info: https://kubernetes.io/docs/concepts/containers/images.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String image;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    /**
     * ImageID of the container's image.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("imageID")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("ImageID of the container's image.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String imageID;

    public String getImageID() {
        return imageID;
    }

    public void setImageID(String imageID) {
        this.imageID = imageID;
    }

    /**
     * Details about the container's last termination condition.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lastState")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Details about the container's last termination condition.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha1.launchmanagerstatus.launchpodstatus.launchstatus.containerstatus.LastState lastState;

    public io.roboscale.robot.v1alpha1.launchmanagerstatus.launchpodstatus.launchstatus.containerstatus.LastState getLastState() {
        return lastState;
    }

    public void setLastState(io.roboscale.robot.v1alpha1.launchmanagerstatus.launchpodstatus.launchstatus.containerstatus.LastState lastState) {
        this.lastState = lastState;
    }

    /**
     * This must be a DNS_LABEL. Each container in a pod must have a unique name. Cannot be updated.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("This must be a DNS_LABEL. Each container in a pod must have a unique name. Cannot be updated.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Specifies whether the container has passed its readiness probe.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ready")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Specifies whether the container has passed its readiness probe.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean ready;

    public Boolean getReady() {
        return ready;
    }

    public void setReady(Boolean ready) {
        this.ready = ready;
    }

    /**
     * The number of times the container has been restarted.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("restartCount")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The number of times the container has been restarted.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Integer restartCount;

    public Integer getRestartCount() {
        return restartCount;
    }

    public void setRestartCount(Integer restartCount) {
        this.restartCount = restartCount;
    }

    /**
     * Specifies whether the container has passed its startup probe. Initialized as false, becomes true after startupProbe is considered successful. Resets to false when the container is restarted, or if kubelet loses state temporarily. Is always true when no startupProbe is defined.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("started")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Specifies whether the container has passed its startup probe. Initialized as false, becomes true after startupProbe is considered successful. Resets to false when the container is restarted, or if kubelet loses state temporarily. Is always true when no startupProbe is defined.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean started;

    public Boolean getStarted() {
        return started;
    }

    public void setStarted(Boolean started) {
        this.started = started;
    }

    /**
     * Details about the container's current condition.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("state")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Details about the container's current condition.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha1.launchmanagerstatus.launchpodstatus.launchstatus.containerstatus.State state;

    public io.roboscale.robot.v1alpha1.launchmanagerstatus.launchpodstatus.launchstatus.containerstatus.State getState() {
        return state;
    }

    public void setState(io.roboscale.robot.v1alpha1.launchmanagerstatus.launchpodstatus.launchstatus.containerstatus.State state) {
        this.state = state;
    }
}

