package io.kubefed.types.v1beta1;

@io.fabric8.kubernetes.model.annotation.Version(value = "v1beta1" , storage = true , served = true)
@io.fabric8.kubernetes.model.annotation.Group("types.kubefed.io")
@io.fabric8.kubernetes.model.annotation.Singular("federatedlaunchmanager")
@io.fabric8.kubernetes.model.annotation.Plural("federatedlaunchmanagers")
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class FederatedLaunchManager extends io.fabric8.kubernetes.client.CustomResource<io.kubefed.types.v1beta1.FederatedLaunchManagerSpec, io.kubefed.types.v1beta1.FederatedLaunchManagerStatus> implements io.fabric8.kubernetes.api.model.Namespaced {
}

