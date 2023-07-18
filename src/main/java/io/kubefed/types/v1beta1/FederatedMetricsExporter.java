package io.kubefed.types.v1beta1;

@io.fabric8.kubernetes.model.annotation.Version(value = "v1beta1" , storage = true , served = true)
@io.fabric8.kubernetes.model.annotation.Group("types.kubefed.io")
@io.fabric8.kubernetes.model.annotation.Singular("federatedmetricsexporter")
@io.fabric8.kubernetes.model.annotation.Plural("federatedmetricsexporters")
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class FederatedMetricsExporter extends io.fabric8.kubernetes.client.CustomResource<io.kubefed.types.v1beta1.FederatedMetricsExporterSpec, io.kubefed.types.v1beta1.FederatedMetricsExporterStatus> implements io.fabric8.kubernetes.api.model.Namespaced {
}

