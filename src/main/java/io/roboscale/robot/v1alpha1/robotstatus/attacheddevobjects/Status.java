package io.roboscale.robot.v1alpha1.robotstatus.attacheddevobjects;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"active","phase","robotIDEStatus","robotVDIStatus"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Status implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("active")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean active;

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("phase")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String phase;

    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("robotIDEStatus")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha1.robotstatus.attacheddevobjects.status.RobotIDEStatus robotIDEStatus;

    public io.roboscale.robot.v1alpha1.robotstatus.attacheddevobjects.status.RobotIDEStatus getRobotIDEStatus() {
        return robotIDEStatus;
    }

    public void setRobotIDEStatus(io.roboscale.robot.v1alpha1.robotstatus.attacheddevobjects.status.RobotIDEStatus robotIDEStatus) {
        this.robotIDEStatus = robotIDEStatus;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("robotVDIStatus")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha1.robotstatus.attacheddevobjects.status.RobotVDIStatus robotVDIStatus;

    public io.roboscale.robot.v1alpha1.robotstatus.attacheddevobjects.status.RobotVDIStatus getRobotVDIStatus() {
        return robotVDIStatus;
    }

    public void setRobotVDIStatus(io.roboscale.robot.v1alpha1.robotstatus.attacheddevobjects.status.RobotVDIStatus robotVDIStatus) {
        this.robotVDIStatus = robotVDIStatus;
    }
}

