package io.roboscale.robot.v1alpha2.ros2workloadstatus.statefulsetstatuses.containerstatuses.laststate;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"startedAt"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Running implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Time at which the container was last (re-)started
     */
    @com.fasterxml.jackson.annotation.JsonProperty("startedAt")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Time at which the container was last (re-)started")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String startedAt;

    public String getStartedAt() {
        return startedAt;
    }

    public void setStartedAt(String startedAt) {
        this.startedAt = startedAt;
    }
}

