package io.roboscale.connection_hub.v1alpha1;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"federationSpec","instanceType","submarinerSpec"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class ConnectionHubSpec implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * FederationOperatorSpec defines the desired state of FederationOperator
     */
    @com.fasterxml.jackson.annotation.JsonProperty("federationSpec")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("FederationOperatorSpec defines the desired state of FederationOperator")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.connection_hub.v1alpha1.connectionhubspec.FederationSpec federationSpec;

    public io.roboscale.connection_hub.v1alpha1.connectionhubspec.FederationSpec getFederationSpec() {
        return federationSpec;
    }

    public void setFederationSpec(io.roboscale.connection_hub.v1alpha1.connectionhubspec.FederationSpec federationSpec) {
        this.federationSpec = federationSpec;
    }

    public enum InstanceType {

        @com.fasterxml.jackson.annotation.JsonProperty("CloudInstance")
        CLOUDINSTANCE("CloudInstance"), @com.fasterxml.jackson.annotation.JsonProperty("PhysicalInstance")
        PHYSICALINSTANCE("PhysicalInstance");

        java.lang.String value;

        InstanceType(java.lang.String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public java.lang.String getValue() {
            return value;
        }
    }

    @com.fasterxml.jackson.annotation.JsonProperty("instanceType")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private InstanceType instanceType;

    public InstanceType getInstanceType() {
        return instanceType;
    }

    public void setInstanceType(InstanceType instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * SubmarinerSpec defines the desired state of Submariner
     */
    @com.fasterxml.jackson.annotation.JsonProperty("submarinerSpec")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("SubmarinerSpec defines the desired state of Submariner")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.connection_hub.v1alpha1.connectionhubspec.SubmarinerSpec submarinerSpec;

    public io.roboscale.connection_hub.v1alpha1.connectionhubspec.SubmarinerSpec getSubmarinerSpec() {
        return submarinerSpec;
    }

    public void setSubmarinerSpec(io.roboscale.connection_hub.v1alpha1.connectionhubspec.SubmarinerSpec submarinerSpec) {
        this.submarinerSpec = submarinerSpec;
    }
}

