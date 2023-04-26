package io.roboscale.connection_hub.v1alpha1.connectionhubstatus.connectioninterfaces.forphysicalinstance;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"controllerImage","federatedTypes","helmChart","helmRepository","postInstallJobImage","webhookImage"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class FederationSpec implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("controllerImage")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.connection_hub.v1alpha1.connectionhubstatus.connectioninterfaces.forphysicalinstance.federationspec.ControllerImage controllerImage;

    public io.roboscale.connection_hub.v1alpha1.connectionhubstatus.connectioninterfaces.forphysicalinstance.federationspec.ControllerImage getControllerImage() {
        return controllerImage;
    }

    public void setControllerImage(io.roboscale.connection_hub.v1alpha1.connectionhubstatus.connectioninterfaces.forphysicalinstance.federationspec.ControllerImage controllerImage) {
        this.controllerImage = controllerImage;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("federatedTypes")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> federatedTypes;

    public java.util.List<String> getFederatedTypes() {
        return federatedTypes;
    }

    public void setFederatedTypes(java.util.List<String> federatedTypes) {
        this.federatedTypes = federatedTypes;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("helmChart")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.connection_hub.v1alpha1.connectionhubstatus.connectioninterfaces.forphysicalinstance.federationspec.HelmChart helmChart;

    public io.roboscale.connection_hub.v1alpha1.connectionhubstatus.connectioninterfaces.forphysicalinstance.federationspec.HelmChart getHelmChart() {
        return helmChart;
    }

    public void setHelmChart(io.roboscale.connection_hub.v1alpha1.connectionhubstatus.connectioninterfaces.forphysicalinstance.federationspec.HelmChart helmChart) {
        this.helmChart = helmChart;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("helmRepository")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.connection_hub.v1alpha1.connectionhubstatus.connectioninterfaces.forphysicalinstance.federationspec.HelmRepository helmRepository;

    public io.roboscale.connection_hub.v1alpha1.connectionhubstatus.connectioninterfaces.forphysicalinstance.federationspec.HelmRepository getHelmRepository() {
        return helmRepository;
    }

    public void setHelmRepository(io.roboscale.connection_hub.v1alpha1.connectionhubstatus.connectioninterfaces.forphysicalinstance.federationspec.HelmRepository helmRepository) {
        this.helmRepository = helmRepository;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("postInstallJobImage")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.connection_hub.v1alpha1.connectionhubstatus.connectioninterfaces.forphysicalinstance.federationspec.PostInstallJobImage postInstallJobImage;

    public io.roboscale.connection_hub.v1alpha1.connectionhubstatus.connectioninterfaces.forphysicalinstance.federationspec.PostInstallJobImage getPostInstallJobImage() {
        return postInstallJobImage;
    }

    public void setPostInstallJobImage(io.roboscale.connection_hub.v1alpha1.connectionhubstatus.connectioninterfaces.forphysicalinstance.federationspec.PostInstallJobImage postInstallJobImage) {
        this.postInstallJobImage = postInstallJobImage;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("webhookImage")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.roboscale.connection_hub.v1alpha1.connectionhubstatus.connectioninterfaces.forphysicalinstance.federationspec.WebhookImage webhookImage;

    public io.roboscale.connection_hub.v1alpha1.connectionhubstatus.connectioninterfaces.forphysicalinstance.federationspec.WebhookImage getWebhookImage() {
        return webhookImage;
    }

    public void setWebhookImage(io.roboscale.connection_hub.v1alpha1.connectionhubstatus.connectioninterfaces.forphysicalinstance.federationspec.WebhookImage webhookImage) {
        this.webhookImage = webhookImage;
    }
}

