package io.roboscale.robot.v1alpha2.ros2workloadstatus.statefulsetstatuses;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"availableReplicas","collisionCount","conditions","currentReplicas","currentRevision","observedGeneration","readyReplicas","replicas","updateRevision","updatedReplicas"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Status implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Total number of available pods (ready for at least minReadySeconds) targeted by this statefulset.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("availableReplicas")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Total number of available pods (ready for at least minReadySeconds) targeted by this statefulset.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Integer availableReplicas;

    public Integer getAvailableReplicas() {
        return availableReplicas;
    }

    public void setAvailableReplicas(Integer availableReplicas) {
        this.availableReplicas = availableReplicas;
    }

    /**
     * collisionCount is the count of hash collisions for the StatefulSet. The StatefulSet controller uses this field as a collision avoidance mechanism when it needs to create the name for the newest ControllerRevision.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("collisionCount")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("collisionCount is the count of hash collisions for the StatefulSet. The StatefulSet controller uses this field as a collision avoidance mechanism when it needs to create the name for the newest ControllerRevision.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Integer collisionCount;

    public Integer getCollisionCount() {
        return collisionCount;
    }

    public void setCollisionCount(Integer collisionCount) {
        this.collisionCount = collisionCount;
    }

    /**
     * Represents the latest available observations of a statefulset's current state.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("conditions")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Represents the latest available observations of a statefulset's current state.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.roboscale.robot.v1alpha2.ros2workloadstatus.statefulsetstatuses.status.Conditions> conditions;

    public java.util.List<io.roboscale.robot.v1alpha2.ros2workloadstatus.statefulsetstatuses.status.Conditions> getConditions() {
        return conditions;
    }

    public void setConditions(java.util.List<io.roboscale.robot.v1alpha2.ros2workloadstatus.statefulsetstatuses.status.Conditions> conditions) {
        this.conditions = conditions;
    }

    /**
     * currentReplicas is the number of Pods created by the StatefulSet controller from the StatefulSet version indicated by currentRevision.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("currentReplicas")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("currentReplicas is the number of Pods created by the StatefulSet controller from the StatefulSet version indicated by currentRevision.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Integer currentReplicas;

    public Integer getCurrentReplicas() {
        return currentReplicas;
    }

    public void setCurrentReplicas(Integer currentReplicas) {
        this.currentReplicas = currentReplicas;
    }

    /**
     * currentRevision, if not empty, indicates the version of the StatefulSet used to generate Pods in the sequence [0,currentReplicas).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("currentRevision")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("currentRevision, if not empty, indicates the version of the StatefulSet used to generate Pods in the sequence [0,currentReplicas).")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String currentRevision;

    public String getCurrentRevision() {
        return currentRevision;
    }

    public void setCurrentRevision(String currentRevision) {
        this.currentRevision = currentRevision;
    }

    /**
     * observedGeneration is the most recent generation observed for this StatefulSet. It corresponds to the StatefulSet's generation, which is updated on mutation by the API Server.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("observedGeneration")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("observedGeneration is the most recent generation observed for this StatefulSet. It corresponds to the StatefulSet's generation, which is updated on mutation by the API Server.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long observedGeneration;

    public Long getObservedGeneration() {
        return observedGeneration;
    }

    public void setObservedGeneration(Long observedGeneration) {
        this.observedGeneration = observedGeneration;
    }

    /**
     * readyReplicas is the number of pods created for this StatefulSet with a Ready Condition.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("readyReplicas")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("readyReplicas is the number of pods created for this StatefulSet with a Ready Condition.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Integer readyReplicas;

    public Integer getReadyReplicas() {
        return readyReplicas;
    }

    public void setReadyReplicas(Integer readyReplicas) {
        this.readyReplicas = readyReplicas;
    }

    /**
     * replicas is the number of Pods created by the StatefulSet controller.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("replicas")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("replicas is the number of Pods created by the StatefulSet controller.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Integer replicas;

    public Integer getReplicas() {
        return replicas;
    }

    public void setReplicas(Integer replicas) {
        this.replicas = replicas;
    }

    /**
     * updateRevision, if not empty, indicates the version of the StatefulSet used to generate Pods in the sequence [replicas-updatedReplicas,replicas)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("updateRevision")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("updateRevision, if not empty, indicates the version of the StatefulSet used to generate Pods in the sequence [replicas-updatedReplicas,replicas)")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String updateRevision;

    public String getUpdateRevision() {
        return updateRevision;
    }

    public void setUpdateRevision(String updateRevision) {
        this.updateRevision = updateRevision;
    }

    /**
     * updatedReplicas is the number of Pods created by the StatefulSet controller from the StatefulSet version indicated by updateRevision.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("updatedReplicas")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("updatedReplicas is the number of Pods created by the StatefulSet controller from the StatefulSet version indicated by updateRevision.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Integer updatedReplicas;

    public Integer getUpdatedReplicas() {
        return updatedReplicas;
    }

    public void setUpdatedReplicas(Integer updatedReplicas) {
        this.updatedReplicas = updatedReplicas;
    }
}

