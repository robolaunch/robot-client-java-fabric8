package io.roboscale.robot.v1alpha1.robotspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"amount","storageClassConfig"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Storage implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Specifies how much storage will be allocated in total.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("amount")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Specifies how much storage will be allocated in total.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long amount = 10000L;

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    /**
     * Storage class selection for robot's volumes.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("storageClassConfig")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Storage class selection for robot's volumes.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.robot.v1alpha1.robotspec.storage.StorageClassConfig storageClassConfig;

    public io.roboscale.robot.v1alpha1.robotspec.storage.StorageClassConfig getStorageClassConfig() {
        return storageClassConfig;
    }

    public void setStorageClassConfig(io.roboscale.robot.v1alpha1.robotspec.storage.StorageClassConfig storageClassConfig) {
        this.storageClassConfig = storageClassConfig;
    }
}

