package io.roboscale.robot.v1alpha1.buildmanagerspec.steps.env.valuefrom;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"key","name","optional"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class ConfigMapKeyRef implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * The key to select.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The key to select.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String key;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * Name of the referent.
     * More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
     * TODO: Add other useful fields. apiVersion, kind, uid?
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Name of the referent.\nMore info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names\nTODO: Add other useful fields. apiVersion, kind, uid?")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Specify whether the ConfigMap or its key must be defined
     */
    @com.fasterxml.jackson.annotation.JsonProperty("optional")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Specify whether the ConfigMap or its key must be defined")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean optional;

    public Boolean getOptional() {
        return optional;
    }

    public void setOptional(Boolean optional) {
        this.optional = optional;
    }
}

