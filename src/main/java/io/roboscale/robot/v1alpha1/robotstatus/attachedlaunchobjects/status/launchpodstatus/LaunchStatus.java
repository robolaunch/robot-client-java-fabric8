package io.roboscale.robot.v1alpha1.robotstatus.attachedlaunchobjects.status.launchpodstatus;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"active","containerStatus"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class LaunchStatus implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Inditaces if the launch process are actively running on cluster. It may not be selected by launch cluster selectors.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("active")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Inditaces if the launch process are actively running on cluster. It may not be selected by launch cluster selectors.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean active;

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    /**
     * Statuses of the containers of pods owned by LaunchManager.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("containerStatus")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Statuses of the containers of pods owned by LaunchManager.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha1.robotstatus.attachedlaunchobjects.status.launchpodstatus.launchstatus.ContainerStatus containerStatus;

    public io.roboscale.robot.v1alpha1.robotstatus.attachedlaunchobjects.status.launchpodstatus.launchstatus.ContainerStatus getContainerStatus() {
        return containerStatus;
    }

    public void setContainerStatus(io.roboscale.robot.v1alpha1.robotstatus.attachedlaunchobjects.status.launchpodstatus.launchstatus.ContainerStatus containerStatus) {
        this.containerStatus = containerStatus;
    }
}

