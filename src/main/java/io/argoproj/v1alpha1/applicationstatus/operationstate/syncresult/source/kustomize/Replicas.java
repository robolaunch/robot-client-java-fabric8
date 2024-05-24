package io.argoproj.v1alpha1.applicationstatus.operationstate.syncresult.source.kustomize;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"count","name"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Replicas implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Number of replicas
     */
    @com.fasterxml.jackson.annotation.JsonProperty("count")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Number of replicas")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.fabric8.kubernetes.api.model.IntOrString count;

    public io.fabric8.kubernetes.api.model.IntOrString getCount() {
        return count;
    }

    public void setCount(io.fabric8.kubernetes.api.model.IntOrString count) {
        this.count = count;
    }

    /**
     * Name of Deployment or StatefulSet
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Name of Deployment or StatefulSet")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

