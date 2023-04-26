package io.roboscale.connection_hub.v1alpha1.connectionhubstatus;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"forCloudInstance","forPhysicalInstance"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class ConnectionInterfaces implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("forCloudInstance")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.Map<java.lang.String, io.roboscale.connection_hub.v1alpha1.connectionhubstatus.connectioninterfaces.ForCloudInstance> forCloudInstance;

    public java.util.Map<java.lang.String, io.roboscale.connection_hub.v1alpha1.connectionhubstatus.connectioninterfaces.ForCloudInstance> getForCloudInstance() {
        return forCloudInstance;
    }

    public void setForCloudInstance(java.util.Map<java.lang.String, io.roboscale.connection_hub.v1alpha1.connectionhubstatus.connectioninterfaces.ForCloudInstance> forCloudInstance) {
        this.forCloudInstance = forCloudInstance;
    }

    /**
     * ConnectionHubSpec defines the desired state of ConnectionHub
     */
    @com.fasterxml.jackson.annotation.JsonProperty("forPhysicalInstance")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("ConnectionHubSpec defines the desired state of ConnectionHub")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.connection_hub.v1alpha1.connectionhubstatus.connectioninterfaces.ForPhysicalInstance forPhysicalInstance;

    public io.roboscale.connection_hub.v1alpha1.connectionhubstatus.connectioninterfaces.ForPhysicalInstance getForPhysicalInstance() {
        return forPhysicalInstance;
    }

    public void setForPhysicalInstance(io.roboscale.connection_hub.v1alpha1.connectionhubstatus.connectioninterfaces.ForPhysicalInstance forPhysicalInstance) {
        this.forPhysicalInstance = forPhysicalInstance;
    }
}

