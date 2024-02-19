package io.roboscale.connection_hub.v1alpha1;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"bootID","connectionResources","deployerStatus","gatewayConnection","phase"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class CloudInstanceStatus implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("bootID")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String bootID;

    public String getBootID() {
        return bootID;
    }

    public void setBootID(String bootID) {
        this.bootID = bootID;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("connectionResources")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.connection_hub.v1alpha1.cloudinstancestatus.ConnectionResources connectionResources;

    public io.roboscale.connection_hub.v1alpha1.cloudinstancestatus.ConnectionResources getConnectionResources() {
        return connectionResources;
    }

    public void setConnectionResources(io.roboscale.connection_hub.v1alpha1.cloudinstancestatus.ConnectionResources connectionResources) {
        this.connectionResources = connectionResources;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("deployerStatus")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.connection_hub.v1alpha1.cloudinstancestatus.DeployerStatus deployerStatus;

    public io.roboscale.connection_hub.v1alpha1.cloudinstancestatus.DeployerStatus getDeployerStatus() {
        return deployerStatus;
    }

    public void setDeployerStatus(io.roboscale.connection_hub.v1alpha1.cloudinstancestatus.DeployerStatus deployerStatus) {
        this.deployerStatus = deployerStatus;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("gatewayConnection")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.connection_hub.v1alpha1.cloudinstancestatus.GatewayConnection gatewayConnection;

    public io.roboscale.connection_hub.v1alpha1.cloudinstancestatus.GatewayConnection getGatewayConnection() {
        return gatewayConnection;
    }

    public void setGatewayConnection(io.roboscale.connection_hub.v1alpha1.cloudinstancestatus.GatewayConnection gatewayConnection) {
        this.gatewayConnection = gatewayConnection;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("phase")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String phase;

    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }
}

