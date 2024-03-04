package io.roboscale.robot.v1alpha2.ros2workloadstatus.statefulsetstatuses.containerstatuses.state;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"containerID","exitCode","finishedAt","message","reason","signal","startedAt"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Terminated implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Container's ID in the format '<type>://<container_id>'
     */
    @com.fasterxml.jackson.annotation.JsonProperty("containerID")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Container's ID in the format '<type>://<container_id>'")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String containerID;

    public String getContainerID() {
        return containerID;
    }

    public void setContainerID(String containerID) {
        this.containerID = containerID;
    }

    /**
     * Exit status from the last termination of the container
     */
    @com.fasterxml.jackson.annotation.JsonProperty("exitCode")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Exit status from the last termination of the container")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Integer exitCode;

    public Integer getExitCode() {
        return exitCode;
    }

    public void setExitCode(Integer exitCode) {
        this.exitCode = exitCode;
    }

    /**
     * Time at which the container last terminated
     */
    @com.fasterxml.jackson.annotation.JsonProperty("finishedAt")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Time at which the container last terminated")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String finishedAt;

    public String getFinishedAt() {
        return finishedAt;
    }

    public void setFinishedAt(String finishedAt) {
        this.finishedAt = finishedAt;
    }

    /**
     * Message regarding the last termination of the container
     */
    @com.fasterxml.jackson.annotation.JsonProperty("message")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Message regarding the last termination of the container")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * (brief) reason from the last termination of the container
     */
    @com.fasterxml.jackson.annotation.JsonProperty("reason")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("(brief) reason from the last termination of the container")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String reason;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * Signal from the last termination of the container
     */
    @com.fasterxml.jackson.annotation.JsonProperty("signal")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Signal from the last termination of the container")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Integer signal;

    public Integer getSignal() {
        return signal;
    }

    public void setSignal(Integer signal) {
        this.signal = signal;
    }

    /**
     * Time at which previous execution of the container started
     */
    @com.fasterxml.jackson.annotation.JsonProperty("startedAt")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Time at which previous execution of the container started")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String startedAt;

    public String getStartedAt() {
        return startedAt;
    }

    public void setStartedAt(String startedAt) {
        this.startedAt = startedAt;
    }
}

