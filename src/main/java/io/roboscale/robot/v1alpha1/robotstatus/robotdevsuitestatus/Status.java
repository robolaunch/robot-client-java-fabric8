package io.roboscale.robot.v1alpha1.robotstatus.robotdevsuitestatus;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"active","phase","robotIDEStatus","robotVDIStatus"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Status implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * [*alpha*] Indicates if RobotDevSuite is attached to a Robot and actively provisioned it's resources.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("active")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("[*alpha*] Indicates if RobotDevSuite is attached to a Robot and actively provisioned it's resources.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean active;

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    /**
     * Phase of RobotDevSuite.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("phase")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Phase of RobotDevSuite.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String phase;

    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    /**
     * Status of RobotIDE.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("robotIDEStatus")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Status of RobotIDE.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha1.robotstatus.robotdevsuitestatus.status.RobotIDEStatus robotIDEStatus;

    public io.roboscale.robot.v1alpha1.robotstatus.robotdevsuitestatus.status.RobotIDEStatus getRobotIDEStatus() {
        return robotIDEStatus;
    }

    public void setRobotIDEStatus(io.roboscale.robot.v1alpha1.robotstatus.robotdevsuitestatus.status.RobotIDEStatus robotIDEStatus) {
        this.robotIDEStatus = robotIDEStatus;
    }

    /**
     * Status of RobotVDI.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("robotVDIStatus")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Status of RobotVDI.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha1.robotstatus.robotdevsuitestatus.status.RobotVDIStatus robotVDIStatus;

    public io.roboscale.robot.v1alpha1.robotstatus.robotdevsuitestatus.status.RobotVDIStatus getRobotVDIStatus() {
        return robotVDIStatus;
    }

    public void setRobotVDIStatus(io.roboscale.robot.v1alpha1.robotstatus.robotdevsuitestatus.status.RobotVDIStatus robotVDIStatus) {
        this.robotVDIStatus = robotVDIStatus;
    }
}

