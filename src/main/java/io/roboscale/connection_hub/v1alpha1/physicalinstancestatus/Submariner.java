package io.roboscale.connection_hub.v1alpha1.physicalinstancestatus;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"connectionResources","deployerStatus","gatewayConnection"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Submariner implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("connectionResources")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.connection_hub.v1alpha1.physicalinstancestatus.submariner.ConnectionResources connectionResources;

    public io.roboscale.connection_hub.v1alpha1.physicalinstancestatus.submariner.ConnectionResources getConnectionResources() {
        return connectionResources;
    }

    public void setConnectionResources(io.roboscale.connection_hub.v1alpha1.physicalinstancestatus.submariner.ConnectionResources connectionResources) {
        this.connectionResources = connectionResources;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("deployerStatus")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.connection_hub.v1alpha1.physicalinstancestatus.submariner.DeployerStatus deployerStatus;

    public io.roboscale.connection_hub.v1alpha1.physicalinstancestatus.submariner.DeployerStatus getDeployerStatus() {
        return deployerStatus;
    }

    public void setDeployerStatus(io.roboscale.connection_hub.v1alpha1.physicalinstancestatus.submariner.DeployerStatus deployerStatus) {
        this.deployerStatus = deployerStatus;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("gatewayConnection")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.connection_hub.v1alpha1.physicalinstancestatus.submariner.GatewayConnection gatewayConnection;

    public io.roboscale.connection_hub.v1alpha1.physicalinstancestatus.submariner.GatewayConnection getGatewayConnection() {
        return gatewayConnection;
    }

    public void setGatewayConnection(io.roboscale.connection_hub.v1alpha1.physicalinstancestatus.submariner.GatewayConnection gatewayConnection) {
        this.gatewayConnection = gatewayConnection;
    }
}

