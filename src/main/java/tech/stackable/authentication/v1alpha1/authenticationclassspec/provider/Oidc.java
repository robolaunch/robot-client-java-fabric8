package tech.stackable.authentication.v1alpha1.authenticationclassspec.provider;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"hostname","port","principalClaim","providerHint","rootPath","scopes","tls"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Oidc implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Hostname of the identity provider, e.g. `my.keycloak.corp`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("hostname")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Hostname of the identity provider, e.g. `my.keycloak.corp`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String hostname;

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    /**
     * Port of the identity provider. If TLS is used defaults to 443, otherwise to 80.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("port")
    @io.fabric8.generator.annotation.Min(0.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Port of the identity provider. If TLS is used defaults to 443, otherwise to 80.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SET)
    @io.fabric8.generator.annotation.Nullable()
    private Long port;

    public Long getPort() {
        return port;
    }

    public void setPort(Long port) {
        this.port = port;
    }

    /**
     * If a product extracts some sort of "effective user" that is represented by a string internally, this config determines with claim is used to extract that string. It is desirable to use `sub` in here (or some other stable identifier), but in many cases you might need to use `preferred_username` (e.g. in case of Keycloak) or a different claim instead.
     *
     * Please note that some products hard-coded the claim in their implementation, so some product operators might error out if the product hardcodes a different claim than configured here.
     *
     * We don't provide any default value, as there is no correct way of doing it that works in all setups. Most demos will probably use `preferred_username`, although `sub` being more desirable, but technically impossible with the current behavior of the products.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("principalClaim")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("If a product extracts some sort of \"effective user\" that is represented by a string internally, this config determines with claim is used to extract that string. It is desirable to use `sub` in here (or some other stable identifier), but in many cases you might need to use `preferred_username` (e.g. in case of Keycloak) or a different claim instead.\n\nPlease note that some products hard-coded the claim in their implementation, so some product operators might error out if the product hardcodes a different claim than configured here.\n\nWe don't provide any default value, as there is no correct way of doing it that works in all setups. Most demos will probably use `preferred_username`, although `sub` being more desirable, but technically impossible with the current behavior of the products.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String principalClaim;

    public String getPrincipalClaim() {
        return principalClaim;
    }

    public void setPrincipalClaim(String principalClaim) {
        this.principalClaim = principalClaim;
    }

    public enum ProviderHint {

        @com.fasterxml.jackson.annotation.JsonProperty("Keycloak")
        KEYCLOAK("Keycloak");

        java.lang.String value;

        ProviderHint(java.lang.String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public java.lang.String getValue() {
            return value;
        }
    }

    /**
     * This is a hint about which identity provider is used by the AuthenticationClass. Operators *can* opt to use this value to enable known quirks around OIDC / OAuth authentication. Not providing a hint means there is no hint and OIDC should be used as it is intended to be used (via the `.well-known` discovery).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("providerHint")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("This is a hint about which identity provider is used by the AuthenticationClass. Operators *can* opt to use this value to enable known quirks around OIDC / OAuth authentication. Not providing a hint means there is no hint and OIDC should be used as it is intended to be used (via the `.well-known` discovery).")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SET)
    @io.fabric8.generator.annotation.Nullable()
    private ProviderHint providerHint;

    public ProviderHint getProviderHint() {
        return providerHint;
    }

    public void setProviderHint(ProviderHint providerHint) {
        this.providerHint = providerHint;
    }

    /**
     * Root HTTP path of the identity provider. Defaults to `/`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("rootPath")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Root HTTP path of the identity provider. Defaults to `/`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String rootPath = "/";

    public String getRootPath() {
        return rootPath;
    }

    public void setRootPath(String rootPath) {
        this.rootPath = rootPath;
    }

    /**
     * Scopes to request from your identity provider. It is recommended to request the `openid`, `email`, and `profile` scopes.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("scopes")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Scopes to request from your identity provider. It is recommended to request the `openid`, `email`, and `profile` scopes.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> scopes;

    public java.util.List<String> getScopes() {
        return scopes;
    }

    public void setScopes(java.util.List<String> scopes) {
        this.scopes = scopes;
    }

    /**
     * Use a TLS connection. If not specified no TLS will be used.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tls")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Use a TLS connection. If not specified no TLS will be used.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SET)
    @io.fabric8.generator.annotation.Nullable()
    private tech.stackable.authentication.v1alpha1.authenticationclassspec.provider.oidc.Tls tls;

    public tech.stackable.authentication.v1alpha1.authenticationclassspec.provider.oidc.Tls getTls() {
        return tls;
    }

    public void setTls(tech.stackable.authentication.v1alpha1.authenticationclassspec.provider.oidc.Tls tls) {
        this.tls = tls;
    }
}

