package io.roboscale.robot.v1alpha1.launchmanagerstatus.launchpodstatus;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"active","containerStatus"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class LaunchStatus implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("active")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean active;

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    /**
     * ContainerStatus contains details for the current status of this container.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("containerStatus")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("ContainerStatus contains details for the current status of this container.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha1.launchmanagerstatus.launchpodstatus.launchstatus.ContainerStatus containerStatus;

    public io.roboscale.robot.v1alpha1.launchmanagerstatus.launchpodstatus.launchstatus.ContainerStatus getContainerStatus() {
        return containerStatus;
    }

    public void setContainerStatus(io.roboscale.robot.v1alpha1.launchmanagerstatus.launchpodstatus.launchstatus.ContainerStatus containerStatus) {
        this.containerStatus = containerStatus;
    }
}

