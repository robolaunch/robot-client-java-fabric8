package io.roboscale.connection_hub.v1alpha1.physicalinstancestatus.submariner;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"clusterStatus","endpointStatus"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class ConnectionResources implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("clusterStatus")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.connection_hub.v1alpha1.physicalinstancestatus.submariner.connectionresources.ClusterStatus clusterStatus;

    public io.roboscale.connection_hub.v1alpha1.physicalinstancestatus.submariner.connectionresources.ClusterStatus getClusterStatus() {
        return clusterStatus;
    }

    public void setClusterStatus(io.roboscale.connection_hub.v1alpha1.physicalinstancestatus.submariner.connectionresources.ClusterStatus clusterStatus) {
        this.clusterStatus = clusterStatus;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("endpointStatus")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.connection_hub.v1alpha1.physicalinstancestatus.submariner.connectionresources.EndpointStatus endpointStatus;

    public io.roboscale.connection_hub.v1alpha1.physicalinstancestatus.submariner.connectionresources.EndpointStatus getEndpointStatus() {
        return endpointStatus;
    }

    public void setEndpointStatus(io.roboscale.connection_hub.v1alpha1.physicalinstancestatus.submariner.connectionresources.EndpointStatus endpointStatus) {
        this.endpointStatus = endpointStatus;
    }
}

