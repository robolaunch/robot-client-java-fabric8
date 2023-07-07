package io.kubefed.types.v1beta1;

@io.fabric8.kubernetes.model.annotation.Version(value = "v1beta1" , storage = true , served = true)
@io.fabric8.kubernetes.model.annotation.Group("types.kubefed.io")
@io.fabric8.kubernetes.model.annotation.Singular("federatedfleet")
@io.fabric8.kubernetes.model.annotation.Plural("federatedfleets")
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class FederatedFleet extends io.fabric8.kubernetes.client.CustomResource<io.kubefed.types.v1beta1.FederatedFleetSpec, io.kubefed.types.v1beta1.FederatedFleetStatus> implements io.fabric8.kubernetes.api.model.Namespaced {
}

