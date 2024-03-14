package io.roboscale.connection_hub.v1alpha1.connectionhubspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"apiServerURL","broker","brokerHelmChart","cableDriver","clusterCIDR","helmRepository","instanceType","networkType","operatorHelmChart","presharedKey","serviceCIDR"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class SubmarinerSpec implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("apiServerURL")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String apiServerURL;

    public String getApiServerURL() {
        return apiServerURL;
    }

    public void setApiServerURL(String apiServerURL) {
        this.apiServerURL = apiServerURL;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("broker")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.connection_hub.v1alpha1.connectionhubspec.submarinerspec.Broker broker;

    public io.roboscale.connection_hub.v1alpha1.connectionhubspec.submarinerspec.Broker getBroker() {
        return broker;
    }

    public void setBroker(io.roboscale.connection_hub.v1alpha1.connectionhubspec.submarinerspec.Broker broker) {
        this.broker = broker;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("brokerHelmChart")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.connection_hub.v1alpha1.connectionhubspec.submarinerspec.BrokerHelmChart brokerHelmChart;

    public io.roboscale.connection_hub.v1alpha1.connectionhubspec.submarinerspec.BrokerHelmChart getBrokerHelmChart() {
        return brokerHelmChart;
    }

    public void setBrokerHelmChart(io.roboscale.connection_hub.v1alpha1.connectionhubspec.submarinerspec.BrokerHelmChart brokerHelmChart) {
        this.brokerHelmChart = brokerHelmChart;
    }

    public enum CableDriver {

        @com.fasterxml.jackson.annotation.JsonProperty("libreswan")
        LIBRESWAN("libreswan"), @com.fasterxml.jackson.annotation.JsonProperty("wireguard")
        WIREGUARD("wireguard");

        java.lang.String value;

        CableDriver(java.lang.String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public java.lang.String getValue() {
            return value;
        }
    }

    @com.fasterxml.jackson.annotation.JsonProperty("cableDriver")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private CableDriver cableDriver;

    public CableDriver getCableDriver() {
        return cableDriver;
    }

    public void setCableDriver(CableDriver cableDriver) {
        this.cableDriver = cableDriver;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("clusterCIDR")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String clusterCIDR;

    public String getClusterCIDR() {
        return clusterCIDR;
    }

    public void setClusterCIDR(String clusterCIDR) {
        this.clusterCIDR = clusterCIDR;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("helmRepository")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.connection_hub.v1alpha1.connectionhubspec.submarinerspec.HelmRepository helmRepository;

    public io.roboscale.connection_hub.v1alpha1.connectionhubspec.submarinerspec.HelmRepository getHelmRepository() {
        return helmRepository;
    }

    public void setHelmRepository(io.roboscale.connection_hub.v1alpha1.connectionhubspec.submarinerspec.HelmRepository helmRepository) {
        this.helmRepository = helmRepository;
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

    public enum NetworkType {

        @com.fasterxml.jackson.annotation.JsonProperty("Local")
        LOCAL("Local"), @com.fasterxml.jackson.annotation.JsonProperty("External")
        EXTERNAL("External");

        java.lang.String value;

        NetworkType(java.lang.String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public java.lang.String getValue() {
            return value;
        }
    }

    @com.fasterxml.jackson.annotation.JsonProperty("networkType")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private NetworkType networkType = io.fabric8.kubernetes.client.utils.Serialization.unmarshal("\"External\"", NetworkType.class);

    public NetworkType getNetworkType() {
        return networkType;
    }

    public void setNetworkType(NetworkType networkType) {
        this.networkType = networkType;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("operatorHelmChart")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.connection_hub.v1alpha1.connectionhubspec.submarinerspec.OperatorHelmChart operatorHelmChart;

    public io.roboscale.connection_hub.v1alpha1.connectionhubspec.submarinerspec.OperatorHelmChart getOperatorHelmChart() {
        return operatorHelmChart;
    }

    public void setOperatorHelmChart(io.roboscale.connection_hub.v1alpha1.connectionhubspec.submarinerspec.OperatorHelmChart operatorHelmChart) {
        this.operatorHelmChart = operatorHelmChart;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("presharedKey")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String presharedKey;

    public String getPresharedKey() {
        return presharedKey;
    }

    public void setPresharedKey(String presharedKey) {
        this.presharedKey = presharedKey;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("serviceCIDR")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String serviceCIDR = "10.32.0.0/16";

    public String getServiceCIDR() {
        return serviceCIDR;
    }

    public void setServiceCIDR(String serviceCIDR) {
        this.serviceCIDR = serviceCIDR;
    }
}

