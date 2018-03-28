/*
 * KeyVaultClient
 * The key vault client performs cryptographic key operations and vault operations against the Key Vault service.
 *
 * OpenAPI spec version: 2016-10-01
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.microsoft.identity.internal.test.keyvault.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * Management policy for a certificate.
 */
@ApiModel(description = "Management policy for a certificate.")

public class CertificatePolicy {
  @SerializedName("id")
  private String id = null;

  @SerializedName("key_props")
  private KeyProperties keyProps = null;

  @SerializedName("secret_props")
  private SecretProperties secretProps = null;

  @SerializedName("x509_props")
  private X509CertificateProperties x509Props = null;

  @SerializedName("lifetime_actions")
  private List<LifetimeAction> lifetimeActions = null;

  @SerializedName("issuer")
  private IssuerParameters issuer = null;

  @SerializedName("attributes")
  private CertificateAttributes attributes = null;

   /**
   * The certificate id.
   * @return id
  **/
  @ApiModelProperty(value = "The certificate id.")
  public String getId() {
    return id;
  }

  public CertificatePolicy keyProps(KeyProperties keyProps) {
    this.keyProps = keyProps;
    return this;
  }

   /**
   * Properties of the key backing a certificate.
   * @return keyProps
  **/
  @ApiModelProperty(value = "Properties of the key backing a certificate.")
  public KeyProperties getKeyProps() {
    return keyProps;
  }

  public void setKeyProps(KeyProperties keyProps) {
    this.keyProps = keyProps;
  }

  public CertificatePolicy secretProps(SecretProperties secretProps) {
    this.secretProps = secretProps;
    return this;
  }

   /**
   * Properties of the secret backing a certificate.
   * @return secretProps
  **/
  @ApiModelProperty(value = "Properties of the secret backing a certificate.")
  public SecretProperties getSecretProps() {
    return secretProps;
  }

  public void setSecretProps(SecretProperties secretProps) {
    this.secretProps = secretProps;
  }

  public CertificatePolicy x509Props(X509CertificateProperties x509Props) {
    this.x509Props = x509Props;
    return this;
  }

   /**
   * Properties of the X509 component of a certificate.
   * @return x509Props
  **/
  @ApiModelProperty(value = "Properties of the X509 component of a certificate.")
  public X509CertificateProperties getX509Props() {
    return x509Props;
  }

  public void setX509Props(X509CertificateProperties x509Props) {
    this.x509Props = x509Props;
  }

  public CertificatePolicy lifetimeActions(List<LifetimeAction> lifetimeActions) {
    this.lifetimeActions = lifetimeActions;
    return this;
  }

  public CertificatePolicy addLifetimeActionsItem(LifetimeAction lifetimeActionsItem) {
    if (this.lifetimeActions == null) {
      this.lifetimeActions = new ArrayList<LifetimeAction>();
    }
    this.lifetimeActions.add(lifetimeActionsItem);
    return this;
  }

   /**
   * Actions that will be performed by Key Vault over the lifetime of a certificate.
   * @return lifetimeActions
  **/
  @ApiModelProperty(value = "Actions that will be performed by Key Vault over the lifetime of a certificate.")
  public List<LifetimeAction> getLifetimeActions() {
    return lifetimeActions;
  }

  public void setLifetimeActions(List<LifetimeAction> lifetimeActions) {
    this.lifetimeActions = lifetimeActions;
  }

  public CertificatePolicy issuer(IssuerParameters issuer) {
    this.issuer = issuer;
    return this;
  }

   /**
   * Parameters for the issuer of the X509 component of a certificate.
   * @return issuer
  **/
  @ApiModelProperty(value = "Parameters for the issuer of the X509 component of a certificate.")
  public IssuerParameters getIssuer() {
    return issuer;
  }

  public void setIssuer(IssuerParameters issuer) {
    this.issuer = issuer;
  }

  public CertificatePolicy attributes(CertificateAttributes attributes) {
    this.attributes = attributes;
    return this;
  }

   /**
   * The certificate attributes.
   * @return attributes
  **/
  @ApiModelProperty(value = "The certificate attributes.")
  public CertificateAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(CertificateAttributes attributes) {
    this.attributes = attributes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CertificatePolicy certificatePolicy = (CertificatePolicy) o;
    return Objects.equals(this.id, certificatePolicy.id) &&
        Objects.equals(this.keyProps, certificatePolicy.keyProps) &&
        Objects.equals(this.secretProps, certificatePolicy.secretProps) &&
        Objects.equals(this.x509Props, certificatePolicy.x509Props) &&
        Objects.equals(this.lifetimeActions, certificatePolicy.lifetimeActions) &&
        Objects.equals(this.issuer, certificatePolicy.issuer) &&
        Objects.equals(this.attributes, certificatePolicy.attributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, keyProps, secretProps, x509Props, lifetimeActions, issuer, attributes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CertificatePolicy {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    keyProps: ").append(toIndentedString(keyProps)).append("\n");
    sb.append("    secretProps: ").append(toIndentedString(secretProps)).append("\n");
    sb.append("    x509Props: ").append(toIndentedString(x509Props)).append("\n");
    sb.append("    lifetimeActions: ").append(toIndentedString(lifetimeActions)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
