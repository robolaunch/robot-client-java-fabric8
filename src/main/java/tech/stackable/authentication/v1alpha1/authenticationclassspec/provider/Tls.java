package tech.stackable.authentication.v1alpha1.authenticationclassspec.provider;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"clientCertSecretClass"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Tls implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * See [ADR017: TLS authentication](https://docs.stackable.tech/home/nightly/contributor/adr/adr017-tls_authentication). If `client_cert_secret_class` is not set, the TLS settings may also be used for client authentication. If `client_cert_secret_class` is set, the [SecretClass](https://docs.stackable.tech/home/nightly/secret-operator/secretclass) will be used to provision client certificates.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("clientCertSecretClass")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("See [ADR017: TLS authentication](https://docs.stackable.tech/home/nightly/contributor/adr/adr017-tls_authentication). If `client_cert_secret_class` is not set, the TLS settings may also be used for client authentication. If `client_cert_secret_class` is set, the [SecretClass](https://docs.stackable.tech/home/nightly/secret-operator/secretclass) will be used to provision client certificates.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SET)
    @io.fabric8.generator.annotation.Nullable()
    private String clientCertSecretClass;

    public String getClientCertSecretClass() {
        return clientCertSecretClass;
    }

    public void setClientCertSecretClass(String clientCertSecretClass) {
        this.clientCertSecretClass = clientCertSecretClass;
    }
}

