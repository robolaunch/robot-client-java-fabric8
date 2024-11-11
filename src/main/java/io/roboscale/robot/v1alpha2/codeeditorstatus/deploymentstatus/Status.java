package io.roboscale.robot.v1alpha2.codeeditorstatus.deploymentstatus;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"availableReplicas","collisionCount","conditions","observedGeneration","readyReplicas","replicas","unavailableReplicas","updatedReplicas"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Status implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Total number of available pods (ready for at least minReadySeconds) targeted by this deployment.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("availableReplicas")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Total number of available pods (ready for at least minReadySeconds) targeted by this deployment.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Integer availableReplicas;

    public Integer getAvailableReplicas() {
        return availableReplicas;
    }

    public void setAvailableReplicas(Integer availableReplicas) {
        this.availableReplicas = availableReplicas;
    }

    /**
     * Count of hash collisions for the Deployment. The Deployment controller uses this
     * field as a collision avoidance mechanism when it needs to create the name for the
     * newest ReplicaSet.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("collisionCount")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Count of hash collisions for the Deployment. The Deployment controller uses this\nfield as a collision avoidance mechanism when it needs to create the name for the\nnewest ReplicaSet.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Integer collisionCount;

    public Integer getCollisionCount() {
        return collisionCount;
    }

    public void setCollisionCount(Integer collisionCount) {
        this.collisionCount = collisionCount;
    }

    /**
     * Represents the latest available observations of a deployment's current state.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("conditions")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Represents the latest available observations of a deployment's current state.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.roboscale.robot.v1alpha2.codeeditorstatus.deploymentstatus.status.Conditions> conditions;

    public java.util.List<io.roboscale.robot.v1alpha2.codeeditorstatus.deploymentstatus.status.Conditions> getConditions() {
        return conditions;
    }

    public void setConditions(java.util.List<io.roboscale.robot.v1alpha2.codeeditorstatus.deploymentstatus.status.Conditions> conditions) {
        this.conditions = conditions;
    }

    /**
     * The generation observed by the deployment controller.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("observedGeneration")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The generation observed by the deployment controller.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long observedGeneration;

    public Long getObservedGeneration() {
        return observedGeneration;
    }

    public void setObservedGeneration(Long observedGeneration) {
        this.observedGeneration = observedGeneration;
    }

    /**
     * readyReplicas is the number of pods targeted by this Deployment with a Ready Condition.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("readyReplicas")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("readyReplicas is the number of pods targeted by this Deployment with a Ready Condition.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Integer readyReplicas;

    public Integer getReadyReplicas() {
        return readyReplicas;
    }

    public void setReadyReplicas(Integer readyReplicas) {
        this.readyReplicas = readyReplicas;
    }

    /**
     * Total number of non-terminated pods targeted by this deployment (their labels match the selector).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("replicas")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Total number of non-terminated pods targeted by this deployment (their labels match the selector).")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Integer replicas;

    public Integer getReplicas() {
        return replicas;
    }

    public void setReplicas(Integer replicas) {
        this.replicas = replicas;
    }

    /**
     * Total number of unavailable pods targeted by this deployment. This is the total number of
     * pods that are still required for the deployment to have 100% available capacity. They may
     * either be pods that are running but not yet available or pods that still have not been created.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("unavailableReplicas")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Total number of unavailable pods targeted by this deployment. This is the total number of\npods that are still required for the deployment to have 100% available capacity. They may\neither be pods that are running but not yet available or pods that still have not been created.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Integer unavailableReplicas;

    public Integer getUnavailableReplicas() {
        return unavailableReplicas;
    }

    public void setUnavailableReplicas(Integer unavailableReplicas) {
        this.unavailableReplicas = unavailableReplicas;
    }

    /**
     * Total number of non-terminated pods targeted by this deployment that have the desired template spec.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("updatedReplicas")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Total number of non-terminated pods targeted by this deployment that have the desired template spec.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Integer updatedReplicas;

    public Integer getUpdatedReplicas() {
        return updatedReplicas;
    }

    public void setUpdatedReplicas(Integer updatedReplicas) {
        this.updatedReplicas = updatedReplicas;
    }
}

